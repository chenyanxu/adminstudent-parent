/**
 * 课程模块控制器
 *
 * @author hqj <br/>
 *         date:2017-4-8
 * @version 1.0.0
 */
Ext.define('kalix.adminstudent.coursecollect.controller.CourseCollectTreeListController', {
    extend: 'kalix.adminteacher.course.controller.CourseTreeListController',
    alias: 'controller.courseCollectTreeListController',
    onItemClick: function (view, record, item, index, e) {
        var courseCollectGrid = this.getView().items.getAt(1);
        var store = courseCollectGrid.store;
        if (record.data.code == "course") {
            store.proxy.url = CONFIG.restRoot +'/camel/rest/coursecollects/' + record.data.id + '/students';
            store.reload();
            /*store.proxy.url = CONFIG.restRoot +'/camel/rest/coursecollects/courses';
            var jsonStr = {
                'courseid': record.data.id
            };
            jsonStr = Ext.JSON.encode(jsonStr);
            store.proxy.extraParams = {'jsonStr': jsonStr};
            store.reload();*/
        }
        else {
            /*view.setSelection(null);*/
            store.proxy.url = CONFIG.restRoot +'/camel/rest/coursecollects/courses';
            var jsonStr = {
                'coursetypecode': record.data.code+'%'
            };
            jsonStr = Ext.JSON.encode(jsonStr);
            store.proxy.extraParams = {'jsonStr': jsonStr};
            store.reload();
        }
    }
});
