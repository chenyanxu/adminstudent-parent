/**
 * 用户数据仓库
 *
 * @author
 * @version 1.0.0
 */
Ext.define('kalix.adminstudent.student.store.UserStore', {
    extend: 'kalix.store.BaseStore',
    model: 'kalix.adminstudent.student.model.UserModel',
    alias: 'store.studentUserStore',
    xtype: 'studentUserStore',
    storeId: "studentUserStore",
    proxyUrl: CONFIG.restRoot + '/camel/rest/students'
});