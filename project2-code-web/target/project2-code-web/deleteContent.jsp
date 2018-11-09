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
                        <form method="post" action="deleteContent">
                                <div class="input-group mb-3">
                                  <select class="custom-select" id="inputGroupSelect02">
                                    <option selected>Choose...</option>
                                    <option value="1">Movie</option>
                                    <option value="2">TVShow</option>
                                  </select>
                                  <div class="input-group-append">
                                    <label class="input-group-text" for="inputGroupSelect02">Content</label>
                                  </div>
                                </div>
                            <div class="input-group mb-3">
                                  <input type="text" class="form-control" placeholder="Content's title" aria-label="Content's title" aria-describedby="basic-addon2">
                                  <div class="input-group-append">
                                  <button class="btn btn-lg btn-primary btn-block" type="submit"> Delete content</button>
                                  </div>
                                </div>
                          </form>
                         </div>
                    </div>
               </div>
          </div>
</div>
</form>
</body>
</html>