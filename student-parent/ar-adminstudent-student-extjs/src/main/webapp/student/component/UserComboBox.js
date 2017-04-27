/**
 * 用户选择下拉comboBox
 *
 * @author chenyanxu <br/>
 *         date:2015-6-18
 * @version 1.0.0
 */
Ext.define('kalix.adminstudent.student.component.UserComboBox', {
    extend:'kalix.view.components.common.BaseComboBox',
    requires: [
        'kalix.adminstudent.student.store.UserStore'
    ],
    alias: 'widget.studentUserComboBox',
    allowBlank: false,
    labelAlign: 'right',
    xtype: 'studentUserCombobox',
    queryMode: 'remote',
    valueField: 'name',
    displayField: 'name',
    queryParam: '%name%',
    typeAhead:true,
    store: {
        type: 'studentUserStore',
        autoLoad: true
    }
});
