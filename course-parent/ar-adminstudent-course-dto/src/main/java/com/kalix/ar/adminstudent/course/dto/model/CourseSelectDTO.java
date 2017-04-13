package com.kalix.ar.adminstudent.course.dto.model;

import com.kalix.framework.core.api.web.model.BaseDTO;

/**
 * 学生选课模型类
 * @author hqj date:2017-4-1
 * @version 1.0.0
 */
public class CourseSelectDTO extends BaseDTO {

    private Long courseid;
    private String coursename;
    private Long studentid;
    private String studentname;
    private Long coursetypeid;
    private String coursetypecode;
    private String coursetypename;
    private Long teacherid;
    private String teachername;

    public Long getCourseid() {
        return courseid;
    }

    public void setCourseid(Long courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public Long getStudentid() {
        return studentid;
    }

    public void setStudentid(Long studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public Long getCoursetypeid() {
        return coursetypeid;
    }

    public void setCoursetypeid(Long coursetypeid) {
        this.coursetypeid = coursetypeid;
    }

    public String getCoursetypecode() {
        return coursetypecode;
    }

    public void setCoursetypecode(String coursetypecode) {
        this.coursetypecode = coursetypecode;
    }

    public String getCoursetypename() {
        return coursetypename;
    }

    public void setCoursetypename(String coursetypename) {
        this.coursetypename = coursetypename;
    }

    public Long getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(Long teacherid) {
        this.teacherid = teacherid;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }
}
