package com.st.dao;

import com.st.entity.UserInfo;

import java.util.List;

/**
 * Created by Administrator on 2017/4/1.
 */
public interface UserDao {
    List<UserInfo> query();
}
