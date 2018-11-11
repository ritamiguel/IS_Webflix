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
              <form action="userMenu.jsp">
              <button class="btn btn-lg btn-primary btn-block" type="submit" >Go Back</button><br/>
              </form>
          </div>
          <div class="col-md-9 register-right">
                <div class="row register-form">
                    <div class="col-md-6">
                    <form class="form-signing" action="watchList" method="get">
                    <c:forEach items="${myWatchList}" var="item">
                        ${item.title}<br>
                        ${item.director}<br>
                        ${item.year}<br>
                        ${item.category}<br>
                    </c:forEach>
                    <button class="btn btn-lg btn-primary btn-block" type="submit" >See my list of watched contents</button><br/>
                    </form>
                    </div>
                </div>
           </div>
      </div>
</div>
</body>
</html>