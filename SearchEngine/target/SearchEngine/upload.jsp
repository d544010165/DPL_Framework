<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>上传头像</title>
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
<%--<form action="${pageContext.request.contextPath}/public/user/uploadHeadIcon" method="POST" name="xiangmu" id="xiangmu"
      enctype="multipart/form-data">
    <table>
        <tr>
            <td>头像上传：</td>
            <td><input type=file name="myfiles" id="doc"
                       onchange="showImage();">
            </td>
            <div id="localImag">
                <img id="preview" width=-1 height=-1 style="diplay:none" />
            </div>
        </tr>
        <tr>
            <td>头像2:</td>
            <!-- 为了实现张图片上传，上传框这个name要都一样 -->
            <td><input type="file" name="myfiles" id="doc1"></td>
            <td>
            </td>
        </tr>
        <tr>
            <td><input type="submit" value="提交" />
            </td>
        </tr>
    </table>
</form>--%>
<div class="panel-body">
    <!--上传头像表单开始-->
    <form id="upload-form" class="form-horizontal" role="form">
        <div class="form-group">
            <label  class="col-md-2 control-label">选择头像:</label>
            <div class="col-md-8">
                <img id="avatar" src="newProject/images/index/user.jpg" width="70" />
                <input name="file" type="file" >
            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <input id="btn-upload" type="button" class="btn btn-primary" value="上传" />
            </div>
        </div>
    </form>
</div>
</body>
<%--<script type="text/javascript">
    function showImage() {
        var docObj = document.getElementById("doc");
        var imgObjPreview = document.getElementById("preview");
        if (docObj.files && docObj.files[0]) {
            //火狐下，直接设img属性
            imgObjPreview.style.display = 'block';
            imgObjPreview.style.width = '300px';
            imgObjPreview.style.height = '120px';
            //imgObjPreview.src = docObj.files[0].getAsDataURL();
            //火狐7以上版本不能用上面的getAsDataURL()方式获取，需要一下方式
            imgObjPreview.src = window.URL.createObjectURL(docObj.files[0]);
        } else {
            //IE下，使用滤镜
            docObj.select();
            var imgSrc = document.selection.createRange().text;
            var localImagId = document.getElementById("localImag");
            //必须设置初始大小
            localImagId.style.width = "250px";
            localImagId.style.height = "200px";
            //图片异常的捕捉，防止用户修改后缀来伪造图片
            try {
                localImagId.style.filter = "progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale)";
                localImagId.filters
                    .item("DXImageTransform.Microsoft.AlphaImageLoader").src = imgSrc;
            } catch (e) {
                alert("您上传的图片格式不正确，请重新选择!");
                return false;
            }
            imgObjPreview.style.display = 'none';
            document.selection.empty();
        }
        return true;
    }
</script>--%>
<script type="text/javascript">
    $("#btn-upload").click(function() {
        var url = "${pageContext.request.contextPath}/public/user/upload";
        var data = new FormData($("#upload-form")[0]);
        $.ajax({
            "url": url,
            "data": data,
            "type": "POST",
            "dataType": "json",
            "contentType": false,
            "processData": false,
            "success": function(json) {
                console.log(json);
                if (json.code == 1) {
                    alert("上传成功！");
                    $("#avatar").attr("src", json.data);
                } else {
                    alert("上传失败！" + json.msg);
                }
            }
            /*,"error": function() {
                alert("您的登录信息已过期，请重新登录！");
            }*/
        });
    });
</script>
</html>