<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
	<title></title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<!-- 引入bootstrap -->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
	<!-- 引入JQuery  bootstrap.js-->
	<script src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
	<style type="text/css">
	body{
	   background: url("${pageContext.request.contextPath}/images/a.jpg")repeat;
	}
	#login-box {
		/*border:1px solid #F00;*/
		padding: 35px;
		border-radius:15px;
		background: #56666B;
		color: #fff;
	}
	
 	#div_register_btn{ 
  		float: left;  
 	}

	</style>
</head>
<body>
	<div class="container" id="top">
		<div class="row" style="margin-top: 280px; ">
			<div class="col-md-4"></div>
			<div class="col-md-4" id="login-box">
				<form class="form-horizontal" role="form" action="${pageContext.request.contextPath}/login" id="from1" method="post">
				  <div class="form-group">
				    <label for="firstname" class="col-sm-3 control-label">用户账号</label>
				    <div class="col-sm-9">
				      <input type="text" class="form-control" id="userID" placeholder="请输入名字" name="fAccount">
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="lastname" class="col-sm-3 control-label">密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码</label>
				    <div class="col-sm-9">
				      <input type="password" class="form-control" id="password" placeholder="请输入密码" name="fPassword">
				    </div>
				  </div>
<!-- 				  <div class="form-group"> -->
<!-- 				    <div class="col-sm-offset-2 col-sm-10"> -->
<!-- 				      <div class="checkbox"> -->
<!-- 				        <label class="checkbox-inline"> -->
<!-- 							<input type="radio" name="role" value="1" checked>管理员 -->
<!-- 						</label> -->
<!-- 						<label class="checkbox-inline"> -->
<!-- 							<input type="radio" name="role" value="2">老师 -->
<!-- 						</label> -->
<!-- 						<label class="checkbox-inline"> -->
<!-- 							<input type="radio" name="role" value="3">学生 -->
<!-- 						</label> -->
<!-- 				      </div> -->
<!-- 				    </div> -->
<!-- 				  </div> -->
				  
				  <br/>
				  
				  <div class="form-group pull-right" style="margin-left: 180px;">
					  <a href="${pageContext.request.contextPath}/register.html">
				    		<button id="register_btn" type="button" class="btn btn-default btn-info">注册</button>
				    	</a>
				    </div>
				  <div class="form-group pull-right" style="margin-right:25px;">
				    <div class="col-sm-offset-2 col-sm-10">
				      <button type="submit" class="btn btn-default btn-info">登录</button>
				    </div>
				  </div>
				</form>
			</div>
			<div class="col-md-4"></div>
		</div>		
	</div>
</body>


</html>