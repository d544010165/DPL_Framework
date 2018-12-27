<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width,user-scalable=no,initial-scale=1.0,maximum-scale=1.0,minimum-scale=1.0">
  <title>DPL-首页</title>
  <link rel="stylesheet" href="./res/layui/css/layui.css">
  <link rel="stylesheet" href="./res/static/css/index.css">
</head>
<body>
  <!-- nav部分 -->
  <div class="nav index">
    <div class="layui-container">
      <!-- 公司logo -->
      <div class="nav-logo">
        <a href="index.jsp">
          <img src="./res/static/img/logo.png" alt="DPL">
        </a>
      </div>
      <div class="nav-list">
        <button>
          <span></span><span></span><span></span>
        </button>
        <ul class="layui-nav" lay-filter="">
          <li class="layui-nav-item layui-this"><a href="index.jsp">首页</a></li>
          <li class="layui-nav-item"><a href="login.jsp">登录</a></li>
          <li class="layui-nav-item"><a href="logout">退出登录</a></li>
          <!--<li class="layui-nav-item"><a href="product.html">产品</a></li>-->
          <!--<li class="layui-nav-item"><a href="news.html">动态</a></li>-->
          <!--<li class="layui-nav-item"><a href="case.html">案例</a></li>-->
          <li class="layui-nav-item"><a href="about.jsp">关于</a></li>
        </ul>
      </div>
    </div>
  </div>
  <!-- banner部分 -->
  <div>
    <div class="layui-carousel" id="banner">
      <div carousel-item>
        <div>
          <img src="./res/static/img/banner1.jpg">
          <div class="panel">
            <p class="title">DPL</p>
            <p>框架测试主页</p>
          </div>
        </div>
        <div>
          <img src="./res/static/img/banner2.jpg">
          <div class="panel">
            <p class="title">DPL</p>
            <p>框架测试主页</p>
          </div>
        </div>
      </div>
    </div>
  </div>
  <!-- main部分 -->
  <div class="main-product">
    <div class="layui-container">
      <%--<p class="title">专为客户而研制的<span>核心产品</span></p>--%>
      <div class="layui-row layui-col-space25">
        <div class="layui-col-sm6 layui-col-md3">
          <div class="content">
            <div><img src="./res/static/img/Big_icon1.png"></div>
            <div>
              <p class="label">服务器搭建</p>
              <p>从小屏逐步扩展到大屏，最终实现所有屏幕适配，适应移动互联潮流。</p>
            </div>
            <a href="javascript:;">查看产品 ></a>
          </div>
        </div>
        <div class="layui-col-sm6 layui-col-md3 ">
          <div class="content">
            <div><img src="./res/static/img/Big_icon2.png"></div>
            <div>
              <p class="label">视觉设计</p>
              <p>从小屏逐步扩展到大屏，最终实现所有屏幕适配，适应移动互联潮流。</p>
            </div>
            <a href="javascript:;">查看产品 ></a>
          </div>
        </div>
        <div class="layui-col-sm6 layui-col-md3 ">
          <div class="content">
            <div><img src="./res/static/img/Big_icon3.png"></div>
            <div>
              <p class="label">兼容性</p>
              <p>从小屏逐步扩展到大屏，最终实现所有屏幕适配，适应移动互联潮流。</p>
            </div>
            <a href="javascript:;">查看产品 ></a>
          </div>
        </div>
        <div class="layui-col-sm6 layui-col-md3 ">
          <div class="content">
            <div><img src="./res/static/img/Big_icon4.png"></div>
            <div>
              <p class="label">创意性</p>
              <p>从小屏逐步扩展到大屏，最终实现所有屏幕适配，适应移动互联潮流。</p>
            </div>
            <a href="javascript:;">查看产品 ></a>
          </div>
        </div>
      </div>
    </div>
  </div>
  <!--
  <div class="main-service">
    <div class="layui-container">
      <p class="title">为客户打造完美的<span>专业服务</span></p>
      <div class="layui-row layui-col-space25 layui-col-space80">
        <div class="layui-col-sm6">
          <div class="content">
            <div class="content-left"><img src="./res/static/img/home_img1.jpg"></div>
          </div>
        </div>
        <div class="layui-col-sm6">
          <div class="content">
            <div class="content-left"><img src="./res/static/img/home_img2.jpg"></div>
            <div class="content-right">
              <p class="label">1 对 1 前端指导</p>
              <span></span>
              <p>更有多个包含不同主题的Web组件，可快速构建界面出色、体验优秀的跨屏页面，大幅提升开发效率。</p>
            </div>
          </div>
        </div>
      </div>
      <div class="service-more"><a href="">查看更多</a></div>
    </div>
  </div>
  -->

  <!-- footer部分 -->
  <div class="footer">
    <div class="layui-container">
      <p class="footer-web">
        <a href="javascript:;">合作伙伴</a>
        <a href="javascript:;">DPL</a>
      </p>
      <div class="layui-row footer-contact">
        <div class="layui-col-sm2 layui-col-lg1"><img src="./res/static/img/erweima.jpg"></div>
        <div class="layui-col-sm10 layui-col-lg11">
          <div class="layui-row">
            <div class="layui-col-sm6 layui-col-md8 layui-col-lg9">
              <p class="contact-top"><i class="layui-icon layui-icon-cellphone"></i>&nbsp;+86 18190738991&nbsp;&nbsp;&nbsp;(9:00-18:00)</p>
              <p class="contact-bottom"><i class="layui-icon layui-icon-home"></i>&nbsp;544010165@qq.com</p>
            </div>
            <div class="layui-col-sm6 layui-col-md4 layui-col-lg3">
              <p class="contact-top"><span class="right">地址: XXXX XXXX</span></p>
              <p class="contact-bottom"><span class="right">Copyright&nbsp;©&nbsp;2016-2018&nbsp;&nbsp;ICP&nbsp;备888888号</span></p>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
<script src="./res/layui/layui.js"></script>
<!--[if lt IE 9]>
  <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
  <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
<![endif]-->
<script>
  layui.config({
    base: './res/static/js/'
  }).use('firm');
</script>
</body>
</html>