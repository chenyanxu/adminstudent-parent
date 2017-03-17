package com.kalix.ar.adminstudent.student.biz;

import com.kalix.ar.adminstudent.student.api.biz.IStudentBeanService;
import com.kalix.ar.adminstudent.student.api.dao.IStudentBeanDao;
import com.kalix.ar.adminstudent.student.entities.StudentBean;
import com.kalix.framework.core.api.persistence.JsonStatus;
import com.kalix.framework.core.impl.biz.ShiroGenericBizServiceImpl;
import com.kalix.framework.core.util.Assert;
import com.kalix.framework.core.util.MD5Util;
import org.apache.commons.lang.StringUtils;

import java.util.List;

/**
 * Created by hqj on 2017-3-7.
 */
public class StudentBeanServiceImpl extends ShiroGenericBizServiceImpl<IStudentBeanDao, StudentBean> implements IStudentBeanService {
    private static final String FUNCTION_NAME = "登录名";

    public StudentBeanServiceImpl() {
        super.init(StudentBean.class.getName());
    }

    @Override
    public Boolean existStudentBeanByLoginName(String loginname) {
        List<StudentBean> studentBeans = dao.find("select ob from StudentBean ob where ob.loginName = ?1", loginname);
        if (studentBeans != null && studentBeans.size() > 0) {
            return true;
        }
        return false;
    }

    @Override
    public void beforeUpdateEntity(StudentBean entity, JsonStatus status) {
        StudentBean userBean = dao.get(entity.getId());

        if (StringUtils.isEmpty(entity.getPassword())) {
            // 密码为空，代表不修改原密码，需要从数据库中读取原密码
            entity.setPassword(userBean.getPassword());
        } else {
            entity.setPassword(MD5Util.encode(entity.getPassword()));
        }
        super.beforeUpdateEntity(entity, status);
    }

    @Override
    public void beforeSaveEntity(StudentBean entity, JsonStatus status) {
        StudentBean userEntity = (StudentBean) entity;
        //密码加密
        if (StringUtils.isNotEmpty(userEntity.getPassword())) {
            userEntity.setPassword(MD5Util.encode(userEntity.getPassword()));
        }

        super.beforeSaveEntity(entity, status);
    }

    @Override
    public boolean isUpdate(StudentBean entity, JsonStatus status) {
        Assert.notNull(entity, "实体不能为空.");
        StudentBean bean = (StudentBean) entity;
        List<StudentBean> userBeans = dao.find("select ob from StudentBean ob where ob.loginName = ?1", bean.getLoginName());
        if (userBeans != null && userBeans.size() > 0) {
            StudentBean _userBean = userBeans.get(0);
            if (entity.getId() != _userBean.getId()) {
                status.setFailure(true);
                status.setMsg(FUNCTION_NAME + "已经存在！");
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isSave(StudentBean entity, JsonStatus status) {
        StudentBean bean = (StudentBean) entity;
        List<StudentBean> userBeans = dao.find("select ob from StudentBean ob where ob.loginName = ?1", bean.getLoginName());
        if (userBeans != null && userBeans.size() > 0) {
            status.setFailure(true);
            status.setMsg(FUNCTION_NAME + "已经存在！");
            return false;
        }
        return true;
    }

    @Override
    public boolean isDelete(Long entityId, JsonStatus status) {
        if (dao.get(entityId) == null) {
            status.setFailure(true);
            status.setMsg(FUNCTION_NAME + "已经被删除！");
            return false;
        }
        return true;
    }
}
