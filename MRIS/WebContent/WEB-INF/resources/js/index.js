/**
 * 
 */
$(function(){
	//地图加载
	MapManager.init();
	
	//初始化矿权人数据
	$('#kqrGrid').datagrid({   //定位到Table标签，Table标签的ID是userGrid
        url: 'user/list',   //指向后台的Action来获取当前菜单的信息的Json格式的数据
        iconCls: 'icon-view',
        height: function () { return document.body.clientHeight * 0.9 },
        width: function () { return document.body.clientWidth * 0.9 },
        nowrap: true,
        autoRowHeight: false,
        singleSelect: true,
        striped: true,
        collapsible: true,
        pagination: true,
        pageList:[10,20,30,40,50],
	    pageSize:20,
        rownumbers: true,
        columns: [[
                   {field:'password', 		title:'密码',    width:100,height:40, hidden:true},
                   {field:'type',    title:'用户类型',  width:100,height:40},
                   {field:'username',    title:'用户名',  width:100,height:40},  //,editor:'textbox' 
                   {field:'company', title:'单位名称',    width:100,height:40},
                   {field:'addr',  title:'单位地址',    width:150,height:40},
                   {field:'phone', title:'联系电话',    width:100,height:40 },
                   {field:'email',  title:'联系邮箱',    width:150,height:40 },
        ]],
        toolbar: [{
            id: 'btnAdd',
            text: '添加',
            iconCls: 'icon-add',
           // handler: this.ShowAddDialog,
        }, '-', {
            id: 'btnEdit',
            text: '修改',
            iconCls: 'icon-edit',
          //  handler: this.EditUser,
        }, '-', {
            id: 'btnDelete',
            text: '删除',
            iconCls: 'icon-remove',
            handler: function () {
            //    Delete();//实现直接删除数据的方法
            }
        }]
    });
}
);