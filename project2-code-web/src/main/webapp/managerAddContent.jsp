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
                <form action="managerMenu.jsp">
                <button class="btn btn-lg btn-primary btn-block" type="submit" >Go Back</button><br/>
                </form>
                <a href="logout" id="logout">
                    <h4 class="glyphicon glyphicon-edit"></h4> <br/>Logout
                </a>
            </div>
            <div class="col-md-9 register-right">
                <h3 class="register-heading">Add Content</h3>
                <div class="row register-form">
                    <div class="col-md-6">
                            <form class="form-signing" action="addContent" method="post">
                                    <div class="form-group">
                                    <select class="custom-select" id="option" name="option">
                                         <option value="1">Movie</option>
                                         <option value="2">Serie</option>
                                         </select>
                                        <label for="title" class="sr-only">Title</label>
                                        <input class="form-control" id="title" type="text" name="title" placeholder="Title"required>
                                         <div class="form-group">
                                        <label for="director" class="sr-only">Director</label>
                                        <input class="form-control" id="director" type="text" name="director" placeholder="Director" required>
                                        </div>
                                        <div class="form-group">
                                        <label for="year" class="sr-only">Year</label>
                                        <input class="form-control" id="year" type="text" name="year" placeholder="Year" required autofocus>
                                        </div>
                                        <div class="form-group">
                                        <label for="category" class="sr-only">Category</label>
                                        <input class="form-control" id="category" type="category" name="category" placeholder="Category" required>
                                        </div>
                                        &nbsp;
                                    <button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
                                    &nbsp;
                                    </form>
                                <c:if test="${error.length()>0}">
                                    <div class="alert alert-warning alert-dismissible fade show" role="alert">
                                            ${error}
                                    </div>
                                </c:if>
                            </div>
                        </form>
                    </div>
                 </div>
            </div>
        </div>
</div>


</body>
</html>


