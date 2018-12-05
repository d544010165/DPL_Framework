<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

	<head>

		<meta charset="utf-8" />
		<!--导入核心文件-->
		<script src="newProject/bootstrap3/js/holder.js"></script>
		<link href="newProject/bootstrap3/css/bootstrap.css" rel="stylesheet" type="text/css">
		<script src="newProject/bootstrap3/jquery-1.9.1.min.js"></script>
		<script src="newProject/bootstrap3/js/bootstrap.js"></script>
		<!-- 字体图标 -->
		<link rel="stylesheet" href="newProject/bootstrap3/font-awesome-4.7.0/css/font-awesome.css" />
		<link rel="stylesheet" type="text/css" href="newProject/css/top.css" />
		<link rel="stylesheet" type="text/css" href="newProject/css/index.css" />
		<link rel="stylesheet" type="text/css" href="newProject/css/layout.css" />
		<link rel="stylesheet" type="text/css" href="newProject/css/login.css" />
	</head>

	<body>
		<!--头部-->
		<header class="header">

<!-- 			<img src="newProject/images/index/stumalllogo.png" alt="" /> -->
<!-- 			<span class="pull-right"><h3><small>欢迎访问</small><b>DPL商城</b></h3></span> -->

		</header>
		<!--主体-->
		<div class="container mycontent text-left">
			<!--透明层 -->
			<div class="loginDiv">
				<h4>用户登录</h4>
				<hr />
				<!--表单开始-->
				<form id="login_form" action="${pageContext.request.contextPath}/newLogin" method="post" class="form-horizontal" role="form">
					<!--用户名-->
					<div class="form-group">
						<label for="username" class="col-md-3 control-label">账号：</label>
						<div class="col-md-8">
							<input type="text" class="form-control" id="fAccount" name="fAccount" placeholder="请输入用户名">
						</div>
					</div>
					<!--密码-->
					<div class="form-group">
						<label for="pwd" class="col-md-3 control-label"> 密码：</label>
						<div class="col-md-8">
							<input type="text" class="form-control" id="fPassword" name="fPassword" placeholder="请输入密码">
						</div>
					</div>
					<!-- 记住我-->
					<div class="form-group">
						<div class="col-md-offset-3 col-md-6">
							<div class="checkbox">
								<label>
									<input type="checkbox">自动登录
								</label>
							</div>
						</div>
					</div>

					<!--提交按钮-->
					<div class="form-group">
						<label class="col-md-3 control-label"></label>
						<div class="col-md-8">
<!-- 							<input id="login_btn" class="btn btn-primary" type="submit" value="登录"/> -->
							<input id="login_btn" class="btn btn-primary" type="button" value="登录"/>

							<span class="pull-right"><small>还没有账号？</small><a href="${pageContext.request.contextPath}/register.html">注册</a></span>
						</div>
					</div>
					
				</form>
			</div>

		</div>
		<!--脚部-->
<!-- 		<iframe src="newProject/footerTemplate.html" width="100%" height="380" frameborder="0" scrolling="no"></iframe> -->
	</body>
	
<script type="text/javascript">
	$("#login_btn").click(
		function() {
			var url = "newLogin"; 
			var data = $("#login_form").serialize();
			$.ajax({
				"url":url,
				"data":data,
				"type":"POST",
				"dataType":"JSON",
				"success": function(obj) {
						console.log(obj);
					 	if(obj.code == 1){
					 		//成功
					 		location.href=obj.data;
					 	}else if(obj.code == 0){
					 		alert(obj.msg);
					 	}
				}
			});		
			
		}		
	);

</script> 
</html>