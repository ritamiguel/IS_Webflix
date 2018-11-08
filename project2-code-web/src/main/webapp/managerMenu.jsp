<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ include file = "header.jsp" %>

<body>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<div class="container register">
          <div class="row">
              <div class="col-md-3 register-left">
                  <img src="https://mbtskoudsalg.com/images/popcorn-png.png" alt=""/>
                  <h3>Welcome</h3>
                  <p>to Manager Menu</p>
                  <form action="home.jsp">
                    <button class="btn btn-lg btn-primary btn-block" type="submit" >Go Back</button><br/>
                  </form>
              </div>
              <div class="col-md-9 register-right">
                    <div class="row register-form">
                        <div class="col-md-10">
                            <div class="list-group">
                                <a href="managerAddContent.jsp" class="list-group-item active text-center" id="new_content">
                                <h4 class="glyphicon glyphicon-plus"></h4> <br/>Add	new	content to the application
                                </a>
                                <a href="editContent.jsp" class="list-group-item text-center" id="edit_multi">
                                <h4 class="glyphicon glyphicon-plus"></h4> <br/>Edit the multimedia content
                            </a>
                            <a href="#" class="list-group-item text-center" id="del_content">
                                <h4 class="glyphicon glyphicon-plus"></h4> <br/>Delete content
                            </a>
                            <a href="#" class="list-group-item text-center" id="logout">
                                <h4 class="glyphicon glyphicon-list-alt"></h4> <br/>Logout
                            </a>
                            </div>
                            <script src="js/bootstrap-select.js"></script>
                            </div>
                         </div>
                    </div>
               </div>
          </div>
</div>
</form>
</body>
</html>