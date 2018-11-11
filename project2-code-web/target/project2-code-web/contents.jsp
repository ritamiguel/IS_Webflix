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
                  
                  <form action="userMenu.jsp">
                  <button class="btn btn-lg btn-primary btn-block" type="submit" >Go Back</button><br/>
                   </form>
              </div>
              <div class="col-md-9 register-right">
                    <div class="row register-form">
                        <div class="col-md-10">
						                            
						    <div class="row">
						        <%@ include file = "search.jsp" %>
						        <c:forEach items="${contents}" var="content">
						            <div class="">
						                <div class = "yolo">
						                    <h4><a style="color:grey" href="content?id=${content.id}">${content.title} ${content.year}</a></h4>
						                    <div>
						                       
						                        <p class="card-text">Title: ${content.title}</p>
						                        <p class="card-text">Director: ${content.director}</p>
						                        <p class="card-text">Year: ${content.year}</p>
						                        <p class="card-text">Category: ${content.category}</p>
						                    </div>
						                </div>
						            </div>
						        </c:forEach>
						    
						       
						    </div>
                        </div>
                    </div>
              </div>
          </div>
</body>
</html>