<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2016/3/16
  Time: 19:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript">
    $(function () {
        $('#user_login_loginForm').form({
            url: '<%=request.getContextPath()%>/userAction!login.action',
            success: function (data) {
                <%--console.info(data);--%>
                <%--var obj = eval("("+data+") ");--%>
                var obj = jQuery.parseJSON(data);//json大括号里面是双引号，不是单引号
                <%--console.info(obj);--%>
                if (obj.success) {
                    $('#user_login_loginDialog').dialog('close');
                }
                $.messager.show({
                    title: '提示',
                    msg: obj.msg,
                    timeout: 5000,
                    showType: 'slide'
                });
                <%--$.messager.show({--%>
                <%--title : '提示',--%>
                <%--msg : obj.msg--%>
                <%--});--%>
            }
        });

        $('#user_login_loginForm input').bind('keyup', function (event) {/* 增加回车提交功能 */
            if (event.keyCode == '13') {
                $('#user_login_loginForm').submit();
            }
        });
        window.setTimeout(function () {
            $('#user_login_loginForm input[name=name]').focus();
        }, 0);
    });
</script>
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
                        $('#user_login_loginForm').submit();
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
