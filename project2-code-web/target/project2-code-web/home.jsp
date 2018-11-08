<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
    <div class="container register">
        <div class="row">
            <div class="col-md-3 register-left">
                <img src="https://mbtskoudsalg.com/images/popcorn-png.png" alt=""/>
                <h3>Welcome</h3>
                <p>to <b>Webflix</b></p>
                <form action="login.jsp">
                <button class="btn btn-lg btn-primary btn-block" type="submit" >Login</button><br/>
                </form>
            </div>
            <div class="col-md-9 register-right">
                <ul class="nav nav-tabs nav-justified" id="myTab" role="tablist">
                    <li class="nav-item">
                        <a class="nav-link active" id="home-tab" data-toggle="tab" href="#home" role="tab" aria-controls="home" aria-selected="true">User</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" id="profile-tab" data-toggle="tab" href="#profile" role="tab" aria-controls="profile" aria-selected="false">Manager</a>
                    </li>
                </ul>
                <div class="tab-content" id="myTabContent">
                    <div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">
                        <h3 class="register-heading">Register as User</h3>
                        <div class="row register-form">
                            <div class="col-md-6">
                                        <form class="form-signing" action="register" method="post">
                                            <div class="form-group">
                                            <label for="firstName" class="sr-only">First Name</label>
                                            <input class="form-control" id="firstName" type="text" name="firstName" placeholder="First Name"required>
                                             <div class="form-group">
                                            <label for="password" class="sr-only">Last Name</label>
                                            <input class="form-control" id="lastName" type="text" name="lastName" placeholder="Last Name" required>
                                            </div>
                                              <div class="form-group">
                                            <label for="email" class="sr-only">Email address</label>
                                            <input class="form-control" id="email" type="email" name="email" placeholder="Email" required autofocus>
                                             </div>
                                             <div class="form-group">
                                            <label for="password" class="sr-only">Password</label>
                                            <input class="form-control" id="password" type="password" name="password" placeholder="Password" required>
                                            </div>
                                            <div class="form-group">
                                            <label for="email" class="sr-only">Credit Card Number</label>
                                            <input class="form-control" id="creditCard" type="text" name="creditCard" placeholder="Credit Card" required autofocus>
                                            </div>
                                            &nbsp;
                                            <form action="userMenu.jsp">
                                            <button class="btn btn-lg btn-primary btn-block" type="submit">Register</button><br/>
                                            </form>
                                            &nbsp;
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
                    <div class="tab-pane fade show" id="profile" role="tabpanel" aria-labelledby="profile-tab">
                        <h3  class="register-heading">Register as Manager</h3>
                        <div class="row register-form">
                            <div class="col-md-6">
                                <div class="container">
                                    <form class="form-signing" action="register" method="post">
                                        <div class="form-group">
                                            <label for="firstName" class="sr-only">First Name</label>
                                            <input class="form-control" id="firstName" type="text" name="firstName" placeholder="First Name"required>
                                             <div class="form-group">
                                            <label for="password" class="sr-only">Last Name</label>
                                            <input class="form-control" id="lastName" type="text" name="lastName" placeholder="Last Name" required>
                                            </div>
                                              <div class="form-group">
                                            <label for="email" class="sr-only">Email address</label>
                                            <input class="form-control" id="email" type="email" name="email" placeholder="Email" required autofocus>
                                             </div>
                                             <div class="form-group">
                                            <label for="password" class="sr-only">Password</label>
                                            <input class="form-control" id="password" type="password" name="password" placeholder="Password" required>
                                            </div>
                                            <div class="form-group">
                                            <label for="email" class="sr-only">Credit Card Number</label>
                                            <input class="form-control" id="creditCard" type="text" name="creditCard" placeholder="Credit Card" required autofocus>
                                            </div>
                                            &nbsp;
                                        <form action="managerMenu.jsp">
                                        <button class="btn btn-lg btn-primary btn-block" type="submit">Register</button>
                                        </form>
                                        &nbsp;
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
</body>
</html>