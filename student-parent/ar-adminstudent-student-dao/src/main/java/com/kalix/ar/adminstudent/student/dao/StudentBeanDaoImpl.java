package com.kalix.ar.adminstudent.student.dao;

import com.kalix.ar.adminstudent.student.api.dao.IStudentBeanDao;
import com.kalix.ar.adminstudent.student.entities.StudentBean;
import com.kalix.framework.core.impl.dao.UserEntityDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Administrator on 2017/3/3.
 */
public class StudentBeanDaoImpl extends UserEntityDao<StudentBean,Long> implements IStudentBeanDao {

    @Override
    @PersistenceContext(unitName = "ar-adminstudent-student-unit")
    public void setEntityManager(EntityManager em) {
        super.setEntityManager(em);
    }
}
