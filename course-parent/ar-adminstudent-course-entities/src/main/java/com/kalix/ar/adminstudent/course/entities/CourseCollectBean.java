package com.kalix.ar.adminstudent.course.entities;

import com.kalix.framework.core.api.annotation.KalixCascade;
import com.kalix.framework.core.api.annotation.TableCascade;
import com.kalix.framework.core.api.persistence.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 课程收藏关联实体类
 *
 * @author hqj <br/>
 *         date:2017-3-30
 *
 * @修改人：
 * @修改时间：
 * @修改备注：
 */
@Entity
@Table(name = "adminstudent_course_collect")
@TableCascade(kalixCascades = {
        @KalixCascade(beans = "com.kalix.ar.adminstudent.student.entities.StudentBean", deletable = true, foreignKey = "studentid"),
        @KalixCascade(beans = "com.kalix.ar.adminteacher.course.entities.CourseBean", deletable = true, foreignKey = "courseid")
})
public class CourseCollectBean extends PersistentEntity {

    private Long studentid;     //学生id
    private Long courseid;      //课程id

    public Long getStudentid() {
        return studentid;
    }

    public void setStudentid(Long studentid) {
        this.studentid = studentid;
    }

    public Long getCourseid() {
        return courseid;
    }

    public void setCourseid(Long courseid) {
        this.courseid = courseid;
    }
}
