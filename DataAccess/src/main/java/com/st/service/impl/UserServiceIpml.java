package com.st.service.impl;

import com.st.dao.UserDao;
import com.st.entity.UserInfo;
import com.st.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/4/1.
 */
@Service("uservice")
public class UserServiceIpml implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public List<UserInfo> query() {
        return userDao.query();
    }


}
