/**
 * 选课结构 2017-04-05 by p
 *
 */
Ext.define('kalix.adminstudent.courseselect.model.CourseSelectModel', {
    extend: 'kalix.model.BaseModel',
    fields: [
        {name: 'courseid'},
        {name: 'coursename'},
        {name: 'studentid'},
        {name: 'studentname'},
        {name: 'coursetypeid'},
        {name: 'coursetypename'},
        {name: 'teacherid'},
        {name: 'teachername'}
    ]
});