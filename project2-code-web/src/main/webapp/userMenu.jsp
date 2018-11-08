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
                  <p>to User Menu</p>
                  <form action="home.jsp">
                  <button class="btn btn-lg btn-primary btn-block" type="submit" >Go Back</button><br/>
                   </form>
              </div>
              <div class="col-md-9 register-right">
                    <div class="row register-form">
                        <div class="col-md-10">
                            <div class="list-group">
                            <a href="#" class="list-group-item active text-center" id="search_content">
                                <h4 class="glyphicon glyphicon-plus"></h4> <br/>Search for all the content
                            </a> <a href="addMovie.jsp" class="list-group-item text-center" id="add_movie">
                                <h4 class="glyphicon glyphicon-plus"></h4> <br/>Add a movie and/or episode to watch list
                            </a> <a href="userWatchList.jsp" class="list-group-item text-center" id="watch_list">
                                <h4 class="glyphicon glyphicon-plus"></h4> <br/>Watch list
                            </a> <a href="#" class="list-group-item text-center" id="List_sug">
                                <h4 class="glyphicon glyphicon-list-alt"></h4> <br/>List of suggested content
                            </a> <a href="#" class="list-group-item text-center" id="edit_data">
                                <h4 class="glyphicon glyphicon-edit"></h4> <br/>Edit personal informations
                            </a> <a href="#" class="list-group-item text-center" id="del_account">
                                <h4 class="glyphicon glyphicon-check"></h4> <br/>Delete account
                            </a> <a href="#" class="list-group-item text-center" id="logout">
                                <h4 class="glyphicon glyphicon-edit"></h4> <br/>Logout
                            </a>
                            </div>
                            <script src="js/bootstrap-select.js"></script>

                        </div>
                    </div>
              </div>
          </div>
</body>
</html>