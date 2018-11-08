<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit your info</title>
</head>
<body>
	<form method="post" action="edituser">
 		<select name="option">
           <option>First Name</option>
           <option>Last Name</option>
           <option>Email</option>
           <option>Password</option>
           <option>Credit Card</option>
       </select>
       <label for="newAttribute" class="sr-only"> ENTER NEW </label>
	   <input class="form-control" id="newAttribute" type="text" name="newAttribute" placeholder="ENTER NEW"required>
		<button class="btn btn-lg btn-primary btn-block" type="submit">OK</button>
	    <!-- <input class="input" type="text" name="firstName" placeholder="Brand">
	    <input class="input" type="text" name="lastName" placeholder="Mosby">
		<input class="input" type="text" name="email" placeholder="example@email.com">
	    <input class="input" type="text" name="password" placeholder="password">
    	<input class="input" type="number" name="creditCard" placeholder="Credit Card">
    <button type="submit">
    <span>Edit Info</span>
    </button>  -->
	</form>
</body>
</html>