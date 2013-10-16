drop database sipep;
create database if not exists sipep;

use sipep;

create table sexo(
	sexo varchar(1) not null
);

create table estatus(
	estatus varchar(8) not null
);

create table egresado(
	id_egresado varchar(10) not null,
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
	fotografia longblob
);

create table curso(
	id_curso int primary key not null,
	nombre_capacitacion varchar(20) not null,
	institucion varchar(30) not null,
	periodo_curso varchar(15) not null,
	id_curriculum int,
	foreign key (id_curriculum) references curriculum(id_curriculum)
);

create table formacion_academica(
	id_formacion int primary key,
	nombre_institucion varchar(30) not null,
	carrera varchar(20) not null,
	especialidad varchar(20)
);

create table idioma(
	id_idioma int primary key,
	idioma varchar(10) not null,
	nivel varchar(10) not null
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

create table usuario(
	id_usuario int primary key,
	usuario varchar(15) not null,
	clave varchar(15) not null,
	rol varchar(5) not null
);

create table rol(
	rol int
);

create table curriculum(
	id_curriculum int,
	habilidades varchar(50) not null,
	id_formacion int not null,
	id_curso int not null,
	id_idioma int not null,
	primary key (id_curriculum),
	foreign key (id_formacion) references formacion_academica(id_formacion),
	foreign key (id_curso) references curso(id_curso),
	foreign key (id_idioma) references idioma(id_idioma)
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
	foreign key (id_curriculum) references curriculum(id_curriculum)
);