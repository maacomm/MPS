<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="/PMT/resources/css/main.css">
</head>
<body>
<div class="container">
<div class="row clearfix">
	<div class="col-xs-12 col-sm-6 col-md-4 col-lg-4 col-md-offset-3 col-lg-offset-3 loginwrapper">
	<!-- Login Form -->

		<div class="loginform">
		
		 <form name="f" action="<c:url value='j_spring_security_check'/>" method="POST" onsubmit="return validateForm()">
		<div class="actionError">  </div>
		<div class="loginstyle">
		
		<h1 class="inline-blk center-align"><a><img src="/PMT/resources/images/logo.png" alt="eTrack" style="margin-top: -6px;"/> eTrack</a></h1>
		
			<p >
			
			<span class="input input--chisato">
			
                 <input type="text" name="j_username" value="" id="id" class="input__field input__field--chisato focus-effect login-box"/>


				
			 	<label class="input__label input__label--chisato" for="id">
					<span class="input__label-content input__label-content--chisato" data-content="USERNAME"><i class="fa fa-user icon_position"></i>USERNAME</span>
				
			
				</label>
					<span class="focus-input">USERNAME</span>
				</span>	
				
				
			</p>
		
			<p>
			
				
				<span class="input input--chisato">
			    <input type='password' name='j_password' id="password" value=""  class="input__field input__field--chisato focus-effect login-box">
				
				<label class="input__label input__label--chisato" for="password">
					<span class="input__label-content input__label-content--chisato" data-content="PASSWORD"><i class="fa fa-lock icon_position"></i>PASSWORD</span>
				</label>
				<span class="focus-input">PASSWORD</span> 
				</span>
	
	

	         
				<div class="actionError">
					<ul class="errorMessage">
					  <c:if test="${param.error == 'true'}">
					   <li><span>Username and Password do not match. Please Login Again</span></li>
					  </c:if>	
				   </ul>
				</div>
			  
				
			</p>
			</div>
			
			<p class="login_submit loginstyle center-align">
				
				<input type="submit" id="logintest_submit" name="submit" value="SIGN IN" class="login-btn sign-in-btn"/>

			</p>
			<!--  <input type="submit" id="logintest_submit" name="action:forgotPasswordAction" value="Forgot Password ?" class="forgetpswd"/>-->
	
			
			<div > </div>
		</form>




	
		</div>
	
	</div>
</div><!-- row ends-->
</div><!--Container ends-->
<script src="/PMT/resources/js/jquery-1.11.3.min.js" type="text/javascript"></script>
<script src="/PMT/resources/js/button.js" type="text/javascript"></script>
<script>
function validateForm() {
    var x = $("#id").val();
    var y = $("#password").val();
    if( (x == null || x == "") && (y == null || y == "")) {
    	  $(".errorMessage").html("<li><span>User Name and Password can not be blank</span></li>");
        return false;
    }
    if (x == null || x == "") {
        $(".errorMessage").html("<li><span>User Name can not be blank</span></li>");
        return false;
    }
    if (y == null || y == "") {
        $(".errorMessage").html("<li><span>Password can not be blank</span></li>");
        return false;
    }
    
}
</script>

</body>

</html>