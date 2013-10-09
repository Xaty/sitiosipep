<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="img/favicon.PNG">

    <title>SIPEP Primer Empleo</title>

    <!-- Bootstrap core CSS -->
    <link href="${pageContext.request.contextPath}/recursos-web/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/jumbotron-narrow.css" rel="stylesheet">

    <link href="css/main.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="bootstrap-3.0.0/assets/js/html5shiv.js"></script>
      <script src="bootstrap-3.0.0/assets/js/respond.min.js"></script>
    <![endif]-->

     <script src="js/jquery-2.0.3.min.js"></script>
     <script src="js/main.js"></script>
  </head>

  <body>

    <div class="container">
      <div class="header">
        <ul class="nav nav-pills pull-right">
          <li class="active"><a href="C:\Users\LUIS\Desktop\sipep\index.html">Home</a></li>
	<!--
          <li><a href="#">Notificaciones</a></li>
          <li><a href="#">Perfil</a></li>
          <li><a href="#">Curriculum</a></li>
	-->
        </ul>
	<img src="img/sipep.png"/>
        <span class="text-muted titulo">Digitalizaci&oacuten de CV</span>
      </div>
	<div class="row marketing">
		<div class="col-lg-8">
		      <div id="jumbotron" class="jumbotron">
			<h2>SIPEP</h2>
			<p class="lead">
				El <b>Sistema de Integraci&oacuten al Primer Empleo Profesional</b>, 
				permite a los usuarios elaborar su
				curriculum vitae digitalizado, difundiendo de esta 
				forma la informaci&oacuten a las empresas vinculadas
				para apoyarte a obtener tu primer empleo
			</p>
			<p><a class="btn btn-lg btn-success" href="C:\Users\LUIS\Desktop\sipep\registro.html">Registrate!</a></p>
		      </div>
		</div>
		<div class="col-lg-4">
			<form role="form">
			  <div class="form-group">
			    <label for="exampleInputEmail1">Correo electr&oacutenico</label>
			    <input type="email" class="form-control" id="exampleInputEmail1" placeholder="tu@correo.com">
			  </div>
			  <div class="form-group">
			    <label for="exampleInputPassword1">Clave</label>
			    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="clave">
			  </div>
			  <div class="form-group">
			    <a href="">Olvidaste tu contrase&ntildea</a>
			  </div>
			  <div class="checkbox">
			    <label>
			      <input type="checkbox"> Recordar
			    </label>
			  </div>
			  <button type="submit" class="btn btn-default">Entrar</button>
			</form>

		</div>
	</div>

      <div class="row marketing">
        <div class="col-lg-8">
		<h4>
			<span class="glyphicon glyphicon-thumbs-up"></span>
			Beneficios
		</h4>

		<ul>
			<li>Digitalizaci&oacuten de Curriculums Vitaes</li>			
	          	<li>Ubicar al usuario a su primer empleo</li>
		</ul>

          	<h4>
			<span class="glyphicon glyphicon-user"></span>
			Tips de presentaci&oacuten
		</h4>
            <p>Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Cras mattis consectetur purus sit amet fermentum. <a href="C:\Users\LUIS\Desktop\sipep\tips.html">Ver m&aacute;s</a></p>

          	<h4>
			<span class="glyphicon glyphicon-briefcase"></span>
			Vinculacion empresarial
		</h4>
                <p>Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Cras mattis consectetur purus sit amet fermentum. <a href="C:\Users\LUIS\Desktop\sipep\listaEmpresas.html">Ver m&aacute;s</a></p>
        </div>

        <div class="col-lg-4">
		<img id="portafolio" class="img-rounded img-responsive" src="img/portafolio_cerrado.png"/>
        </div>
      </div>

      <div class="footer">
        <p>Todos los derechos reservados de &copy; SIPEP 2013 - Sistema de Integraci&oacuten al Primer Empleo</p>
      </div>

    </div> <!-- /container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
  </body>
</html>
