<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
		<%@ include file = "header.jsp" %>

	<div class="container register">
          <div class="row">
              <div class="col-md-3 register-left">
                  <img src="https://mbtskoudsalg.com/images/popcorn-png.png" alt=""/>
                  <h3>Webflix</h3>
                   <div class="list-group">
                        <a href="#" id="search_content">
                          <h4 class="glyphicon glyphicon-plus"></h4> <br/>Search for all the content
                      </a>
                      <a href="#" id="add_movie">
                          <h4 class="glyphicon glyphicon-plus"></h4> <br/>Add a movie and/or episode to watch list
                      </a>
                      <a href="#"  id="watch_list">
                          <h4 class="glyphicon glyphicon-plus"></h4> <br/>Watch list
                      </a>
                      <a href="#" id="List_sug">
                          <h4 class="glyphicon glyphicon-list-alt"></h4> <br/>List of suggested content
                      </a>
                      <a href="edituser.jsp" id="edit_data">
                          <h4 class="glyphicon glyphicon-edit"></h4> <br/>Edit personal informations
                      </a>
                      <a href="#"  id="del_account">
                          <h4 class="glyphicon glyphicon-check"></h4> <br/>Delete account
                      </a>
                      <a href="logout" id="logout">
                          <h4 class="glyphicon glyphicon-edit"></h4> <br/>Logout
                      </a>
                      </div>
                      <script src="js/bootstrap-select.js"></script>
              </div>


              <div class="col-md-9 register-right">
              	<h3 class="register-heading">Select the information you want to edit and fill the text box with the new value</h3>
              <div class="row register-form">
                        <div class="col-md-10">
                        &nbsp;
               &nbsp;
              	<form method="post" action="edituser">
                    <select class="custom-select" id="option" name="option">
					    <option selected>Choose...</option>
					     <option value="1">First Name</option>
				           <option value="2">Last Name</option>
				           <option value="3">Email</option>
				           <option value="4">Password</option>
				           <option value="5">Credit Card</option>
  					</select>

  			<label for="option" class="sr-only">New Value</label>
	        <input class="form-control" id="newAttribute" type="text" name="newAttribute" placeholder="New Value" required autofocus>
	        &nbsp;
	        <button class="btn btn-lg btn-primary btn-block" type="submit">OK</button>
	        	</form>

                        </div>
                </div>

              </div>

          </div>

</body>
</html>