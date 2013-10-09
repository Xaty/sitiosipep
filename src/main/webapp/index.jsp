<!DOCTYPE html>
<html>
<head>
	<title>sipep</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link href="${pageContext.request.contextPath}/recursos-web/bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
</head>
<body>

	<div class="container">
		<h1>Pantallas del proyecto</h1>
		
		<dl class="dl-horizontal">
			
			<dt>Pantalla 1 - Inicio</dt>
			<dd>
				Esta pantalla muestra el inicio del sitio web
				<br/>
				<a href="${pageContext.request.contextPath}/web/public/index">/public/index - GET</a>
			</dd>
			
			<dt>Pantalla 2 - Tips</dt>
			<dd>
				Esta pantalla muestra los tips
				<br/>
				<a href="${pageContext.request.contextPath}/web/public/tips">/public/tips - GET</a>
			</dd>
			
			<dt>Pantalla  Egresado</dt>
			<dd>
				Pantallas egresados
				<br/>
				<a href="${pageContext.request.contextPath}/web/egresado/competencias-profesionales">/public/competencias-profesionales - GET</a>
				<a href="${pageContext.request.contextPath}/web/public/egresado/contactanos">/public/contactanos - GET</a>
				<a href="${pageContext.request.contextPath}/web/egresado/cursos">/egresados/cursos - GET</a>
				<a href="${pageContext.request.contextPath}/web/public/experiencia">/public/experiencia - GET</a>
				<a href="${pageContext.request.contextPath}/web/public/formacion">/public/formacion - GET</a>
				<a href="${pageContext.request.contextPath}/web/public/idiomas">/public/idiomas - GET</a>
				<a href="${pageContext.request.contextPath}/web/public/informacion-empresa">/public/informacion-empresa - GET</a>
				<a href="${pageContext.request.contextPath}/web/public/lista-empresa">/public/lista-empresa - GET</a>
				<a href="${pageContext.request.contextPath}/web/public/perfil">/public/perfil - GET</a>
				<a href="${pageContext.request.contextPath}/web/public/registro">/public/registro - GET</a>
			</dd>
						
		</dl>

	</div>
	
	<script
		src="${pageContext.request.contextPath}/recursos-web/jquery/jquery-1.8.3.js"></script>
</body>
</html>
