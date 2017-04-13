package com.kalix.ar.adminstudent.course.api.dao;

import com.kalix.ar.adminstudent.course.entities.CourseSelectBean;
import com.kalix.framework.core.api.dao.IGenericDao;

import java.util.List;

/**
 * @类描述：DAO接口
 * @创建人：
 * @创建时间：
 * @修改人：
 * @修改时间：
 * @修改备注：
 */
public interface ICourseSelectBeanDao extends IGenericDao<CourseSelectBean, Long> {

    //在此添加新的DAO方法

    /**
     * 通过学生id查找选课信息 2017-03-30 by p
     *
     * @param fk1
     * @return
     */
    List<CourseSelectBean> findByFK1(Long fk1);

    /**
     * 通过选课id查找学生信息 2017-03-30 by p
     *
     * @param fk2
     * @return
     */
    List<CourseSelectBean> findByFK2(Long fk2);

    List test();
}
