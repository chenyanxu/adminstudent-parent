/**
 * 选课学生表格
 * @author hqj <br/>
 *         date:2017-4-8
 * @version 1.0.0
 */
Ext.define('kalix.adminstudent.courseselect.view.CourseSelectStudentGrid', {
  extend: 'kalix.adminstudent.courseselect.view.CourseSelectGrid',
  alias: 'widget.courseSelectStudentGrid',
  xtype: 'courseSelectStudentGridPanel',
  constructor:function(){

    var column3=this.columns[3];
    var column5=this.columns[5];

    this.columns[3]=column5;
    this.columns[5]=column3;

    this.callParent(arguments);
  }
});
