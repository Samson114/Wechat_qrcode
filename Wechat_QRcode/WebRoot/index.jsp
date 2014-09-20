<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  <center>
    超级二维码生成器 <br /><br />
    <form action="Test" method="post">
   appId：<input type="text"   name="appId"  />
   appSecret：<input type="text"  name="appSecret"  />
   <br />
   <br />
   二维码形式： <input type="radio" name="action_name" value="QR_SCENE" />短期
    		   <input type="radio" name="action_name" value="QR_SCENE" />永久
    <br /><br />
   场景号码：<input type="text"  name="scene_id"  />
   <br /><br />
    <input type="submit"  value="确定">
    </form>
    </center>
  </body>
</html>
