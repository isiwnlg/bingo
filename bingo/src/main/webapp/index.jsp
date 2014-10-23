<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
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
		<a href="accordian.html" target="_blank">accordian.html</a><br>
		<a href="bs-js-components.html" target="_blank">bs-js-components.html</a><br>
		<a href="bs-js-css.html" target="_blank">bs-js-css.html</a><br>
		<a href="bs-js-getting-started.html" target="_blank">bs-js-getting-started.html</a><br>
		<a href="bs-js-plugin.html" target="_blank">bs-js-plugin.html</a><br>
		<a href="datetimepicker.html" target="_blank">datetimepicker.html</a><br>
		<a href="lov.html" target="_blank">lov.html</a><br>
		<a href="multirowLayout.html" target="_blank">multirowLayout.html</a><br>
		<a href="newLayout.html" target="_blank">newLayout.html</a><br>
		<a href="organizationTree.html" target="_blank">organizationTree.html</a><br>
		<a href="singleLayout.html" target="_blank">singleLayout.html</a><br>
		<a href="tabs.html" target="_blank">tabs.html</a><br>
		<a href="template.html" target="_blank">template.html</a><br>
		<a href="test.html" target="_blank">test.html</a><br>
		<a href="treeTemplate.html" target="_blank">treeTemplate.html</a><br>
  </body>
</html>
