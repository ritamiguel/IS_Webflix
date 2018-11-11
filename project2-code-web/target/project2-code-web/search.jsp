<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ include file = "header.jsp" %>
<body>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<form class="container" action="contents" method="get">
    <div class="row">
        <div class="col-md-6 mb-3">
            <label for="title">Title</label>
            <input type="text" class="form-control" id="title" placeholder="Title" name="title">
        </div>
        <div class="col-md-6 mb-3">
            <label for="director">Director</label>
            <input type="text" class="form-control" id="director" placeholder="Director" name="director">
        </div>
    </div>
    <div class="row">
        <div class="col-md-3 mb-3">
            <label for="year">Year</label>
            <input type="text" class="form-control" id="year" placeholder="Year" name="year">

        </div>
        <div class="col-md-3 mb-3">
            <label for="category">Category</label>
            <input type="text" class="form-control" id="category" placeholder="Category" name="category">

        </div>
    </div>
    <div class="col-auto">
        <label class="mr-sm-2" for="inlineFormCustomSelect">Search by</label>
        <select class="custom-select mb-2 mr-sm-2 mb-sm-0" id="inlineFormCustomSelect" name="option">
            <option value="1">Title</option>
            <option value="2">Director</option>
            <option value="3">Year</option>
            <option value="4">Category</option>
        </select>
    </div>
       &nbsp;
      &nbsp;
             <br>            
    <button class="btn btn-primary" type="submit">Search</button>
</form>