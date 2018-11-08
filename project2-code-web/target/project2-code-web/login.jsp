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
                  &nbsp;
                  <a href="logout" id="logout">
                      <h4 class="glyphicon glyphicon-edit"></h4> <br/>Logout
                  </a>
              </div>
              <div class="col-md-9 register-right">
                    <div class="row register-form">
                        <div class="col-md-6">
                            <form class="form-signing" action="login" method="post">
                                <h2 class="form-signin-heading">Insert Login Data</h2>
                                &nbsp;
                                <div class="form-group">
                                <label for="email" class="sr-only">Email address</label>
                                <input class="form-control" id="email" type="email" name="email" placeholder="Email" required autofocus>
                                &nbsp;
                                </div>
                                <div class="form-group">
                                <label for="password" class="sr-only">Password</label>
                                <input class="form-control" id="password" type="password" name="password" placeholder="Password"  required>
                                &nbsp;
                                </div>
                                <form action="userMenu.jsp">
                                <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button><br/>
                                </form>
                                &nbsp;
                                <p>Not registered yet? <a href="home.jsp">Please regist here</a></p>
                            </form>
                            <c:if test="${error.length() > 0}">
                                <div class="alert alert-warning alert-dismissible fade show" role="alert">
                                        ${error}
                                </div>
                            </c:if>
                         </div>
                     </div>
               </div>
          </div>
</div>

</body>
</html>