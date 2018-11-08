<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit your info</title>
</head>
<body>
	<form method="post" action="editContent">
 		<select name="option">
           <option>Title</option>
           <option>Director</option>
           <option>Year</option>
           <option>Category</option>
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
</body>
</html>