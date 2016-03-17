<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 加载jquery -->
<script type="text/javascript" src="resources/api/jquery-2.1.1.min.js"></script>   
<script type="text/javascript" src="resources/api/jquery-ui.min.js"></script>   
<script type="text/javascript" src="resources/api/select-widget-min.js"></script>   
<!-- 加载esayui -->
<link rel="stylesheet" type="text/css" href="resources/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="resources/easyui/themes/icon.css">   
<script type="text/javascript" src="resources/easyui/jquery.easyui.min.js"></script> 
<script type="text/javascript" src="resources/easyui/easyui-lang-zh_CN.js"></script>
<!-- 加载arcgisJS -->
<script type="text/javascript" src="http://localhost:8080/arcgisjs/3.13/init.js"></script>
<link rel="stylesheet" type="text/css" href="http://localhost:8080/arcgisjs/3.13/dijit/themes/tundra/tundra.css"></link>
<link rel="stylesheet" type="text/css" href="http://localhost:8080/arcgisjs/3.13/esri/css/esri.css" />
<!-- 界面管理JS -->
<script type="text/javascript" src="resources/js/index.js"></script>
<script type="text/javascript" src="resources/js/map/mapManager.js"></script>
<script type="text/javascript" src="resources/js/map/tdtLayer.js"></script>

<link rel="stylesheet" type="text/css" href="resources/css/index.css" />

<title>油气矿业权人信息分析系统</title>
</head>
<body class="easyui-layout" data-options="border:false" >
 	 <div  id="tt_layout" data-options="region:'center',border:false" >
        	<div class="easyui-tabs" style="width:100%;height:100%;" data-options="fit:true,border:false">
        		<div title="地图" id="mapLayout"  class="easyui-layout" data-options="fit:true,border:false" >
        			<div  id="tt_layout" data-options="fit:true,region:'center',border:false" >
        				<div id="arcgisDiv" style="width:100%;height:100%;"></div>
        			</div>
        			<div class="btndiv">
        				<input type="button" onclick="MapManager.switchMap(0);" value="专题底图"></input>
						<input type="button" onclick="MapManager.switchMap(1);" value="地形图"></input>
						<input type="button" onclick="MapManager.switchMap(2);" value="矢量图"></input>
						<input type="button" onclick="MapManager.switchMap(3);" value="影像图"></input>
					</div>
        		</div>
        		<div title="矿权人信息管理"  id="kqrDiv" data-options="border:false">
	        		<div class="easyui-layout" style="width:100%;height:100%;" >
						<div data-options="region:'center',split:true,border:true">
							<table id="kqrGrid" data-options="singleSelect:true"></table>
						</div>
					</div>
        		</div>
       		</div>
	</div>
</body>
</html>