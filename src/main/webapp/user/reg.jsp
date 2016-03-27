<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2016/3/25
  Time: 13:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
<div id="user_reg_regDialog" style="width: 250px;" class="easyui-dialog" data-options="title:'注册',closed:true,modal:true,buttons:[{
                  text:'注册',
                  iconCls:'icon-edit',
                  handler:function(){
                              $('#user_reg_regForm').form('submit' ,{
                                  url: '<%=request.getContextPath()%>/userAction!reg.action',
                                  success: function(data){
                                      <%--console.info(data);--%>
                                      <%--var obj = eval("("+data+") ");--%>
                                      var obj = jQuery.parseJSON(data);//json大括号里面是双引号，不是单引号
                                      <%--console.info(obj);--%>
                                      if(obj.success){
                                          $('#user_reg_regDialog').dialog('close');
                                      }
                                      $.messager.show({
                                          title:'提示',
                                          msg:obj.msg,
                                          timeout:5000,
                                          showType:'slide'
                                      });
                                      <%--$.messager.show({--%>
                                          <%--title : '提示',--%>
                                          <%--msg : obj.msg--%>
                                      <%--});--%>
                                      }
                                      }

                                      );
                                      }
                  }]">
    <form id="user_reg_regForm" method="post">
        <table>
            <tr>
                <th>登录名:</th>
                <td><input name="name" type="text" class="easyui-validatebox"
                           data-options="required:true,missingMessage:'登录名必填' "/></td>
            </tr>

            <tr>
                <th>密码:</th>
                <td><input name="pwd" type="password" class="easyui-validatebox" data-options="required:true"/></td>
            </tr>
            <tr>
                <th>重复密码:</th>
                <td><input name="rePwd" type="password" class="easyui-validatebox" data-options="required:true,
                                      validType:'eqPwd[\'#user_reg_regForm input[name=pwd]\']' "/></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
