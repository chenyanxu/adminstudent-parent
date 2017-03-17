/**
 * 用户选择下拉comboBox
 *
 * @author chenyanxu <br/>
 *         date:2015-6-18
 * @version 1.0.0
 */
Ext.define('kalix.adminstudent.student.component.UserTagField', {
    extend: 'Ext.form.field.Tag',
    requires: [
        'kalix.adminstudent.student.store.UserStore'
    ],
    alias: 'widget.studentUserTagField',
    labelAlign: 'right',
    xtype: 'studentUserTagField',
    queryMode: 'remote',
    valueField: 'name',
    displayField: 'name',
    queryParam: 'jsonStr',
    minChars: 1,
    typeAhead: false,
    filterPickList: true,
    autoSelect:false,
    store: {
        type: 'studentUserStore'
    },
    getParams: function (queryString) {
        var params = {},
            param = this.queryParam;

        if (param) {
            params[param] = '{"%' + this.displayField + '%":"' + queryString + '"}';
        }

        return params;
    },
    listeners:{
        change:function () {
            this.ariaEl.dom.value='';
            this.collapse();
        }
    }
});
