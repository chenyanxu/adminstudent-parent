/**
 * 用户首页
 *
 * @author
 * @version 1.0.0
 */
Ext.define('kalix.adminstudent.student.Main', {
  extend: 'kalix.container.BaseContainer',
  requires: [
    'kalix.adminstudent.student.view.UserGrid',
    'kalix.adminstudent.student.view.UserSearchForm'
  ],
  items: [
    {
      title: '用户查询',
      xtype: 'studentUserSearchForm'
    }, {
      xtype: 'studentUserGridPanel',
      id: 'studentUserGridPanel',
      title: '用户列表'
    }
  ]
});
