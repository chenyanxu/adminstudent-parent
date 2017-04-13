/**
 * 选课数据仓库
 *
 * @author hqj <br/>
 *         date:2017-4-5
 * @version 1.0.0
 */
Ext.define('kalix.adminstudent.courseselect.store.CourseSelectStore', {
    extend: 'kalix.store.BaseStore',
    model: 'kalix.adminstudent.courseselect.model.CourseSelectModel',
    alias: 'store.courseSelectStore',
    xtype: 'courseSelectStore',
    storeId: 'courseSelectStore',
    autoLoad: true,
    proxy:{
        type:'ajax',
        url: CONFIG.restRoot + '/camel/rest/courseselects/courses'
    }
});