package com.kalix.ar.adminstudent.course.api.biz;

import com.kalix.ar.adminstudent.course.entities.CourseSelectBean;
import com.kalix.framework.core.api.biz.IBizService;
import com.kalix.framework.core.api.persistence.JsonData;

/**
 * @类描述：应用服务接口.
 * @创建人：
 * @创建时间：
 * @修改人：
 * @修改时间：
 * @修改备注：
 */
public interface ICourseSelectBeanService extends IBizService<CourseSelectBean> {

    //在此添加新的业务方法
    JsonData getAllCourseSelect(Integer page, Integer limit, String jsonStr, String sort);

    JsonData getCourseSelectDTOByStudentId(long studentId, Integer page, Integer limit, String jsonStr, String sort);

    JsonData getCourseSelectDTOByCourseId(long courseId, Integer page, Integer limit, String jsonStr, String sort);

    //JsonStatus saveEntityByFK(long fk, CourseBean entity);

    //JsonStatus updateEntityByFK(long fk, CourseBean entity);

    //JsonStatus deleteEntityByFK(long fk, long entityId);

    //List getUserIdsByDutyId(long dutyId);

    //JsonStatus saveDutyUsers(List ids);

    //JsonStatus deleteDuty(long dutyId);

    //List<String> getUserDutyNameList();

    //List<String> getUserListByOrg(long orgId, String dutyName);

    //List<String>  getDutyByUserId(Long userId);

    //List<String> getUserListByOrgName(String orgName, String dutyName);
}
