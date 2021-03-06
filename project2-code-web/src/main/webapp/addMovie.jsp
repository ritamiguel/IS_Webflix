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
                <h3>Add</h3>
                <p>movie and/or TVShow</p>
                <form action="userMenu.jsp">
                <button class="btn btn-lg btn-primary btn-block" type="submit" >Go Back</button><br/>
                </form>
                <a href="logout" id="logout">
                    <h4 class="glyphicon glyphicon-edit"></h4> <br/>Logout
                </a>
            </div>
            <div class="col-md-9 register-right">
                <h3 class="register-heading">Insert here name</h3>
                <div class="row register-form">
                    <div class="col-md-6">
                        <div class="row register-form">
                            <div class="col-md-10">
                            <div class="tab-pane fade show" id="add_movie" role="tabpanel" aria-labelledby="add_movie">
                                <form class="form-signing" action="addMovie" method="post">
                                    <div class="input-group mb-3">
                                      <input type="text" class="form-control" name="title" placeholder="Content's name" aria-label="Content's name" aria-describedby="basic-addon2">
                                      <div class="input-group-append">
                                        <button class="btn btn-outline-secondary" type="button">Ok</button>
                                      </div>
                                    </div>
                                </form>
                                <c:if test="${error.length()>0}">
                                <div class="alert alert-warning alert-dismissible fade show" role="alert">
                                        ${error}
                                </div>
                                </c:if>
                            </div>
                            </div>
                        </div>
                    </div>
                 </div>
            </div>
        </div>
</div>


</body>
</html>