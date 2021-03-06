/**
 * 用户表格
 * @author majian <br/>
 *         date:2015-7-3
 * @version 1.0.0
 */
Ext.define('kalix.adminstudent.student.view.UserGrid', {
  extend: 'kalix.view.components.common.BaseGrid',
  requires: [
    'kalix.adminstudent.student.controller.UserGridController',
    'kalix.adminstudent.student.store.UserStore',
    'kalix.view.components.common.SecurityGridColumnCommon',
    'kalix.view.components.common.IconColumn'
  ],
  alias: 'widget.studentUserGrid',
  xtype: 'studentUserGridPanel',
  controller: {
    type: 'studentUserGridController',
    cfgForm: 'kalix.adminstudent.student.view.UserWindow',
    cfgViewForm: 'kalix.adminstudent.student.view.UserViewWindow',
    cfgModel: 'kalix.adminstudent.student.model.UserModel'
  },
  store: {
    type: 'studentUserStore'
  },
  viewConfig:{
    //stripeRows: false,//是否隔行换色
    getRowClass : function(record,rowIndex,rowParams,store){
      var type = record.get('available');

      if(type==0){
        return 'x-grid-row-red';
      }
    }
  },
  columns: [
    {
      xtype: 'rownumberer'
    },
    {
      text: '头像',
      xtype: 'iconcolumn',
      dataIndex: 'icon'
    },
    {
      text: '编号',
      dataIndex: 'id',
      hidden: true
    },
    {
      text: '登录名',
      dataIndex: 'loginName'
    },
    {
      text: '姓名',
      dataIndex: 'name'
    },
    {
      text: '性别',
      dataIndex: 'sex'
    },
    /*{
     text: '邮箱',
     dataIndex: 'email'
     },*/ /*{
     text: '电话',
     dataIndex: 'phone',
     },
     {
     text: '手机',
     dataIndex: 'mobile'
     },*/
    {
      text: '创建人',
      dataIndex: 'createBy'
    },
    {
      text: '创建日期',
      dataIndex: 'creationDate',
      flex: 2
    },
    {
      text: '角色',
      dataIndex: 'role'
    },
    {
      text: '状态',
      dataIndex: 'available',
      renderer: function (value) {
        if (value != null && value == '1') {
          return '启用';
        }
        return '停用';
      }
    },
    {
      xtype: 'securityGridColumnCommon',
      flex: 0,
      width: 150,
      verifyItems: [{
        iconCls: 'iconfont icon-view-column',
        permission: 'view',
        tooltip: '查看',
        handler: 'onView'
      },
        {
          //iconCls: 'iconfont icon-edit-column',
          getClass: function (v, meta, record) {
            if (record.data.available == 1) {
              return 'iconfont icon-edit-column';
            }
            else {
              return 'kalix_hidden';
            }
          },
          permission: 'edit',
          tooltip: '编辑',
          handler: 'onEdit'
        },
        {
          getClass: function (v, meta, record) {
            if (record.data.available==1) {
              return 'iconfont icon-stop-using';
            }
            else{
              return 'iconfont icon-start-using';
            }
          },
          getTip: function (value, metadata, record, row, col, store) {
            if (record.data.available==1) {
              return '停用';
            }
            else{
              return '启用';
            }
          },
          permission: 'startStopUsing',
          handler: 'onStartStopUsing'
        },
        {
          //iconCls: 'iconfont icon-password-reset',
          getClass: function (v, meta, record) {
            if (record.data.available == 1) {
              return 'iconfont icon-password-reset';
            }
            else {
              return 'kalix_hidden';
            }
          },
          permission: 'key',
          tooltip: '重置密码',
          handler: 'onKey'
        }
        , {
          iconCls: 'iconfont icon-permission-column',
          permission: 'auth',
          tooltip: '权限查看',
          handler: 'onAuthorization'
        }
      ]
    }
  ],
  tbar: {
    xtype: 'securityToolbar',
    verifyItems: [
      {
        text: '添加',
        xtype: 'button',
        permission: 'add',
        iconCls: 'iconfont icon-add',
        handler: 'onAdd'
      }
    ]
  }
});
