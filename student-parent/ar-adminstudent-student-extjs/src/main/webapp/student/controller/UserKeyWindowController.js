/**
 * @author chenyanxu
 */
Ext.define('kalix.adminstudent.student.controller.UserKeyWindowController', {
    extend: 'kalix.adminstudent.student.controller.UserWindowController',
    alias: 'controller.studentUserKeyWindowController',
    onClose:function(){
        var model=this.getView().lookupViewModel().get('rec');

        if(model.dirty) {
            model.set(model.modified);
            model.dirty = false;
        }
    }
});
