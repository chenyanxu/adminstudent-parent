/**
 * 选课信息组件
 *
 * @author hqj <br/>
 *         date:2017-4-1
 * @version 1.0.0
 */
Ext.define('kalix.adminstudent.courseselect.Main', {
  extend: 'Ext.container.Container',
  requires: [
    'kalix.adminstudent.courseselect.view.StudentContainer',
    'kalix.adminstudent.courseselect.view.CourseContainer'
  ],
  items: [
    {
      xtype: 'tabpanel',
      bodyPadding:0,
      items: [
        {
          title:'选课课程信息',
          xtype:'courseContainer',
          tbar:null
        },
        {
          title: '选课学生信息',
          xtype: 'studentContainer'
        }
      ]
    }
  ]
});