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

          <li><a href="#">Notificaciones</a></li>
          <li><a href="#">Perfil</a></li>
          <li><a href="#">Curriculum</a></li>

        </ul>
	<img src="img/sipep.png"/>
        <span class="text-muted titulo">Digitalizaci&oacuten de CV</span>
      </div>

      <!-- titulo de formulario -->
      <h3 align="center">Alta de oferta</h3>

      <div class="row marketing">
        <div class="col-lg-12">
		<form role="form-horizontal">
		  <div>
                      <label>Nombre:</label>
                      <input type="text" class="form-control" placeholder="nombre de la oferta"/>
		  </div>
                    
		  <div class="form-group">
		    <label>Nombre de la empresa:</label>
		    <input type="text" class="form-control"/>
		  </div>
                    
		  <div class="form-group">
                      <label>Informaci&oacute;n de la oferta:</label>
                      <textarea class="form-control" rows="3"></textarea>
		  </div>
                    
                  <div class="form-group">
		    <label>Requisitos a cubrir:</label>
                    <textarea class="form-control" rows="3"></textarea>
		  </div>
                    
                    <div class="form-group">
                      <label>Fecha de nacimiento:</label><br/>
                    <label>D&iacute;a</label>
                    <select class="form-control">
                            <option>01</option>
                            <option>02</option>
                            <option>03</option>
                            <option>04</option>
                            <option>05</option>
                            <option>06</option>
                            <option>07</option>
                            
                            
                    </select>
                    <label>Mes</label>
                    <select class="form-control">
                        <option>Enero</option>
                        <option>Febrero</option>
                        <option>Marzo</option>
                        <option>Abril</option>
                    </select>
                    <label>A&ntilde;o</label>
                    <select class="form-control">
                        <option>1980</option>
                        <option>1981</option>
                        <option>1982</option>
                        <option>1983</option>
                        <option>1984</option>
                    </select>
		  </div>
                    
                    <div align="center" class="checkbox">
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
