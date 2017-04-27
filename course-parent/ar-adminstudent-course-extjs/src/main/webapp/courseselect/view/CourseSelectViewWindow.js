/**
 * 选课信息查看表单
 *
 * @author hqj <br/>
 *         date:2017-4-5
 * @version 1.0.0
 */

Ext.define('kalix.adminstudent.courseselect.view.CourseSelectViewWindow', {
    extend: 'kalix.view.components.common.BaseWindow',
    alias: 'widget.courseSelectViewWindow',
    xtype: 'courseSelectViewWindow',
    width: 400,
    items: [{
        defaults: {readOnly: true},
        xtype: 'baseForm',
        items: [
            {
                fieldLabel: '课程名称',
                bind: {
                    value: '{rec.coursename}'
                }
            }, {
                fieldLabel: '学生姓名',
                bind: {
                    value: '{rec.studentname}'
                }
            }, {
                fieldLabel: '课程类型名称',
                bind: {
                    value: '{rec.coursetypename}'
                }
            }, {
                fieldLabel: '授课教师姓名',
                bind: {
                    value: '{rec.teachername}'
                }
            }
        ]
    }]
});