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
            <form class="form-horizontal" role="form">
                <div class="form-group">
                    <label class="col-lg-3 control-label">Nombre:</label>
                    <div class="col-lg-8">
                      <input type="text" class="form-control" placeholder="nombre de la oferta"/>
                    </div>
               </div>
                    
		<div class="form-group">
                      <label class="col-lg-3 control-label">Nombre de la empresa:</label>
                      <div class="col-lg-8">
		    <input type="text" class="form-control"/>
                    </div>
		  </div>
                    
		  <div class="form-group">
                      <label class="col-lg-3 control-label">Informaci&oacute;n de la oferta:</label>
                      <div class="col-lg-8">
                      <textarea class="form-control" rows="3"></textarea>
                      </div>
		  </div>
                    
                  <div class="form-group">
                      <label class="col-lg-3 control-label">Requisitos a cubrir:</label>
                      <div class="col-lg-8">
                    <textarea class="form-control" rows="3"></textarea>
                    </div>
		  </div>

                    <div class="form-group">
                        <label class="col-lg-3 control-label">Fecha:</label>
                        <div class="col-lg-9">
                            <label class="col-lg-1 control-label">D&iacute;a</label>
                            <div class="col-lg-2">
                    <select class="form-control">
                            <option>01</option>
                            <option>02</option>
                            <option>03</option>
                            <option>04</option>
                            <option>05</option>
                            <option>06</option>
                            <option>07</option>
                            <option>08</option>
                            <option>09</option>
                            <option>10</option>
                            <option>11</option>
                            <option>12</option>
                            <option>13</option>
                            <option>14</option>
                            <option>15</option>
                            <option>16</option>
                            <option>17</option>
                            <option>18</option>
                            <option>19</option>
                            <option>20</option>
                            <option>21</option>
                            <option>22</option>
                            <option>23</option>
                            <option>24</option>
                            <option>25</option>
                            <option>26</option>
                            <option>27</option>
                            <option>28</option>
                            <option>29</option>
                            <option>30</option>
                            <option>31</option>
                    </select>
                            </div>
                            <label class="col-lg-1 control-label">Mes</label>
                            <div class="col-lg-2">
                    <select class="form-control">
                        <option>Enero</option>
                        <option>Febrero</option>
                        <option>Marzo</option>
                        <option>Abril</option>
                        <option>Mayo</option>
                        <option>Junio</option>
                        <option>Julio</option>
                        <option>Agosto</option>
                        <option>Septiembre</option>
                        <option>Octubre</option>
                        <option>Noviembre</option>
                        <option>Diciembre</option>
                    </select>
                            </div>
                            <label class="col-lg-1 control-label">A&ntilde;o:</label>
                            <div class="col-lg-2">
                    <select class="form-control">
                        <option>2010</option>
                        <option>2011</option>
                        <option>2012</option>
                        <option>2013</option>
                        <option>2014</option>
                        <option>2015</option>
                        <option>2016</option>
                        <option>2017</option>
                        <option>2018</option>
                        <option>2019</option>
                        <option>2020</option>
                    </select>
                            </div>
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
