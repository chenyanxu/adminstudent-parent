package com.kalix.ar.adminstudent.student.biz;

import com.kalix.framework.core.api.persistence.UserEntity;
import com.kalix.framework.core.impl.security.LoginService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/7.
 */
public class StudentLoginServiceImpl extends LoginService {

    @Override
    public List<String> getUserPermission(String username) {
        List<String> stringList = new ArrayList<String>();
        UserEntity userBean = dao.getUser(username);
        if (userBean != null) {
            //stringList.addAll(permissionService.getApplicationCodesByUserId(userBean.getId()));
            //stringList.addAll(permissionService.getFunctionCodesByUserId(userBean.getId()));
        }
        return stringList;
    }
}
