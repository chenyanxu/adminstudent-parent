/**
 * 课程收藏学生表格
 * @author hqj <br/>
 *         date:2017-4-8
 * @version 1.0.0
 */
Ext.define('kalix.adminstudent.coursecollect.view.CourseCollectStudentGrid', {
  extend: 'kalix.adminstudent.coursecollect.view.CourseCollectGrid',
  alias: 'widget.courseCollectStudentGrid',
  xtype: 'courseCollectStudentGridPanel',
  constructor:function(){

    var column3=this.columns[3];
    var column5=this.columns[5];

    this.columns[3]=column5;
    this.columns[5]=column3;

    this.callParent(arguments);
  }
});
