package com.kalix.ar.adminstudent.course.biz;

import com.kalix.ar.adminstudent.course.api.biz.ICourseCollectBeanService;
import com.kalix.ar.adminstudent.course.api.dao.ICourseCollectBeanDao;
import com.kalix.ar.adminstudent.course.dto.model.CourseCollectDTO;
import com.kalix.ar.adminstudent.course.entities.CourseCollectBean;
import com.kalix.ar.core.api.biz.CommonMethod;
import com.kalix.framework.core.api.persistence.JsonData;
/*import com.kalix.framework.core.api.persistence.JsonStatus;*/
import com.kalix.framework.core.impl.biz.ShiroGenericBizServiceImpl;

import java.util.List;

/**
 * @类描述： 
 * @创建人：  
 * @创建时间： 
 * @修改人：
 * @修改时间：
 * @修改备注：
 */
public class CourseCollectBeanServiceImpl extends ShiroGenericBizServiceImpl<ICourseCollectBeanDao, CourseCollectBean> implements ICourseCollectBeanService {

    /*private JsonStatus jsonStatus = new JsonStatus();*/
    /*private ICourseBeanService courseBeanService;*/
    private static String BASE_SQL = " select t1.id,t1.courseid,t2.name coursename,t1.studentid,t3.name studentname," +
            "t2.coursetypeid,t4.code coursetypecode,t4.name coursetypename,t2.teacherid,t5.name teachername " +
            " from adminstudent_course_collect t1,adminteacher_course t2,sys_user_student t3," +
            "adminteacher_coursetype t4,sys_user_teacher t5 " +
            " where t1.courseid = t2.id and t1.studentid = t3.id and " +
            "t2.coursetypeid = t4.id and t2.teacherid = t5.id ";

    public CourseCollectBeanServiceImpl() {
        super.init(CourseCollectBean.class.getName());
    }

    @Override
    public JsonData getAllCourseCollect(Integer page, Integer limit, String jsonStr, String sort) {

        /*List list = this.dao.getAll();
        return listCoursesToJson(list);*/

        /*JsonData jsonData = new JsonData();*/
        /*String sql = "select t1.id,t1.courseid,t2.name coursename,t1.studentid,t3.name studentname," +
                "t2.coursetypeid,t4.name coursetypename,t2.teacherid,t5.name teachername " +
                " from adminstudent_course_collect t1,adminteacher_course t2,sys_user_student t3," +
                "adminteacher_coursetype t4,sys_user_teacher t5 " +
                " where t1.courseid = t2.id and t1.studentid = t3.id and " +
                "t2.coursetypeid = t4.id and t2.teacherid = t5.id " + jsonStr +
                " order by t1.id limit " + limit + " offset " + page*limit;*/
        String sql = "select * from (" + BASE_SQL + ") t ";
        /*sql = sql + CommonMethod.createPagedQueryCondition(page, limit, jsonStr, sort);*/
        sql = sql + CommonMethod.createWhereCondition(jsonStr, sort);
        /*List list = this.dao.findByNativeSql(sql, CourseCollectDTO.class);
        jsonData.setData(list);*/
        return this.dao.findByNativeSql(sql, page, limit, CourseCollectDTO.class);

        /*String whereCondition = CommonMethod.createWhereCondition(jsonStr);
        String count_sql = "select count(1) from (" + BASE_SQL + ") t ";
        if (!whereCondition.equals("")) {
            count_sql = count_sql + " where " + whereCondition;
        }
        List countRtn = this.dao.findByNativeSql(count_sql, java.lang.Long.class);
        jsonData.setTotalCount((long) countRtn.get(0));

        return jsonData;*/
    }

