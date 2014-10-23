<%@ page language="java" contentType="text/html; charset=UTF-8"
 import="bingo.cat.*"
    pageEncoding="UTF-8"%>

    
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>tree</title>
    <!-- Bootstrap -->
    <link rel="stylesheet" href="../css/bootstrap.min.css">
    <link rel="stylesheet" href="../css/jquery.zTreeStyle.css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="http://cdn.bootcss.com/html5shiv/3.7.0/html5shiv.min.js"></script>
        <script src="http://cdn.bootcss.com/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
	<ul id="tree" class="ztree" style="width:100%; overflow:auto;"></ul>
	
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="../js/jquery.js"></script>
    <script src="../js/jquery.ztree.all-3.5.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="../js/bootstrap.min.js"></script>
	<script type="text/javascript" >
    var zTreeObj,
    setting = {
      view: {
        selectedMulti: false
      },
    data: {
      simpleData: {
        enable: true,
        idKey: "id",
        pIdKey: "pId",
        rootPId: 0
            }
          }
    },
    zTreeNodes = [
<%=bingo.cat.CatObject.getDesignNavigator()%>     
              ];
    $(document).ready(function(){
      zTreeObj = $.fn.zTree.init($("#tree"), setting, zTreeNodes);
    });
	</script>
    
    
  </body>
</html>