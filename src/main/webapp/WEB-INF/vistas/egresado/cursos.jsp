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
      <h3 align="center">Cursos</h3>

      <div class="row marketing">
        <div class="col-lg-12">
		<!-- formulario -->
						<form:form class="form-horizontal" modelAttribute="formCurso" action="cursos" role="form">
							<div class="form-group">
								 <label class="col-lg-3 control-label" >Periodo del curso:</label>
								  <div class="col-lg-8">
								  <form:input type="text" class="form-control" id="exampleAñoI" placeholder="Ejemplo: 2009 - 2012" path="periodo"/>
								  
								  <spring:hasBindErrors name="formCurso">
								  		<form:errors path="periodo"/>
								  </spring:hasBindErrors>
								  
								  </div>
							</div>
					<div class="form-group">
								 <label class="col-lg-3 control-label" >Institucion:</label>
								  <div class="col-lg-8">		
										
											<form:input type="text" class="form-control" id="institusion" path="institucion"/>
											<spring:hasBindErrors name="formCurso">
								  				<form:errors path="institucion"/>
								  			</spring:hasBindErrors>
									</div>
				  </div>
							<div class="form-group">
								<label class="col-lg-3 control-label" >Nombre de Capacitación:</label>
							<div class="col-lg-8">
								<form:input type="text" class="form-control" id="exampleInputPassword1" path="capacitacion"/>
									<spring:hasBindErrors name="formCurso">
								  		<form:errors path="capacitacion"/>
								  </spring:hasBindErrors>
							</div>
							</div>
                                                    <div>
                                                        <button type="button" class="btn btn-info">+</button>
                                                    </div>
								
				 
				 <div class="col-lg-10" align="center">
					  <button type="submit" class="btn btn-default">Guardar</button>
					  <button type="submit" class="btn btn-default">Cancelar</button>
				  </div>
				</form:form>

        </div>
      </div>
	  
	  <br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>

      <div class="footer" align="center">
        <p>Todos los derechos reservados de &copy; SIPEP 2013 - Sistema de Integraci&oacuten al Primer Empleo</p>
      </div>

    </div> <!-- /container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
  </body>
</html>
