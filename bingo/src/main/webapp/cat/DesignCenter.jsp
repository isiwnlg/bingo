<%@page import="org.apache.commons.lang3.ArrayUtils"%>
<%@page import="org.apache.commons.collections4.ListUtils"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         import="java.util.*"
         import="bingo.cat.*"
         import="bingo.cat.vo.*"
         
    pageEncoding="UTF-8"%>

<% String quid=request.getParameter("quid");
    if(quid == null){
       return;
    }
    CatClass clazz = CatObject.getClass(quid);
%>
<!DOCTYPE html>
<html lang="zh-cn">
  <head >
    <title>Single Layout</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link rel="stylesheet" href="../css/bootstrap.css">
    <link rel="stylesheet" href="../css/bingo.css">
      <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="http://cdn.bootcss.com/html5shiv/3.7.0/html5shiv.min.js"></script>
        <script src="http://cdn.bootcss.com/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
  <form action="../bingo.cat" method="post">
    <input type="hidden" name="class_quid" value="<%=quid %>">

    <%
        Map<FieldType, List<FieldFormat>> typeFormatMap = CatConstants.typeFormatMap;
        Set<Map.Entry<FieldType, List<FieldFormat>>> tempEntryset =  typeFormatMap.entrySet();
        for(Iterator<Map.Entry<FieldType, List<FieldFormat>>> iterator = tempEntryset.iterator() ; iterator.hasNext();){
            Map.Entry<FieldType, List<FieldFormat>> entry = iterator.next();
            System.out.print(entry.getKey());
    %>
    <select name="<%=entry.getKey()%>_field_format_select" class="hidden">

    <%
            List<FieldFormat> formatList = entry.getValue();
            for(Iterator<FieldFormat> iterator2 = formatList.iterator(); iterator2.hasNext(); ){
                FieldFormat tempFieldFormat = iterator2.next();
    %>
        <option value="<%=tempFieldFormat.name() %>"><%=tempFieldFormat.name() %></option>
    <%
            }
    %>
    </select>
    <%
        }
    %>





    <div class="container">
    
    <p class="navbar-text navbar-right">欢迎您 <a href="#" class="navbar-link">路庆伟</a></p>
    <div class="page-header text-center">
      <h1> <%=clazz.getName() %> <small>Beta1.0</small></h1>
    </div>
    
    <div class="block">
    
      <div class="commandbar">
        <div class="btn-group btn-group-sm">
              <button type="button" class="btn btn-default" style="color: rgb(176,176,176)">
                <span class="glyphicon glyphicon-cog"></span>
              </button>
        </div>
        
        <span class="btn-toolbar pull-right" role="toolbar" style="margin: 0;">
          <div class="btn-group btn-group-sm">
            <button type="button" class="btn btn-default" style="color: rgb(3,104,154)" onclick="submit()">
              <span class="glyphicon glyphicon-ok"></span>保存
            </button>
            <button type="button" class="btn btn-default" style="color: rgb(219,38,34)">
              <span class="glyphicon glyphicon-minus-sign"></span>取消
            </button>
            
	         <div class="btn-group btn-group-sm">
	            <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" style="color: #67C518">
	              <span class="glyphicon glyphicon-tasks"></span>操作
	            </button>
	            <ul class="dropdown-menu pull-right">
	              <li><a href="#">复制</a></li>
	              <li><a href="#">发送到</a></li>
	              <li role="presentation" class="divider"></li>
	              <li><a href="#">打印报表</a></li>
	              <li><a href="#">上传文件库</a></li>
	            </ul>
	          </div>

          </div>
        </span>
      </div><!-- toolbar-group end -->
			<table class="table table-striped">
				<tbody>
				  <tr>
				    <td class="label-td"><label class="control-label" >Package Name:</label></td>
				    <td class="input-td">
				      <input name="bingo_package_name" class="text readonly" size="32" value="<%=clazz.getPackageName() %>" type="text" readonly="readonly">
				    </td>
				    <td class="label-td"><label class="control-label">Objid</label></td>
				    <td class="input-td">
				      <select name="bingo_objid">
				        <option value="rowid">Rowid</option>
				        <option value="other">Other</option>
				      </select>
				    </td>
				  </tr>
				  <tr>
				    <td class="label-td"><label class="control-label">View Name:</label></td>
				    <td class="input-td">
				      <input name="bingo_view_name" class="text readonly" size="32" value="<%=clazz.getViewName() %>" type="text" readonly="readonly">
				    </td>
				    <td class="label-td"><label class="control-label">Objversion</label></td>
				    <td class="input-td">
				      <select name="bingo_objversion">
				        <option value="timestamp">Timestamp</option>
				        <option value="sequence">Sequence</option>
				        <option value="other">Other</option>
				      </select>
				    </td>
				  </tr>
				  <tr>
				    <td class="label-td"><label class="control-label" >Table Name:</label></td>
				    <td class="input-td">
				      <input name="bingo_table_name" class="text readonly" size="32" value="<%=clazz.getTabName() %>" type="text" readonly="readonly">
				    </td>
				    <td class="label-td">&nbsp;</td>
				    <td class="input-td">&nbsp;</td>
				  </tr>
				</tbody>
			</table>
    </div>
    <ul class="nav nav-tabs" id="myTab">
      <li class="active"><a href="#attribute" data-toggle="tab">属性</a></li>
      <li><a href="#operation" data-toggle="tab">操作</a></li>
      <li><a href="#association" data-toggle="tab">关联</a></li>
    </ul>
    <div class="tab-content" id="myTabContent">
      <div class="tab-pane fade active in" id="attribute">
            <div class="commandbar">
        <div class="btn-group btn-group-sm">
              <button type="button" class="btn btn-default" style="color: rgb(176,176,176)">
                <span class="glyphicon glyphicon-cog"></span>
              </button>
        </div>
        <div class="btn-toolbar pull-right" role="toolbar" style="margin: 0;">
        </div>
      </div><!-- toolbar-group end -->
        <table class="multirow-table hovered">
          <thead>
            <tr>
              <th>&nbsp;</th>
              <th>
                <label class="dropdown table-shortcut">
                    <span class="dropdown-toggle" data-toggle="dropdown">
                    <img alt="快捷操作" src="../image/table_menu.gif">
                    </span>
                    <ul class="dropdown-menu" role="menu">
                      <li role="presentation"><a role="menuitem" tabindex="-1" href="#">全选</a></li>
                      <li role="presentation"><a role="menuitem" tabindex="-1" href="#">全不选</a></li>
                      <li role="presentation"><a role="menuitem" tabindex="-1" href="#">反选</a></li>
                      <li role="presentation" class="divider"></li>
                      <li role="presentation"><a role="menuitem" tabindex="-1" href="#">导出...</a></li>
                    </ul>
                 </label>
              </th>
              <th><a href="#">属性</a></th>
              <th><a href="#">数据类型</a></th>
              <th><a href="#">长度</a> </th>
              <th><a href="#">格式</a> </th>
              <th><a href="#">提示</a></th>
              <th><a href="#">主键</a> </th>
              <th><a href="#">必输</a></th>
              <th><a href="#">可插入</a> </th>
              <th><a href="#">值列表</a> </th>
              <th><a href="#">可更新</a></th>
            </tr>
          </thead>
          <tbody>
          <%
          ArrayList<ClassAttribute> classAttributeList = clazz.getClassAttributeList();
          ClassAttribute classAttribute = null;
          if(null != classAttributeList){
             for (int i = 0; i < classAttributeList.size(); i++) {
                classAttribute = classAttributeList.get(i);
             %>
            <tr>
              <td><a href="#"><%=(i+1) %></a></td> 
              <td class="multirow-sys-td">
                  <input type="checkbox" id="inlineCheckbox1" value="option1"> 
                  <input type="hidden" name="attribute_quid" value="<%=classAttribute.getQuid()%>"> 
                  <label class="dropdown">
                    <span class="dropdown-toggle glyphicon glyphicon-tasks" id="dropdownMenu1" data-toggle="dropdown"></span>
                    <ul class="dropdown-menu" role="menu" >
                      <li role="presentation"><a role="menuitem" tabindex="-1" href="#">复制</a></li>
                      <li role="presentation"><a role="menuitem" tabindex="-1" href="#">部门接收</a></li>
                      <li role="presentation"><a role="menuitem" tabindex="-1" href="#">拒绝</a></li>
                      <li role="presentation" class="divider"></li>
                      <li role="presentation"><a role="menuitem" tabindex="-1" href="#">签字</a></li>
                    </ul>
                  </label>
                  &nbsp;
               </td>
                <td><%=classAttribute.getName() %></td>
                <td>
                      <select name="<%=classAttribute.getQuid()%>_bingo_attr_field_type" onchange="changeFieldType(this,'<%=classAttribute.getQuid()%>')" class="">
                      <%
                      FieldType[] fieldTypes  = FieldType.values();
                      for(int k = 0; k< fieldTypes.length; k++){
                      %>
                       <option value="<%=fieldTypes[k].name() %>" <%=classAttribute.getFieldType().compareTo(fieldTypes[k])==0 ? "selected=\"selected\"" : "" %>><%=fieldTypes[k].name() %></option>  
                      <%} %>      
                      </select>
                </td>
                <td>

                    <%
                    if(classAttribute.getFieldType().compareTo(FieldType.DATE)==0){
                    %>
                    <input name="<%=classAttribute.getQuid()%>_bingo_attr_length" class="text readonly" value="" size="6" type="text" style="text-align:right" readonly="readonly">
                    <%
                    }else{
                    %>
                    <input name="<%=classAttribute.getQuid()%>_bingo_attr_length" class="text" value="<%=classAttribute.getLength()==0 ? "" :  classAttribute.getLength()%>" size="6" type="text" style="text-align:right">
                    <%
                    }
                    %>
                </td>
                <td>
                      <select name="<%=classAttribute.getQuid()%>_bingo_attr_format" class="">
                      <%
                      FieldFormat[] fieldFormats = CatConstants.typeFormatMap.get(classAttribute.getFieldType()).toArray(new FieldFormat[0]);
                      for(int k = 0; k< fieldFormats.length; k++){
                      %>
                       <option value="<%=fieldFormats[k].name() %>" <%=classAttribute.getFieldFormat().compareTo(fieldFormats[k])==0 ? "selected=\"selected\"" : "" %>><%=fieldFormats[k].name() %></option>  
                      <%}%>                  
                      </select>
                </td>
                <td><%=classAttribute.getPrompt() %></td>
                <td style="text-align:center">
                   <% if(classAttribute.isPrimaryKey()){%>
                   <input type="checkbox" name="<%=classAttribute.getQuid()%>_bingo_attr_primary_key" value="Y" checked="checked"> 
                   <%}else{ %>
                   <input type="checkbox" name="<%=classAttribute.getQuid()%>_bingo_attr_primary_key" value="Y"> 
                   <%} %>
                </td>
                <td style="text-align:center">
                   <% if(classAttribute.isMandatory()){%>
                   <input type="checkbox" name="<%=classAttribute.getQuid()%>_bingo_attr_mandatory" value="Y" checked="checked"> 
                   <%}else{ %>
                   <input type="checkbox" name="<%=classAttribute.getQuid()%>_bingo_attr_mandatory" value="Y"> 
                   <%} %>
                </td>
                <td style="text-align:center">
                   <% if(classAttribute.isInsertable()){%>
                   <input type="checkbox" name="<%=classAttribute.getQuid()%>_bingo_attr_insertable" value="Y" checked="checked"> 
                   <%}else{ %>
                   <input type="checkbox" name="<%=classAttribute.getQuid()%>_bingo_attr_insertable" value="Y"> 
                   <%} %>
                </td>
                <td style="text-align:center">
                   <% if(classAttribute.isLov()){%>
                   <input type="checkbox" name="<%=classAttribute.getQuid()%>_bingo_attr_lov" value="Y" checked="checked"> 
                   <%}else{ %>
                   <input type="checkbox" name="<%=classAttribute.getQuid()%>_bingo_attr_lov" value="Y"> 
                   <%} %>
                </td>                
                <td>
                   <select name="<%=classAttribute.getQuid()%>_bingo_attr_updatable" class="">
                      <%
                      FieldUpdatable[] fieldUpdatables  = FieldUpdatable.values();
                      for(int k = 0; k< fieldUpdatables.length; k++){
                      %>
                       <option value="<%=fieldUpdatables[k].name() %>" <%=classAttribute.getUpdatable().compareTo(fieldUpdatables[k])==0 ? "selected=\"selected\"" : "" %>><%=fieldUpdatables[k].name() %></option>  
                      <%} %>  
                   </select>
                </td>
            </tr>
<%}}%>            
          </tbody>
        </table>
        
      </div>
      <div class="tab-pane fade" id="operation">
       todo...
      </div>
      <div class="tab-pane fade" id="association">
      
      
              <table class="multirow-table hovered">
          <thead>
            <tr>
              <th>&nbsp;</th>
              <th>
                <label class="dropdown table-shortcut">
                    <span class="dropdown-toggle" data-toggle="dropdown">
                    <img alt="快捷操作" src="../image/table_menu.gif">
                    </span>
                    <ul class="dropdown-menu" role="menu">
                      <li role="presentation"><a role="menuitem" tabindex="-1" href="#">全选</a></li>
                      <li role="presentation"><a role="menuitem" tabindex="-1" href="#">全不选</a></li>
                      <li role="presentation"><a role="menuitem" tabindex="-1" href="#">反选</a></li>
                      <li role="presentation" class="divider"></li>
                      <li role="presentation"><a role="menuitem" tabindex="-1" href="#">导出...</a></li>
                    </ul>
                 </label>
              </th>
              <th><a href="#">类型</a></th>
              <th><a href="#">关联类</a></th>
              <th><a href="#">角色</a> </th>
              <th><a href="#">主键</a> </th>
              <th><a href="#">必输</a></th>
              <th><a href="#">可插入</a> </th>
              <th><a href="#">值列表</a> </th>
              <th><a href="#">可更新</a></th>
            </tr>
          </thead>
          <tbody>
          
          <%
          ArrayList<Association> associationList = clazz.getAssociationList();
          if(null != associationList){
             Association association = null;
             for (int i = 0; i < associationList.size(); i++) {
                association = associationList.get(i);
             %>
                   
            <tr>
              <td><a href="#"><%=(i+1) %></a></td> 
              <td class="multirow-sys-td">
                  <input type="hidden" name="association_quid" value="<%=association.getQuid()%>"> 
                  <input type="checkbox" value="option1"> 
                  <label class="dropdown">
                    <span class="dropdown-toggle glyphicon glyphicon-tasks" data-toggle="dropdown"></span>
                    <ul class="dropdown-menu" role="menu" >
                      <li role="presentation"><a role="menuitem" tabindex="-1" href="#">复制</a></li>
                      <li role="presentation"><a role="menuitem" tabindex="-1" href="#">部门接收</a></li>
                      <li role="presentation"><a role="menuitem" tabindex="-1" href="#">拒绝</a></li>
                      <li role="presentation" class="divider"></li>
                      <li role="presentation"><a role="menuitem" tabindex="-1" href="#">签字</a></li>
                    </ul>
                  </label>
                  &nbsp;
               </td>
                <td><%=association.getTypeDesc() %></td>
                <td><%=association.getRoleA().getSupplier() %></td>
                <td><%=association.getRoleA().getDisplayName() %></td>
                <td style="text-align:center">
                   <% if(association.isPrimaryKey()){%>
                   <input type="checkbox" name="<%=association.getQuid()%>_bingo_asso_primary_key" value="Y" checked="checked"> 
                   <%}else{ %>
                   <input type="checkbox" name="<%=association.getQuid()%>_bingo_asso_primary_key" value="Y"> 
                   <%} %>
                </td>
                <td style="text-align:center">
                   <% if(association.isMandatory()){%>
                   <input type="checkbox" name="<%=association.getQuid()%>_bingo_asso_mandatory" value="Y" checked="checked"> 
                   <%}else{ %>
                   <input type="checkbox" name="<%=association.getQuid()%>_bingo_asso_mandatory" value="Y"> 
                   <%} %>
                </td>
                <td style="text-align:center">
                <% if(association.isInsertable()){%>
                   <input type="checkbox" name="<%=association.getQuid()%>_bingo_asso_insertable" value="Y" checked="checked"> 
                   <%}else{ %>
                   <input type="checkbox" name="<%=association.getQuid()%>_bingo_asso_insertable" value="Y"> 
                   <%} %>
                </td>
                <td style="text-align:center">
                   <% if(association.isLov()){%>
                   <input type="checkbox" name="<%=association.getQuid()%>_bingo_asso_lov" value="Y" checked="checked"> 
                   <%}else{ %>
                   <input type="checkbox" name="<%=association.getQuid()%>_bingo_asso_lov" value="Y"> 
                   <%} %>
                </td>                
                <td>
                   <select name="<%=association.getQuid()%>_bingo_asso_updatable" class="">
                      <%
                      FieldUpdatable[] fieldUpdatables  = FieldUpdatable.values();
                      for(int k = 0; k< fieldUpdatables.length; k++){
                      %>
                       <option value="<%=fieldUpdatables[k].name() %>" <%=association.getUpdatable().compareTo(fieldUpdatables[k])==0 ? "selected=\"selected\"" : "" %>><%=fieldUpdatables[k].name() %></option>  
                      <%} %>  
                   </select>
                </td>
            </tr>
            
         <%}} %>       
          </tbody>
        </table>
      
      </div>
    </div>
    </div>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="../js/jquery.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="../js/bootstrap.js"></script>
    
    <script type="text/javascript">
    
    
    function submit(){
    	document.form[0].submit();
    }

    function changeFieldType(){
        var ctl = arguments[0];
        var quid = arguments[1];

        var field_type = $('select[name='+quid+'_bingo_attr_field_type]').val();
        var field_format = $('select[name='+quid+'_bingo_attr_format]').empty();

//        $('select[name='+ field_type +'_field_format_select] option').each(function(){
//            field_format.append(this.clone());
//        });
        $('select[name='+ field_type +'_field_format_select] option').clone().appendTo(field_format);

        if(field_type == 'DATE'){
            $('input[name='+quid+'_bingo_attr_length]').val('');
            $('input[name='+quid+'_bingo_attr_length]').addClass('readonly').attr('readonly','readonly');
        }else{
            $('input[name='+quid+'_bingo_attr_length]').removeClass('readonly').removeAttr('readonly');
        }
//        alert(field_type);
    }


    
    </script>
    
    </form>
  </body> 
</html>