    @Override
    public JsonData getCourseCollectDTOByStudentId(long studentId, Integer page, Integer limit, String jsonStr, String sort) {

        /*JsonData jsonData = new JsonData();*/
        if (studentId == -100) {
            studentId = shiroService.getCurrentUserId();
        }
        //List list = this.dao.findByFK1(studentId);
        //return listCoursesToJson(list);

        /*String sql = "select t1.id,t1.courseid,t2.name coursename,t1.studentid,t3.name studentname," +
                "t2.coursetypeid,t4.name coursetypename,t2.teacherid,t5.name teachername " +
                " from adminstudent_course_collect t1,adminteacher_course t2,sys_user_student t3," +
                "adminteacher_coursetype t4,sys_user_teacher t5 " +
                " where t1.courseid = t2.id and t1.studentid = t3.id and " +
                "t2.coursetypeid = t4.id and t2.teacherid = t5.id and t1.studentid = ?1";*/
        String sql = "select * from (" + BASE_SQL + " and t1.studentid = ?1) t ";
        /*sql = sql + CommonMethod.createPagedQueryCondition(page, limit, jsonStr, sort);*/
        sql = sql + CommonMethod.createWhereCondition(jsonStr, sort);
        /*List list = this.dao.findByNativeSql(sql, CourseCollectDTO.class, studentId);
        jsonData.setData(list);*/
        return this.dao.findByNativeSql(sql, page, limit, CourseCollectDTO.class, studentId);

        /*String whereCondition = CommonMethod.createWhereCondition(jsonStr);
        String count_sql = "select count(1) from (" + BASE_SQL + " and t1.studentid = ?1) t ";
        if (!whereCondition.equals("")) {
            count_sql = count_sql + " where " + whereCondition;
        }
        List countRtn = this.dao.findByNativeSql(count_sql, java.lang.Long.class, studentId);
        jsonData.setTotalCount((long) countRtn.get(0));

        return jsonData;*/
    }

    @Override
    public JsonData getCourseCollectDTOByCourseId(long courseId, Integer page, Integer limit, String jsonStr, String sort) {

        /*JsonData jsonData = new JsonData();*/
        /*String sql = "select t1.id,t1.courseid,t2.name coursename,t1.studentid,t3.name studentname," +
                "t2.coursetypeid,t4.name coursetypename,t2.teacherid,t5.name teachername " +
                " from adminstudent_course_collect t1,adminteacher_course t2,sys_user_student t3," +
                "adminteacher_coursetype t4,sys_user_teacher t5 " +
                " where t1.courseid = t2.id and t1.studentid = t3.id and " +
                "t2.coursetypeid = t4.id and t2.teacherid = t5.id and t1.courseid = ?1";*/
        String sql = "select * from (" + BASE_SQL + " and t1.courseid = ?1) t ";
        /*sql = sql + CommonMethod.createPagedQueryCondition(page, limit, jsonStr, sort);*/
        sql = sql + CommonMethod.createWhereCondition(jsonStr, sort);
        /*List list = this.dao.findByNativeSql(sql, CourseCollectDTO.class, courseId);
        jsonData.setData(list);*/
        return this.dao.findByNativeSql(sql, page, limit, CourseCollectDTO.class, courseId);

        /*String whereCondition = CommonMethod.createWhereCondition(jsonStr);
        String count_sql = "select count(1) from (" + BASE_SQL + " and t1.courseid = ?1) t ";
        if (!whereCondition.equals("")) {
            count_sql = count_sql + " where " + whereCondition;
        }
        List countRtn = this.dao.findByNativeSql(count_sql, java.lang.Long.class, courseId);
        jsonData.setTotalCount((long) countRtn.get(0));

        return jsonData;*/
    }

    /*public void setCourseBeanService(ICourseBeanService courseBeanService) {
        this.courseBeanService = courseBeanService;
    }*/

    /*private JsonData listCoursesToJson(List list) {

        JsonData jsonData = new JsonData();
        String values = "";
        for (Object record : list) {
            if (record != null) {
                if (values.isEmpty()) {
                    values = String.valueOf(((CourseCollectBean)record).getCourseid());
                }
                else {
                    values = values + "," + String.valueOf(((CourseCollectBean)record).getCourseid());
                }
            }
        }
        String jsonStr = CommonMethod.createIdsCondition(values);
        if (jsonStr.isEmpty()) {
            jsonData.setData(new ArrayList<>());
            jsonData.setTotalCount(0L);
        }
        else {
            jsonData = courseBeanService.getAllEntityByQuery(0,0,jsonStr);
        }
        return jsonData;
    }*/

