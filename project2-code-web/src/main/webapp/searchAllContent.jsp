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
                  <form action="userMenu.jsp">
                  <button class="btn btn-lg btn-primary btn-block" type="submit" >Go Back</button><br/>
                   </form>
              </div>
              <div class="col-md-9 register-right">
                    <div class="row register-form">
                        <div class="col-md-10">
                            <div class="input-group" id="adv-search">
                                <input type="text" class="form-control" placeholder="Search for contents" />
                                <div class="input-group-btn">
                                    <div class="btn-group" role="group">
                                        <div class="dropdown dropdown-lg">
                                            <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><span class="caret"></span></button>
                                            <div class="dropdown-menu dropdown-menu-right" role="menu">
                                                <form class="form-horizontal" role="form">
                                                  <div class="form-group">
                                                    <label for="filter">Filter by</label>
                                                    <select class="form-control">
                                                        <option value="0" selected></option>
                                                        <option value="1">Movie</option>
                                                        <option value="2">TVShow</option>
                                                    </select>
                                                  </div>
                                                  <div class="form-group">
                                                    <label for="contain">Director</label>
                                                    <input class="form-control" type="text" />
                                                  </div>
                                                  <div class="form-group">
                                                    <label for="contain">Category</label>
                                                    <input class="form-control" type="text" />
                                                  </div>
                                                  <div class="form-group">
                                                   <label for="contain">Years</label>
                                                   <form>
                                                     <div class="form-group">
                                                     <input type="range" class="form-control-range" id="formControlRange">
                                                     </div>
                                                   </form>
                                                   </div>
                                                  <button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></button>
                                                </form>
                                            </div>
                                        </div>
                                        <button type="button" class="btn btn-primary"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
              </div>
          </div>
</body>
</html>