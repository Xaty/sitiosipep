drop database sipep;
create database if not exists sipep;

use sipep;

create table usuario(
	id_usuario int primary key,
	usuario varchar(15) not null,
	clave varchar(15) not null,
	rol varchar(5) not null
);

create table egresado(
	id_egresado int,
	nombre varchar(30) not null,
	apellido_paterno varchar(30) not null,
	apellido_materno varchar(30) not null,
	curp varchar(18),
	correo varchar(30) not null,
	sexo varchar(1),
	estatus varchar(8),
	direccion varchar(50),
	fNacimiento date,
	cedulaProfesional varchar(10),
	fotografia longblob,
	primary key (id_egresado),
	id_usuario int,
	foreign key (id_usuario) references usuario(id_usuario) on delete cascade
);


create table empresa(
	id_empresa int primary key,
	nombre varchar(30) not null,
	giro varchar(10) not null,
	clasificacion varchar(15) not null,
	email varchar(30) not null,
	direccion varchar(30) not null,
	logotipo longblob
);

create table oferta(
	id_oferta int primary key,
	nombre varchar(30) not null,
	area varchar(20) not null,
	fecha date,
	descripcion varchar(50) not null,
	requisitos varchar(50) not null,
	empresa varchar(30)
);

create table rol(
	rol int
);

create table curriculum(
	id_curriculum int,
	habilidades varchar(50) not null,
	primary key (id_curriculum),
	id_egresado int,
	foreign key (id_egresado) references egresado(id_egresado) on delete cascade
);

create table experiencia(
	id_experiencia int primary key,
	nombre_Empresa varchar(30) not null,
	direccion varchar(50) not null,
	puesto varchar(20) not null,
	duracion varchar(20) not null,
	funciones varchar(50),
	logros varchar(60),
	id_curriculum int,
	foreign key (id_curriculum) references curriculum(id_curriculum) on delete cascade
);

create table curso(
	id_curso int primary key not null,
	nombre_capacitacion varchar(20) not null,
	institucion varchar(30) not null,
	periodo_curso varchar(15) not null,
	id_curriculum int,
	foreign key (id_curriculum) references curriculum(id_curriculum) on delete cascade
);


create table formacion_academica(
	id_formacion int primary key,
	nombre_institucion varchar(30) not null,
	carrera varchar(20) not null,
	especialidad varchar(20),
	id_curriculum int,
	foreign key (id_curriculum) references curriculum(id_curriculum) on delete cascade
);

create table idioma(
	id_idioma int primary key,
	idioma varchar(10) not null,
	nivel varchar(10) not null,
	id_curriculum int,
	foreign key (id_curriculum) references curriculum(id_curriculum) on delete cascade
);

insert into usuario
values ('001','ur','erer','des');

insert into egresado
values ('1234','uriel','pastor','mendoza','ppoier123','uri@hotmail.com','M','A','hidalgo','1991-09-22','erge23425',NULL,'001');

insert into empresa
values ('123','Google','DesaSoft','macro','google@gmail.com','USA',NULL);

insert into oferta
values ('345','dfsde','ddgt','1991-09-05','sdfert','dfre','sfe');

insert into curriculum
values ('01','perioeierertor','1234');

insert into curso
values ('0001','desa','utvm','abril-mayo','01');

insert into idioma
values ('012','frances','basic','01');

select * from curriculum where id_egresado="1234";

delete from usuario where id_usuario = "001";

select * from egresado;