    /*@Override
    public List getUserIdsByDutyId(long dutyId) {
        return dutyUserBeanDao.findByDutyId(dutyId).stream()
                .filter(n -> n.getUserId() != 0)
                .map(n -> n.getUserId())
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public JsonStatus saveDutyUsers(List ids) {
        if(ids==null || ids.size()!=2){
            return JsonStatus.failureResult("保存失败!");
        }
        else {
            try {
                long dutyId=Long.valueOf(ids.get(0).toString());
                String userId=ids.get(1).toString();

                dutyUserBeanDao.deleteByDutyId(dutyId);
                DutyBean bean = dao.get(dutyId);
                String userName = getShiroService().getCurrentUserLoginName();
                if (StringUtils.isNotEmpty(userId)) {
                    String[] userIds = userId.split(",");
                    for (String _userId : userIds) {
                        if (StringUtils.isNotEmpty(_userId.trim())) {
                            DutyUserBean dutyUserBean = new DutyUserBean();
                            dutyUserBean.setCreateBy(userName);
                            dutyUserBean.setUpdateBy(userName);
                            dutyUserBean.setOrgId(bean.getOrgid());
                            dutyUserBean.setDutyId(dutyId);
                            dutyUserBean.setUserId(Long.parseLong(_userId));
                            dutyUserBeanDao.save(dutyUserBean);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                return JsonStatus.failureResult("保存失败!");
            }
        }

        return JsonStatus.successResult("保存成功!");
    }

    @Override
    @Transactional
    public JsonStatus deleteDuty(long dutyId) {
        try {
            dutyUserBeanDao.deleteByDutyId(dutyId);
            deleteEntity(dutyId);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonStatus.failureResult("删除失败");
        }
        return JsonStatus.successResult("删除成功!");
    }

    *//**
     * 获得用户的职位名称 职位组成标准：orgName-dutyName
     * @return
     *//*
    @Override
    public List<String> getUserDutyNameList(){
        Long userId=this.getShiroService().getCurrentUserId();
        List<String> dutyNameList=new ArrayList<>();
        List<DutyUserBean> dutyUserBeenList=dutyUserBeanDao.find("select rub from DutyUserBean rub where rub.userId=?1", userId);

        if(dutyUserBeenList!=null && dutyUserBeenList.size()>0){
            for(DutyUserBean dutyUserBean :dutyUserBeenList){
                DutyBean dutyBean=dao.get(dutyUserBean.getDutyId());
                OrganizationBean organizationBean=orgDao.get(dutyUserBean.getOrgId());
                dutyNameList.add(organizationBean.getName() + "::" + dutyBean.getName());
            }
        }

        return dutyNameList;
    }

    *//**
     * 根据组织id，获得名称为“上级领导”的职务下全部的用户名字
     * 用于工作流
     * @return
     *//*
    @Override
    public List<String> getUserListByOrg(long orgId, String dutyName){

        List<String> userNameList=new ArrayList<>();
        //获得dutybean列表
        List<DutyBean> dutyBeanList=dutyBeanDao.find("select rub from DutyBean rub where rub.orgid=?1 and rub.name=?2", orgId,dutyName);
        if(dutyBeanList!=null && dutyBeanList.size()>0){
            for(DutyBean dutyBean :dutyBeanList){
                List<DutyUserBean> dutyUserBeanList=dutyUserBeanDao.findByDutyId(dutyBean.getId());
                if(dutyUserBeanList!=null && dutyUserBeanList.size()>0){
                    for(DutyUserBean dutyUserBean:dutyUserBeanList){
                        String userLoginName=userBeanDao.getUser(dutyUserBean.getUserId()).getLoginName();
                        userNameList.add(userLoginName);
                    }
                }
            }
        }

        return userNameList;
    }

    @Override
    public List<String> getUserListByOrgName(String orgName, String dutyName){
        List<OrganizationBean> orgBeanList=orgDao.find("select rub from OrganizationBean rub where rub.name=?1", orgName);
        OrganizationBean orgBean=orgBeanList.get(0);
        return getUserListByOrg(orgBean.getId(),dutyName);
    }

    *//**
     * 通过用户id获得职位
     * @param userId
     * @return
     *//*
    @Override
    public List<String>  getDutyByUserId(Long userId){
        List<String> dutyList = new ArrayList<>();
        List<DutyUserBean> dutyUserBeanList = dutyUserBeanDao.findByNativeSql("select * from sys_duty_user where userId=" + userId, DutyUserBean.class);
        if(dutyUserBeanList != null && dutyUserBeanList.size() > 0){
            for (DutyUserBean duty:dutyUserBeanList){
                DutyBean dutyBean = dutyBeanDao.get(duty.getDutyId());
                if (dutyBean != null) {
                    String dutyName = dutyBean.getName();
                    dutyList.add(dutyName);
                }
            }
        }
        return dutyList;
    }*/
}
