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
          <li class="active"><a href="C:\Users\LUIS\Desktop\sipep\index.html">Home</a></li>

          <li><a href="C:\Users\LUIS\Desktop\sipep\listaempresas.html">Notificaciones</a></li>
          <li><a href="C:\Users\LUIS\Desktop\sipep\perfil.html">Perfil</a></li>
          <li><a>Curriculum</a>
              <ul>
                  <li><a href="C:\Users\LUIS\Desktop\sipep\formacion.html">Formaci&oacute;n acad&eacute;mica</a></li>
                  <li><a href="C:\Users\LUIS\Desktop\sipep\experiencia.html">Experiencia</a></li>
                  <li><a href="C:\Users\LUIS\Desktop\sipep\cursos.html">Cursos</a></li>
                  <li><a href="C:\Users\LUIS\Desktop\sipep\competenciasPro.html">Competencias</a></li>
                  <li><a href="C:\Users\LUIS\Desktop\sipep\idiomas.html">Idiomas</a></li>
              </ul>
          </li>

        </ul>
	<img src="img/sipep.png"/>
        <span class="text-muted titulo">Digitalizaci&oacuten de CV</span>
      </div>

      <!-- titulo de formulario -->
      <h3 align="center">Experiencia</h3>
      <div class="row marketing">
	  
        <div class="col-lg-12">		
		
		<form  class="form-horizontal" role="form">
		  
		  <div class="form-group">
		   	<label class="col-lg-3 control-label">Periodo Laboral:</label>
				<div class="col-lg-8">
					<input type="txt" class="form-control" id="txtPeriodoLaoral"placeholder="Ejemplo: 1990-2003">
			 </div>	
		  </div>
		  
		<div class="form-group">
			<label class="col-lg-3 control-label">Nombre de la Empresa:</label>
				<div class="col-lg-8">
					<input type="txt"  class="form-control" id="txtNomEpresa">
				</div>
		</div>
		 
		<div class="form-group">
		  	<label class="col-lg-3 control-label">Dirección:</label>
				<div class="col-lg-8">
					<input type="txt" class="form-control" id="txtDirEmpresa">
				</div>
		</div>
		  
		  <div class="form-group">
		  	<label class="col-lg-3 control-label">Puesto Desempeñado:</label>
				<div class="col-lg-8">
					<input type="txt" class="form-control" id="txtPuestDese">
				</div>
		  </div>
		  
		  <div class="form-group">
			<label class="col-lg-3 control-label">Funciones:</label>
				<div class="col-lg-8" >
					<textarea type="txt" class="form-control" id="txtFun" rows=4></textarea>
				</div>  
		 </div>
		  
		 <div class="form-group">			
				<label class="col-lg-3 control-label">Logros:</label>
					<div class="col-lg-8">
						<textarea class="form-control" id="txtLogros" rows=4></textarea>
					</div>
		  </div>
		
		 <div align="center">
			
				<br/>
				<button type="submit" class="btn btn-default">Guardar</button>
				<button type="submit" class="btn btn-default">Actualizar</button>
				<button type="submit" class="btn btn-default">Cancelar</button>
			
		  </div>
			  
		</form>


        </div>
      </div>

      <div class="footer" align="center">
        <p>Todos los derechos reservados de &copy; SIPEP 2013 - Sistema de Integraci&oacuten al Primer Empleo</p>
      </div>

    </div> <!-- /container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
  </body>
</html>
