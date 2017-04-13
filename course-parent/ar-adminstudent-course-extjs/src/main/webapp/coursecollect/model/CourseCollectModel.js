/**
 * 课程收藏结构 2017-04-08 by p
 *
 */
Ext.define('kalix.adminstudent.coursecollect.model.CourseCollectModel', {
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