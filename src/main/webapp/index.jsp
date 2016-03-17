<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML >
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>this is the  start page</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <script type="text/javascript" src="js/jquery-easyui-1.4.4/jquery-1.8.0.min.js"></script>
    <script type="text/javascript" src="js/jquery-easyui-1.4.4/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="js/jquery-easyui-1.4.4/locale/easyui-lang-zh_CN.js"></script>
    <link rel="stylesheet" href="js/jquery-easyui-1.4.4/themes/default/easyui.css" type="text/css"/>
    <link rel="stylesheet" href="js/jquery-easyui-1.4.4/themes/icon.css" type="text/css"/>
    <script type="text/javascript" src="js/syUtil.js"></script>
    <script type="text/javascript">
        $(function(){
            $('#index_regDialog').dialog({
                title:'注册',
                modal:true,
                buttons: [ {
                    text: '注册',
                    iconCls: 'icon-edit',
                    handler:function(){
                        $('#index_regDialog').submit();
                }
            }  ]
        }).dialog('close');

        });
//        $(function(){
//            $('#index_regForm').form({
//                url:' ',
//                onSubmit: function(){
//
//                },
//                success:function(data){
//
//                }
//
//            })
//        });
    </script>
</head>
<body class="easyui-layout">
    <%--<div data-options="region:'north',title:'North Title',split:true" style="height:100px;">north</div>--%>
    <%--<div data-options="region:'south',title:'South Title',split:true" style="height:100px;">south</div>--%>
    <%--<div data-options="region:'west',title:'West',split:true" style="width:100px;">west</div>--%>
    <%--<div data-options="region:'center',title:'center title'" style="padding:5px;background:#eee;">center</div>--%>
    <div data-options="region:'north',title:'North Title',split:true" style="height:100px;">north</div>
    <div data-options="region:'south',title:'左',split:true" style="height:100px;">south</div>
    <div data-options="region:'west',title:'West Title', split:true" style="width:200px;">west</div>
    <div data-options="region:'center',title:'center title'" style="padding:5px;background:#eee;">center</div>

    <div class="easyui-dialog" data-options="title: '登录',modal:true,closable:false,buttons:[{
				text:'注册',
				iconCls:'icon-edit',
				handler:function(){
				    $('#index_regDialog').dialog('open');
				}
			},{
				text:'登录',
				iconCls:'icon-help',
				handler:function(){

				}
			}]">
             <table>
                <tr>
                    <th>登录名:</th>
                    <td><input type="text" /></td>
                </tr>

                <tr>
                    <th>密码:</th>
                    <td><input type="password" /></td>
                </tr>
             </table>
    </div>

    <div id="index_regDialog">
            <table>
                <tr>
                    <th>登录名:</th>
                    <td><input type="text" class="easyui-validatebox" data-options="required:true,missingMessage:'登录名必填' "/></td>
                </tr>

                <tr>
                    <th>密码:</th>
                    <td><input type="password" class="easyui-validatebox" data-options="required:true"/></td>
                </tr>
                <tr>
                    <th>重复密码:</th>
                    <td><input type="password" class="easyui-validatebox" data-options="required:true"/></td>
                </tr>
            </table>
    </div>
    <h2>Hello World!</h2>

</body>
</html>
