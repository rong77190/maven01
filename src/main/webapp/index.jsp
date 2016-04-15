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
        $(function () {
        });
        <%--$('#index_regDialog').dialog({--%>
        <%--title:'注册',--%>
        <%--modal:true,--%>
        <%--buttons: [ {--%>
        <%--text: '注册',--%>
        <%--iconCls: 'icon-edit',--%>
        <%--handler:function(){--%>
        <%--$('#index_regForm').form('submit' ,{--%>
        <%--url: '<%=request.getContextPath()%>/userAction!reg.action',--%>
        <%--success: function(data){--%>
        <%--console.info(data);--%>
        <%--//                                var obj = eval("("+data+") ");--%>
        <%--var obj = jQuery.parseJSON(data);//json大括号里面是双引号，不是单引号--%>
        <%--console.info(obj);--%>
        <%--if(obj.success){--%>
        <%--$('#index_regDialog').dialog('close');--%>
        <%--}--%>
        <%--$.messager.show({--%>
        <%--title:'提示',--%>
        <%--msg:obj.msg,--%>
        <%--timeout:5000,--%>
        <%--showType:'slide'--%>
        <%--});--%>
        <%--}--%>
        <%--}--%>

        <%--);--%>
        <%--}--%>
        <%--}  ]--%>
        <%--}).dialog('close');--%>
        //            ajax ajax
        //        if($('#index_Form').form('validate')){
        //            $.ajax({
        //                url: '/userAction!reg.action',
        //                data:$('#index_Form').serialize(),
        ////                {name: $('#index_regForm input[name=name]').val(),
        ////                pwd : $('#index_regForm input[name=pwd]').val()
        ////                }
        //                dataType:'json',
        //                success:function(data, textStatus, jqXHR){
        //                    if(data.success){
        //                        $('#index_regDialog').dialog('close');
        //                    }
        //                    $.messager.show({
        //                        title:'提示',
        //                        msg:obj.msg,
        //                        timeout:5000,
        //                        showType:'slide'
        //                    });
        //                }
        //
        //            })
        //        }

    </script>
</head>
<body class="easyui-layout">
<div data-options="region:'north',title:'North Title',split:true" style="height:100px;"><%=request.getContextPath()%>
    north
</div>
    <div data-options="region:'south',title:'左',split:true" style="height:100px;">south</div>
<div data-options="region:'west',title:'West Title', split:true" style="width:200px;">
    <jsp:include page="layout/left.jsp"></jsp:include>
</div>
<div data-options="region:'center',title:'center title'" style="padding:5px;background:#eee;">
    <jsp:include page="layout/center.jsp"></jsp:include>
</div>

<jsp:include page="user/login.jsp"></jsp:include>

<jsp:include page="user/reg.jsp"></jsp:include>
<h2>Hello Worladadadd!<%=request.getContextPath()%>/</h2>

</body>
</html>
