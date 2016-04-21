<%@ page language="java" pageEncoding="UTF-8" %>
<link rel="stylesheet" type="text/css" href="../../themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="../../themes/icon.css">

<div style="margin:20px 0;"></div>
<div class="easyui-panel" data-options="title:'功能导航',fit:true,border:false">
    <div class="easyui-accordion" data-options="fit:true,border:false">
        <div title="系统菜单" data-options="iconCls:'icon-save'" style="overflow:auto;padding:10px;">
            <ul id="layout_west_tree" class="easyui-tree" data-options="
            url:'<%=request.getContextPath()%>/menuAction!getTreeNode.action'

            "></ul>
        </div>
        <div title="11" data-options="">
            content2
        </div>
    </div>
</div>