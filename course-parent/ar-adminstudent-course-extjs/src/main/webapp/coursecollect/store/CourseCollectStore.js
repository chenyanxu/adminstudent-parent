/**
 * 课程收藏数据仓库
 *
 * @author hqj <br/>
 *         date:2017-4-8
 * @version 1.0.0
 */
Ext.define('kalix.adminstudent.coursecollect.store.CourseCollectStore', {
    extend: 'kalix.store.BaseStore',
    model: 'kalix.adminstudent.coursecollect.model.CourseCollectModel',
    alias: 'store.courseCollectStore',
    xtype: 'courseCollectStore',
    storeId: 'courseCollectStore',
    autoLoad:true,
    proxy:{
        type:'ajax',
        url: CONFIG.restRoot + '/camel/rest/coursecollects/courses'
    }
});