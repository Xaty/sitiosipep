<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
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
		
		<form:form  class="form-horizontal" modelAttribute="formExperiencia" action="experiencia" role="form" method="post">
		  
		  <div class="form-group">
		   	<label class="col-lg-3 control-label">Periodo Laboral:</label>
				<div class="col-lg-8">
					<form:input type="text" class="form-control" id="txtPeriodoLaoral" placeholder="Ejemplo: 1990-2003" path="periodo"/>
						<spring:hasBindErrors name="formExperiencia">
							<form:errors path="periodo"/>
						</spring:hasBindErrors>
			 </div>	
		  </div>
		  
		<div class="form-group">
			<label class="col-lg-3 control-label">Nombre de la Empresa:</label>
				<div class="col-lg-8">
					<form:input type="text" class="form-control" id="txtNomEpresa" path="nombre"/>
						<spring:hasBindErrors name="formExperiencia">
							<form:errors path="nombre"/>
						</spring:hasBindErrors>
				</div>
		</div>
		 
		<div class="form-group">
		  	<label class="col-lg-3 control-label">Dirección:</label>
				<div class="col-lg-8">
					<form:input type="text" class="form-control" id="txtDirEmpresa" path="direccion"/>
						<spring:hasBindErrors name="formExperiencia">
							<form:errors path="direccion"/>
						</spring:hasBindErrors>
				</div>
		</div>
		  
		  <div class="form-group">
		  	<label class="col-lg-3 control-label">Puesto Desempeñado:</label>
				<div class="col-lg-8">
					<form:input type="text" class="form-control" id="txtPuestDese" path="puesto"/>
						<spring:hasBindErrors name="formExperiencia">
							<form:errors path="puesto"/>
						</spring:hasBindErrors>
				</div>
		  </div>
		  
		  <div class="form-group">
			<label class="col-lg-3 control-label">Funciones:</label>
				<div class="col-lg-8" >
					<form:textarea class="form-control" id="txtFun" rows="4" path="funciones"></form:textarea>
						<spring:hasBindErrors name="formExperiencia">
							<form:errors path="funciones"/>
						</spring:hasBindErrors>
				</div>  
		 </div>
		  
		 <div class="form-group">			
				<label class="col-lg-3 control-label">Logros:</label>
					<div class="col-lg-8">
						<form:textarea class="form-control" id="txtLogros" rows="4" path="logros"/>
							<spring:hasBindErrors name="formExperiencia">
							<form:errors path="logros"/>
						</spring:hasBindErrors>
					</div>
		  </div>
		
		 <div align="center">
			
				<br/>
				<button type="submit" class="btn btn-default">Guardar</button>
				<button type="submit" class="btn btn-default">Actualizar</button>
				<button type="submit" class="btn btn-default">Cancelar</button>
			
		  </div>
			  
		</form:form>


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
