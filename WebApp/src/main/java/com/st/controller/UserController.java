package com.st.controller;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.st.entity.UserInfo;
import com.st.service.UserService;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/4/1.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource(name="uservice")
    private  UserService userService;

    @ResponseBody
    @RequestMapping(value="query",method = RequestMethod.GET)
    public Map<String,Object> query()
    {
       HashMap<String,Object> map=new HashMap<>();
       List<UserInfo> list= userService.query();
       map.put("data",list);
       return map;
    }

}
