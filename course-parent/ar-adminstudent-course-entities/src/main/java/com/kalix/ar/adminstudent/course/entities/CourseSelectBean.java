package com.kalix.ar.adminstudent.course.entities;

import com.kalix.framework.core.api.annotation.KalixCascade;
import com.kalix.framework.core.api.annotation.TableCascade;
import com.kalix.framework.core.api.persistence.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 选课关联实体类
 *
 * @author hqj <br/>
 *         date:2017-3-30
 *
 * @修改人：
 * @修改时间：
 * @修改备注：
 */
@Entity
@Table(name = "adminstudent_course_select")
/*@TableCascade(kalixCascades = {
        @KalixCascade(beans = "com.kalix.ar.adminstudent.student.entities.StudentBean", deletable = true, foreignKey = "studentid"),
        @KalixCascade(beans = "com.kalix.ar.adminteacher.course.entities.CourseBean", deletable = true, foreignKey = "courseid")
})*/
public class CourseSelectBean extends PersistentEntity {

    private Long studentid;     //学生id
    private Long courseid;      //课程id
    private Double coursesrate; //所学课程的进度

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

    public Double getCoursesrate() {
        return coursesrate;
    }

    public void setCoursesrate(Double coursesrate) {
        this.coursesrate = coursesrate;
    }
}
