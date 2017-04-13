/**
 * 选课课程信息组件
 *
 * @author hqj <br/>
 *         date:2017-4-1
 * @version 1.0.0
 */
Ext.define('kalix.adminstudent.courseselect.view.CourseContainer', {
  /*extend: 'Ext.container.Container',*/
  extend: 'kalix.container.BaseContainer',
  alias: 'widget.courseContainer',
  xtype: 'courseContainer',
  requires: [
      'kalix.adminstudent.courseselect.view.CourseSelectSearchForm',
      'kalix.adminstudent.courseselect.view.CourseSelectGrid'
  ],
  items: [
    {
      title: '选课查询',
      xtype: 'courseSelectSearchForm'
    }, {
      title: '选课列表',
      xtype: 'courseSelectGridPanel'
    }
  ]
});