<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2016/3/16
  Time: 19:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<div id="user_login_loginDialog" class="easyui-dialog" data-options="title: '登录',modal:true,closable:false,buttons:[{
                  text:'注册',
                  iconCls:'icon-edit',
                  handler:function(){
                      <%--$('#index_regForm').form('load',{name:'',pwd:'',rePwd:''});--%>
                      <%--$('#user_login_regForm').form('load'{name:''});--%>
                      $('#user_reg_regForm   input').val('');
                      $('#user_reg_regDialog').dialog('open');
                  }
              },{
                  text:'登录',
                  iconCls:'icon-help',
                  handler:function(){

                  }
              }]">
    <form id="user_login_loginForm" method="post">
        <table>
            <tr>
                <th>登录名:</th>
                <td><input type="text" name="name" class="easyui-validatebox"
                           data-options="required:true,missingMessage:'登陆名称必填'"/></td>
            </tr>

            <tr>
                <th>密&nbsp;码:</th>
                <td><input type="password" name="pwd" class="easyui-validatebox"
                           data-options="required:true,missingMessage:'密码必填'"/></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
