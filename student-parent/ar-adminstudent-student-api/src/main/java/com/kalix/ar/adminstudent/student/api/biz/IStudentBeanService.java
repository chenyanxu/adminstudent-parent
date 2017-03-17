package com.kalix.ar.adminstudent.student.api.biz;

import com.kalix.ar.adminstudent.student.entities.StudentBean;
import com.kalix.framework.core.api.biz.IBizService;

/**
 * Created by dell on 14-1-17.
 */
public interface IStudentBeanService extends IBizService<StudentBean> {

    Boolean existStudentBeanByLoginName(String loginname);
}
