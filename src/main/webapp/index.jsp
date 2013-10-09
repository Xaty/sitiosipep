<!DOCTYPE html>
<html>
<head>
<title>sipep</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link
	href="${pageContext.request.contextPath}/recursos-web/bootstrap/css/bootstrap.min.css"
	rel="stylesheet" media="screen">
</head>
<body>

	<div class="container">
		<h1>Pantallas del proyecto</h1>

		<dl class="dl-horizontal">

			<dt>Pantalla 1 - Inicio</dt>
			<dd>
				Esta pantalla muestra el inicio del sitio web <br /><a
				href="${pageContext.request.contextPath}/web/public/index">/public/index - GET</a>
			</dd>

			<dt>Pantalla 2 - Tips</dt>
			<dd>
				Esta pantalla muestra los tips <br /><a
				href="${pageContext.request.contextPath}/web/public/tips">/public/tips - GET</a>
			</dd>

		<h3>Pantallas Egresados</h3>

			<dt>Pantalla 3 - Competencias Pofesionales</dt>
			<dd>
				Esta pantalla muestra las competencias profesionales <br /><a
				href="${pageContext.request.contextPath}/web/egresado/competencias-profesionales">/egresados/competencias-profesionales	- GET</a>
			</dd>
			
			<dt>Pantalla 4 - Contactanos</dt>
			<dd>
				Esta pantalla muestra datos de contacto <br /><a
				href="${pageContext.request.contextPath}/web/egresado/contactanos">/egresados/contactanos - GET</a>
			</dd>
			
			<dt>Pantalla 5 - Cursos</dt>
			<dd>
				Esta pantalla muestra el formulario para capturar cursos. <br /><a
				href="${pageContext.request.contextPath}/web/egresado/cursos">/egresados/cursos	- GET</a>
			</dd>
			
			<dt>Pantalla 6 - Experiencia</dt>
			<dd>
				Esta pantalla muestra el formulario para capturar datos de experiencia profesional. <br /><a
				href="${pageContext.request.contextPath}/web/egresado/experiencia">/egresados/experiencia - GET</a>
			</dd>
			
			<dt>Pantalla 7 - Formacion</dt>
			<dd>
				Esta pantalla muestra el formulario para capturar datos de formacion academica. <br /><a
				href="${pageContext.request.contextPath}/web/egresado/formacion">/egresados/formacion - GET</a>
			</dd>
			
			<dt>Pantalla 8 - Idiomas</dt>
			<dd>
				Esta pantalla muestra el formulario para capturar idiomas. <br /><a
				href="${pageContext.request.contextPath}/web/egresado/idiomas">/egresados/idiomas - GET</a>
			</dd>
			
			<dt>Pantalla 9 - Informacion Empresa</dt>
			<dd>
				Esta pantalla muestra los datos sobre informacion de empresa. <br /><a
				href="${pageContext.request.contextPath}/web/egresado/informacion-empresa">/egresados/informacion-empresa - GET</a>
			</dd>
			
			<dt>Pantalla 10 - Lista de Empresa</dt>
			<dd>
				Esta pantalla muestra una lista sobre las empresas. <br /><a
				href="${pageContext.request.contextPath}/web/egresado/lista-empresas">/egresados/lista-empresa - GET</a>
			</dd>
			
			<dt>Pantalla 11 - Perfil</dt>
			<dd>
				Esta pantalla muestra el perfil del egresado. <br /><a
				href="${pageContext.request.contextPath}/web/egresado/perfil">/egresados/perfil - GET</a>
			<dd>
			
			<dt>Pantalla 12 - Registro</dt>
			<dd>
				Esta pantalla muestra el formulario. <br /><a
				href="${pageContext.request.contextPath}/web/egresado/registro">/egresados/registro	- GET</a>
			</dd>
			
		<h3>Pantallas Administrador</h3>
			
			<dt>Pantalla 13 - Alta a empresas</dt>
			<dd>
				Esta pantalla muestra el formulario que permite dar de alta una empresa <br /><a
				href="${pageContext.request.contextPath}/web/administrador/alta-empresa">/administrador/alta-empresa - GET</a>
			</dd>

			<dt>Pantalla 14 - Asignar ofertas</dt>
			<dd>
				Esta pantalla muestra el formulario que permite asignar una oferta <br /><a
				href="${pageContext.request.contextPath}/web/administrador/asignar-oferta">/administrador/asignar-oferta - GET</a>
			</dd>

			<dt>Pantalla 15 - Envio de ofertas laborales</dt>
			<dd>
				Esta pantalla muestra el formulario que permite enviar las ofertas <br /><a
				href="${pageContext.request.contextPath}/web/administrador/envio-ofertas-laborales">/administrador/envio-ofertas-laborales - GET</a>
			</dd>

			<dt>Pantalla 16 - Alta ofertas</dt>
			<dd>
				Esta pantalla muestra el formulario que permite dar de alta una empresa <br /><a
				href="${pageContext.request.contextPath}/web/administrador/subir-oferta">/administrador/subir-oferta - GET</a>
			</dd>
		</dl>
	</div>
	<script
		src="${pageContext.request.contextPath}/recursos-web/jquery/jquery-1.8.3.js"></script>
</body>
</html>
