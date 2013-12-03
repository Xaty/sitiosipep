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

    <title>SIPEP Primer Empleo Profesional</title>

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
          <li class="active"><a href="/sipep">Home</a></li>

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
	<img src="sipep.png"/>
        <span class="text-muted titulo">Digitalizaci&oacuten de CV</span>
      </div>

      <!-- titulo de formulario -->
      <h3 align="center">Perfil</h3>

      <div class="row marketing">
        <div class="col-lg-12">
		<form:form class="form-horizontal" modelAttribute="formPerfil" action="perfil" role="form" method="post">
                    <div class="form-group">
                        <label class="col-lg-3 control-label">Direcci&oacute;n</label>
                    </div>
                    <div class="form-group">
                        <label class="col-lg-3 control-label">Calle:</label>
                        <div class="col-lg-8">
                        <form:input type="text" class="form-control" path="calle"/>
                        <spring:hasBindErrors name="formPerfil">
                        	<form:errors path="calle"/>
                        </spring:hasBindErrors>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-lg-3 control-label">Colonia:</label>
                        <div class="col-lg-8">
                        <form:input type="text" class="form-control" path="colonia"/>
                        <spring:hasBindErrors name="formPerfil">
                        	<form:errors path="colonia"/>
                        </spring:hasBindErrors>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-lg-3 control-label">Municipio o comunidad:</label>
                        <div class="col-lg-8">
                        <form:input type="text" class="form-control" path="municipio"/>
                        <spring:hasBindErrors name="formPerfil">
                        	<form:errors path="municipio"/>
                        </spring:hasBindErrors>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-lg-3 control-label">Estado:</label>
                        <div class="col-lg-8">
                        <form:input type="text" class="form-control" path="estado"/>
                        <spring:hasBindErrors name="formPerfil">
                        	<form:errors path="estado"/>
                        </spring:hasBindErrors>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-lg-3 control-label">C.P.:</label>
                        <div class="col-lg-8">
                        <form:input type="text" class="form-control" path="cp"/>
                        <spring:hasBindErrors name="formPerfil">
                        	<form:errors path="cp"/>
                        </spring:hasBindErrors>
                        </div>
                    </div>
                    
                    <div align="center">
                        <br>
                        <input class="btn btn-default" type="submit" value="Actualizar">
                        <input class="btn btn-default" type="submit" value="Cancelar">
                    </div>
		  
		</form:form>


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
