package com.kalix.ar.adminstudent.course.dao;

import com.kalix.ar.adminstudent.course.api.dao.ICourseCollectBeanDao;
import com.kalix.ar.adminstudent.course.entities.CourseCollectBean;

import java.util.List;

/**
 * @类描述：
 * @创建人：
 * @创建时间：
 * @修改人：
 * @修改时间：
 * @修改备注：
 */
public class CourseCollectBeanDaoImpl extends BaseAdminDao<CourseCollectBean, Long> implements ICourseCollectBeanDao {

    @Override
    public List<CourseCollectBean> findByFK1(Long fk1) {
        return (List<CourseCollectBean>) this.find("select t from CourseCollectBean t where t.studentid = ?1 ", fk1);
    }

    @Override
    public List<CourseCollectBean> findByFK2(Long fk2) {
        return (List<CourseCollectBean>) this.find("select t from CourseCollectBean t where t.courseid = ?1 ", fk2);
    }
}
