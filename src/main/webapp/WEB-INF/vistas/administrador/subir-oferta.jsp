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
            <form:form class="form-horizontal" modelAttribute="formOferta" action="subir-oferta" role="form">
                <div class="form-group">
                    <label class="col-lg-3 control-label">Nombre:</label>
                    <div class="col-lg-8">
                      <form:input type="text" class="form-control" placeholder="nombre de la oferta" path="nombreOferta"/>
                      <spring:hasBindErrors name="formOferta">
                      		<form:errors path="nombreOferta"/>
                      </spring:hasBindErrors>
                    </div>
               </div>
                    
		<div class="form-group">
                      <label class="col-lg-3 control-label">Nombre de la empresa:</label>
                      <div class="col-lg-8">
		    		<form:input type="text" class="form-control" path="nombreEmpresa"/>
		    		<spring:hasBindErrors name="formOferta">
                      		<form:errors path="nombreEmpresa"/>
                      </spring:hasBindErrors>
                    </div>
		  </div>
                    
		  <div class="form-group">
                      <label class="col-lg-3 control-label">Informaci&oacute;n de la oferta:</label>
                      <div class="col-lg-8">
                      <form:textarea class="form-control" rows="3" path="informacion"></form:textarea>
                      <spring:hasBindErrors name="formOferta">
                      		<form:errors path="informacion"/>
                      </spring:hasBindErrors>
                      </div>
		  </div>
                    
                  <div class="form-group">
                      <label class="col-lg-3 control-label">Requisitos a cubrir:</label>
                      <div class="col-lg-8">
                    <form:textarea class="form-control" rows="3" path="requisitos"></form:textarea>
                    <spring:hasBindErrors name="formOferta">
                      		<form:errors path="requisitos"/>
                      </spring:hasBindErrors>
                    </div>
		  </div>
		  <div class="form-group">
		  		<label class="col-lg-3 control-label">&Aacute;rea</label>
		  		<div class="col-lg-8">
		  			<form:select class="form-control" path="area">
		  				<form:options items="${area}"></form:options>
		  			</form:select>
		  		</div>
		  </div>

                    <div class="form-group">
                        <label class="col-lg-3 control-label">Fecha:</label>
                        <div class="col-lg-9">
                            <label class="col-lg-1 control-label">D&iacute;a</label>
                            <div class="col-lg-2">
                    <form:select class="form-control" path="dia">
                            <form:options items="${dia}"></form:options>
                    </form:select>
                            </div>
                            <label class="col-lg-1 control-label">Mes</label>
                            <div class="col-lg-2">
                    <form:select class="form-control" path="mes">
                        <form:options items="${mes}"></form:options>
                    </form:select>
                            </div>
                            <label class="col-lg-1 control-label">A&ntilde;o:</label>
                            <div class="col-lg-2">
                    <form:select class="form-control" path="anio">
                        <form:options items="${anio}"></form:options>
                    </form:select>
                            </div>
                    </div>
		  </div>
                    
                    <div align="center">
                        <br>
                        <input type="submit" class="btn btn-default" value="Guardar"/>
                        <input type="submit" class="btn btn-default" value="Cancelar"/>
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
