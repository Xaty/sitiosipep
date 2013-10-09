<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="img/favicon.png">

    <title>SIPEP Primer Empleo</title>

    <!-- Bootstrap core CSS -->
    <link href="${pageContext.request.contextPath}/recursos-web/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${pageContext.request.contextPath}/recursos-web/css/jumbotron-narrow.css" rel="stylesheet">

    <link href="${pageContext.request.contextPath}/recursos-web/css/main.css" rel="stylesheet">

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
          <li class="active"><a href="#">Home</a></li>

          <!--li><a href="#">Notificaciones</a></li>
          <li><a href="#">Perfil</a></li>
          <li><a href="#">Curriculum</a></li-->

        </ul>
	<img src="img/sipep.png"/>
        <span class="text-muted titulo">Digitalizaci&oacuten de CV</span>
      </div>

      <!-- titulo de formulario -->
      <h3 align="center">Alta de empresa</h3>

      <div class="row marketing">
        <div class="col-lg-12">
            <form class="form-horizontal" role="form">
                <div class="form-group">
                    <label class="col-lg-3 control-label">Nombre:</label>
                    <div class="col-lg-8">
		    <input type="text" class="form-control"/>
                    </div>
		  </div>
                    
		  <div class="form-group">
                      <label class="col-lg-3 control-label">Giro:</label>
                        <div class="col-lg-8">
                            <input type="text" class="form-control"/>
                        </div>
		  </div>
                    
                <div class="form-group">
                      <label class="col-lg-3 control-label">Clasificaci&oacute;n:</label>
                        <div class="col-lg-8">
                            <input type="text" class="form-control"/>
                        </div>
                  </div>
                    
		  <div class="form-group">
                      <label class="col-lg-3 control-label">Direcci&oacute;n:</label>
                        <div class="col-lg-8">
                            <input type="text" class="form-control"/>
                        </div>
		  </div>
                    
                  <div class="form-group">
                      <label class="col-lg-3 control-label">Correo:</label>
                      <div class="col-lg-8">
                            <input type="text" class="form-control" placeholder="tu@correo.com"/>
                      </div>
		  </div>
                    
                    <div class="form-group">
                        <label class="col-lg-3 control-label" for="exampleInputPassword1">URL:</label>
                        <div class="col-lg-8">
                            <input type="password" class="form-control" id="exampleInputPassword1" placeholder="www.mipagina.com">
                        </div>
                    </div>
                    
                    <div align="center">
                        <br>
                        <input type="button" class="btn btn-default" value="Guardar"/>
                        <input type="button" class="btn btn-default" value="Cancelar"/>
                    </div>
		</form>


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
