/**
 * Created by hqj on 2017/4/5.
 */

Ext.define('kalix.adminstudent.courseselect.view.CourseSelectSearchForm', {
    extend: 'kalix.view.components.common.BaseSearchForm',
    requires: [
        'kalix.view.components.common.BaseComboBox'
    ],
    alias: 'widget.courseSelectSearchForm',
    xtype: 'courseSelectSearchForm',
    items: [
        {
            xtype: 'baseComboBox',
            fieldLabel: '学生姓名',
            labelAlign: 'right',
            labelWidth: 60,
            width: 200,
            name: 'studentid',
            valueField: 'id',
            displayField: 'name',
            store: Ext.create('kalix.store.BaseStore', {
                autoLoad: true,
                proxyUrl: CONFIG.restRoot + '/camel/rest/students'
            }),
            queryParam: '%name%'
        }
    ]
});
