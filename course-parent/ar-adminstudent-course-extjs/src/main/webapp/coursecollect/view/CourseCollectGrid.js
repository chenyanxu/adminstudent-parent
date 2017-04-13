/**
 * 课程收藏表格
 * @author hqj <br/>
 *         date:2017-4-8
 * @version 1.0.0
 */
Ext.define('kalix.adminstudent.coursecollect.view.CourseCollectGrid', {
  extend: 'kalix.view.components.common.BaseGrid',
  requires: [
    'kalix.adminstudent.coursecollect.controller.CourseCollectGridController',
    'kalix.adminstudent.coursecollect.store.CourseCollectStore',
    'kalix.view.components.common.SecurityGridColumnCommon',
    'kalix.view.components.common.IconColumn'
  ],
  alias: 'widget.courseCollectGrid',
  xtype: 'courseCollectGridPanel',
  controller: {
    type: 'courseCollectGridController',
    /*cfgForm: 'kalix.adminstudent.student.view.UserWindow',*/
    cfgViewForm: 'kalix.adminstudent.coursecollect.view.CourseCollectViewWindow',
    cfgModel: 'kalix.adminstudent.coursecollect.model.CourseCollectModel'
  },
  store: {
    type: 'courseCollectStore'
  },
  columns: [
    {
      xtype: 'rownumberer'
    },
    {
      text: '编号',
      dataIndex: 'id',
      hidden: true
    },
    {
      text: '课程id',
      dataIndex: 'courseid',
      hidden: true
    },
    {
      text: '课程名称',
      dataIndex: 'coursename'
    },
    {
      text: '学生id',
      dataIndex: 'studentid',
      hidden: true
    },
    {
      text: '学生姓名',
      dataIndex: 'studentname'
    },
    {
      text: '课程类型id',
      dataIndex: 'coursetypeid',
      hidden: true
    },
    {
      text: '课程类型名称',
      dataIndex: 'coursetypename'
    },
    {
      text: '授课教师id',
      dataIndex: 'teacherid',
      hidden: true
    },
    {
      text: '授课教师姓名',
      dataIndex: 'teachername'
    },
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
      xtype: 'securityGridColumnCommon',
      flex: 0,
      width: 150,
      verifyItems: [{
        iconCls: 'iconfont icon-view-column',
        permission: 'view',
        tooltip: '查看',
        handler: 'onView'
      }
      ]
    }
  ]
});
