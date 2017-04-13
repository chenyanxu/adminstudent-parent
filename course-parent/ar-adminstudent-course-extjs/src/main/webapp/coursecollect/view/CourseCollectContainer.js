/**
 * 收藏课程信息组件
 *
 * @author hqj <br/>
 *         date:2017-4-8
 * @version 1.0.0
 */
Ext.define('kalix.adminstudent.coursecollect.view.CourseCollectContainer', {
  /*extend: 'Ext.container.Container',*/
  extend: 'kalix.container.BaseContainer',
  alias: 'widget.courseCollectContainer',
  xtype: 'courseCollectContainer',
  requires: [
      'kalix.adminstudent.coursecollect.view.CourseCollectSearchForm',
      'kalix.adminstudent.coursecollect.view.CourseCollectGrid'
  ],
  items: [
    {
      title: '选课查询',
      xtype: 'courseCollectSearchForm'
    }, {
      title: '选课列表',
      xtype: 'courseCollectGridPanel'
    }
  ]
});