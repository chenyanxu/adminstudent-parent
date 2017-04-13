/**
 * 选课学生信息组件
 *
 * @author hqj <br/>
 *         date:2017-4-7
 * @version 1.0.0
 */
Ext.define('kalix.adminstudent.courseselect.view.StudentContainer', {
  /*extend: 'kalix.container.BaseTreeContainer',*/
  extend: 'kalix.view.components.common.AutoHPanel',
  requires: [
    'kalix.adminstudent.courseselect.controller.CourseSelectTreeListController',
    'kalix.adminteacher.course.view.CourseTreeList',
    'kalix.adminstudent.courseselect.view.CourseSelectStudentGrid',
    'kalix.container.BaseTreeContainer'
  ],
  alias: 'widget.studentContainer',
  xtype: 'studentContainer',
  controller: 'courseSelectTreeListController',
  items: [
    {
      xtype:'baseTreeContainer',
      title:'课程列表',
      iconCls: 'iconfont icon-organization-management',
      width:400,
      childItemMargin:0,
      tree: {
        xtype: 'courseTreeList',
        title:'',
        iconCls:'',
        /*reference:'courseAndTypeTreeList',*/
        listeners: {
          itemClick: 'onItemClick'
        },
        tbar:null,
      }
    },
    {
      xtype: 'courseSelectStudentGridPanel',
      title: '学生列表',
      flex: 1
    }
  ]
});