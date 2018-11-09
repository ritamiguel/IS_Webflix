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
                  <h3>Webflix</h3>
                  <form action="managerMenu.jsp">
                  <button class="btn btn-lg btn-primary btn-block" type="submit" >Go Back</button><br/>
                  </form>
              </div>
              <div class="col-md-9 register-right">
                    <div class="row register-form">
                        <div class="col-md-10">
                            <form method="post" action="editContent">
                                   <div class="input-group mb-3">
                                     <select class="custom-select" id="inputGroupSelect02">
                                     <select name="option">
                                       <option selected>Choose...</option>
                                       <option value="1">Title</option>
                                       <option value="2">Director</option>
                                       <option value="3">Year</option>
                                       <option value="4">Category</option>
                                     </select>
                                   <label for="newAttribute" class="sr-only"> ENTER NEW </label>
                                   <input class="form-control" id="newAttribute" type="text" name="newAttribute" placeholder="ENTER NEW"required>
                                    <button class="btn btn-lg btn-primary btn-block" type="submit">OK</button>
                                    <!-- <input class="input" type="text" name="title" placeholder="Rei Leao">
                                    <input class="input" type="text" name="director" placeholder="Mosby">
                                    <input class="input" type="number" name="year" placeholder="1995">
                                    <input class="input" type="text" name="category" placeholder="Animação">
                                <button type="submit">
                                <span>Edit Info</span>
                                </button>
                                </form>
                         </div>
                    </div>
               </div>
          </div>
</div>
</form>
</body>
</html>