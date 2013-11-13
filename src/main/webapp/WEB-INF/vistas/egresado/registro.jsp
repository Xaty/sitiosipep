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

          <!--li><a href="#">Notificaciones</a></li>
          <li><a href="#">Perfil</a></li>
          <li><a href="#">Curriculum</a></li-->

        </ul>
	<img src="img/sipep.png"/>
        <span class="text-muted titulo">Digitalizaci&oacuten de CV</span>
      </div>

      <!-- titulo de formulario -->
      <h3 align="center">Registro para nuevo usuario</h3>

      <div class="row marketing">
        <div class="col-lg-12">
            <form:form class="form-horizontal" role="form" 
            	modelAttribute="formEgresado" 
            	action="guardar-egresado" method="post">
                <div class="form-group">
                      <label class="col-lg-3 control-label">Nombre:</label>
                     <div class="col-lg-8">
		    		  	<form:input type="text" class="form-control" path="nombre"/>
		    		  	
		    		  	<spring:hasBindErrors name="formEgresado">
		    		  		<form:errors path="nombre"/>
		    		  	</spring:hasBindErrors>
		    		  	
		    		  	
                	</div>
		  		</div>
		  <div class="form-group">
                      <label class="col-lg-3 control-label">Apellido paterno:</label>
                      <div class="col-lg-8">
		    <form:input type="text" class="form-control" path="apellidoPaterno"/>
		    			
		    			<spring:hasBindErrors name="formEgresado">
		    		  		<form:errors path="apellidoPaterno"/>
		    		  	</spring:hasBindErrors>
		    			
                      </div>
		  </div>
		  <div class="form-group">
                      <label class="col-lg-3 control-label">Apellido materno:</label>
                      <div class="col-lg-8">
		    <form:input type="text" class="form-control" path="apellidoMaterno"/>
		    			
		    			<spring:hasBindErrors name="formEgresado">
		    		  		<form:errors path="apellidoMaterno"/>
		    		  	</spring:hasBindErrors>
		    			
                    </div>
		  </div>
               
                  <div class="form-group">
                      <label class="col-lg-3 control-label">Fecha de nacimiento:</label>
                      <div class="col-lg-9">
                      <label class="col-lg-1 control-label">D&iacute;a:</label>
                      <div class="col-lg-2">
                    <form:select class="form-control" path="dia">
                            
                    </form:select>
                          </div>
                    <label class="col-lg-1 control-label">Mes:</label>
                    <div class="col-lg-2">
                    <form:select class="form-control" path="mes">
                 
                    </form:select>
                    </div>
                    <label class="col-lg-1 control-label">A&ntilde;o:</label>
                    <div class="col-lg-2">
                    <form:select class="form-control" path="anio">
                      
                    </form:select>
                    </div>
                      </div>
		  </div>
                   
          <div class="form-group">
                      <label class="col-lg-3 control-label">Sexo:</label>
                      <div class="col-lg-8">
                        <div class="radio">
                          <label>
                            <input type="radio" name="optionsRadios" id="masculino" value="option1" checked>
                            Masculino
                          </label>
                        </div>
                        <div class="radio">
                          <label>
                            <input type="radio" name="optionsRadios" id="femenino" value="option2"/>
                            Femenino
                          </label>
                        </div>
                      </div>
		  </div>
                    
                  <div class="form-group">
                      <label class="col-lg-3 control-label">Correo:</label>
                      <div class="col-lg-8">
                      
                    <form:input type="text" class="form-control" placeholder="tu@correo.com" path="correo"/>
		    		  	<spring:hasBindErrors name="formEgresado">
		    		  		<form:errors path="correo"/>
		    		  	</spring:hasBindErrors>
		    		  	                    
                      </div>
                      </div>
                <div class="form-group">
                    <label class="col-lg-3 control-label">Clave:</label>
                    <div class="col-lg-8">
                        <form:input type="password" class="form-control" path="clave"/>
                        
                        <spring:hasBindErrors name="formEgresado">
		    		  		<form:errors path="clave"/>
		    		  	</spring:hasBindErrors>
                        
                    </div>
                    </div>
                
                <div class="form-group">
                        <label class="col-lg-3 control-label">Confirmar clave:</label>
                        <div class="col-lg-8">
                        <input type="password" class="form-control"/>
                        </div>
                    </div>
                <div class="form-group">
                    <div class="checkbox">
                        <input type="checkbox"/>
                        <a href="" target="blank">Ac&eacute;pto Terminos y Condiciones</a>
                    
                    <spring:hasBindErrors name="formEgresado">
		    		  		<form:errors path="clave"/>
		    		  	</spring:hasBindErrors>
                    
                    </div>
                </div>
                
                    <div align="center">
                        <input class="btn btn-default" type="submit" value="Crear">
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
