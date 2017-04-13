/**
 * 课程收藏信息组件
 *
 * @author hqj <br/>
 *         date:2017-4-6
 * @version 1.0.0
 */
Ext.define('kalix.adminstudent.coursecollect.Main', {
  extend: 'Ext.container.Container',
  requires: [
      'kalix.adminstudent.coursecollect.view.StudentCollectContainer',
      'kalix.adminstudent.coursecollect.view.CourseCollectContainer'
  ],
  items: [
    {
      xtype: 'tabpanel',
      bodyPadding:0,
      items: [
        {
          title:'收藏课程信息',
          xtype:'courseCollectContainer',
          tbar:null
        },
        {
          title: '收藏学生信息',
          xtype: 'studentCollectContainer'
        }
      ]
    }
  ]
});