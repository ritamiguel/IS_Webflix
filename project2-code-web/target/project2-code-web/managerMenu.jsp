<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <style>
    .register {
        background: -webkit-linear-gradient(left, #2c3e50, #bdc3c7);
        margin-top: 3%;
        padding: 3%;
    }

    .register-left {
        text-align: center;
        color: #fff;
        margin-top: 4%;
    }
    .register-left input {
        border: none;
        border-radius: 1.5rem;
        padding: 2%;
        width: 60%;
        background: #f8f9fa;
        font-weight: bold;
        color: #383d41;
        margin-top: 30%;
        margin-bottom: 3%;
        cursor: pointer;
    }
    .register-right {
        background: #f8f9fa;
        border-top-left-radius: 10% 50%;
        border-bottom-left-radius: 10% 50%;
    }
    .register-left img {
        margin-top: 15%;
        margin-bottom: 5%;
        width: 25%;
        -webkit-animation: mover 2s infinite  alternate;
        animation: mover 1s infinite  alternate;
    }
    @-webkit-keyframes mover {
        0% { transform: translateY(0); }
        100% { transform: translateY(-20px); }
    }
    @keyframes mover {
        0% { transform: translateY(0); }
        100% { transform: translateY(-20px); }
    }
    .register-left p {
        font-weight: lighter;
        padding: 12%;
        margin-top: -9%;
    }
    .register .register-form {
        padding: 10%;
        margin-top: 10%;
    }
    .btnRegister {
        float: right;
        margin-top: 10%;
        border: none;
        border-radius: 1.5rem;
        padding: 2%;
        background: #0062cc;
        color: #fff;
        font-weight: 600;
        width: 50%;
        cursor: pointer;
    }
    .register .nav-tabs {
        margin-top: 3%;
        border: none;
        background: #0062cc;
        border-radius: 1.5rem;
        width: 28%;
        float: right;
    }
    .register .nav-tabs .nav-link {
        padding: 2%;
        height: 34px;
        font-weight: 600;
        color: #fff;
        border-top-right-radius: 1.5rem;
        border-bottom-right-radius: 1.5rem;
    }
    .register .nav-tabs .nav-link:hover {
        border: none;
    }
    .register .nav-tabs .nav-link.active {
        width: 100px;
        color: #0062cc;
        border: 2px solid #0062cc;
        border-top-left-radius: 1.5rem;
        border-bottom-left-radius: 1.5rem;
    }

    .register-heading {
        text-align: center;
        margin-top: 8%;
        margin-bottom: -15%;
        color: #495057;
    }
    </style>
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

 </head>
<body>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<body>
<div class="container register">
          <div class="row">
              <div class="col-md-3 register-left">
                  <img src="https://mbtskoudsalg.com/images/popcorn-png.png" alt=""/>
                  <h3>Webflix</h3>
              </div>
              <div class="col-md-9 register-right">
                    <div class="row register-form">
                        <div class="col-md-10">
                            <div class="list-group">
                                <a href="managerAddContent.jsp" class="list-group-item active text-center" id="new_content">
                                <h4 class="glyphicon glyphicon-plus"></h4> <br/>Add	new	content to the application
                                </a>
                                <a href="#" class="list-group-item text-center" id="edit_multi">
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