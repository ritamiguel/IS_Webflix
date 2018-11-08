<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit your info</title>
</head>
<body>
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
            <button class="btn btn-outline-secondary" type="button">Delete content</button>
          </div>
        </div>
    <button type="submit">
    <span>Delete Content</span>
    </button>
	</form>
</body>
</html>