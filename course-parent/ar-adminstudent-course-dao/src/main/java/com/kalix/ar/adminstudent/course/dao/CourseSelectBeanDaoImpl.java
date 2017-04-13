package com.kalix.ar.adminstudent.course.dao;

import com.kalix.ar.adminstudent.course.api.dao.ICourseSelectBeanDao;
import com.kalix.ar.adminstudent.course.entities.CourseSelectBean;

import java.util.List;

/**
 * @类描述：
 * @创建人：
 * @创建时间：
 * @修改人：
 * @修改时间：
 * @修改备注：
 */
public class CourseSelectBeanDaoImpl extends BaseAdminDao<CourseSelectBean, Long> implements ICourseSelectBeanDao {

    @Override
    public List<CourseSelectBean> findByFK1(Long fk1) {
        return (List<CourseSelectBean>) this.find("select t from CourseSelectBean t where t.studentid = ?1 ", fk1);
    }

    @Override
    public List<CourseSelectBean> findByFK2(Long fk2) {
        return (List<CourseSelectBean>) this.find("select t from CourseSelectBean t where t.courseid = ?1 ", fk2);
    }

    @Override
    public List test() {
        String sql = "select t from CourseSelectBean t";
        return this.findByNativeSql(sql,CourseSelectBean.class);
    }
}
