<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet">
</head>
<body>
<div id="login" class="container">
  <div class="row-fluid">
    <div class="span12">
      <div class="login well well-small">
        <div class="center">
          <img src="http://placehold.it/250x100&text=Logo" alt="logo"> 
        </div>
        <form action="/users/login" style="" class="login-form" id="UserLoginForm" method="post" accept-charset="utf-8">
          <div class="control-group">
            <div class="input-prepend">
              <span class="add-on"><i class="icon-user"></i></span>
              <input name="data[User][username]" required="required" placeholder="Username" maxlength="255" type="text" id="UserUsername"> 
            </div>
          </div>
          <div class="control-group">
            <div class="input-prepend">
              <span class="add-on"><i class="icon-lock"></i></span>
              <input name="data[User][password]" required="required" placeholder="Password" type="password" id="UserPassword"> 
            </div>
          </div>
          <div class="control-group">
            <input class="btn btn-primary btn-large btn-block" type="submit" value="Sign in"> 
            
          </div>
          <a href="EsempioProdotto.html">Prodotto</a>
        </form>
      </div><!--/.login-->
    </div><!--/.span12-->
  </div><!--/.row-fluid-->
</div><!--/.container-->

</body>
</html>