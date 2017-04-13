/**
 * 课程收藏学生信息组件
 *
 * @author hqj <br/>
 *         date:2017-4-8
 * @version 1.0.0
 */
Ext.define('kalix.adminstudent.coursecollect.view.StudentCollectContainer', {
  /*extend: 'kalix.container.BaseTreeContainer',*/
  extend: 'kalix.view.components.common.AutoHPanel',
  requires: [
    'kalix.adminstudent.coursecollect.controller.CourseCollectTreeListController',
    'kalix.adminteacher.course.view.CourseTreeList',
    'kalix.adminstudent.coursecollect.view.CourseCollectStudentGrid',
    'kalix.container.BaseTreeContainer'
  ],
  alias: 'widget.studentCollectContainer',
  xtype: 'studentCollectContainer',
  controller: 'courseCollectTreeListController',
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
      xtype: 'courseCollectStudentGridPanel',
      title: '学生列表',
      flex: 1
    }
  ]
});