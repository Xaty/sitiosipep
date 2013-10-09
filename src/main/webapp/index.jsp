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
						
			<dt>Pantalla 12 - Alta a empresas</dt>
			<dd>
				Esta pantalla muestra el formulario que permite dar de alta una empresa
				<br/>
				<a href="${pageContext.request.contextPath}/web/administrador/alta-empresa">/public/tips - GET</a>
			</dd>			

			<dt>Pantalla 13 - Asignar ofertas</dt>
			<dd>
				Esta pantalla muestra el formulario que permite asignar una oferta
				<br/>
				<a href="${pageContext.request.contextPath}/web/administrador/asignar-oferta">/public/tips - GET</a>
			</dd>			
			
			<dt>Pantalla 14 - Envio de ofertas laborales</dt>
			<dd>
				Esta pantalla muestra el formulario que permite enviar las ofertas 
				<br/>
				<a href="${pageContext.request.contextPath}/web/public/administrador/envio-ofertas-laborales">/public/tips - GET</a>
			</dd>			
					
			<dt>Pantalla 15 - Alta ofertas</dt>
			<dd>
				Esta pantalla muestra el formulario que permite dar de alta una empresa
				<br/>
				<a href="${pageContext.request.contextPath}/web/public/administrador/subir-oferta">/public/tips - GET</a>
			</dd>			
		</dl>

	</div>
	
	<script
		src="${pageContext.request.contextPath}/recursos-web/jquery/jquery-1.8.3.js"></script>
</body>
</html>
