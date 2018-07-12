package com.cz.demo.controller;

import com.cz.demo.bean.CzUser;
import com.cz.demo.mapper.CzUserMapper;
import com.cz.demo.service.CzUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author chenzan
 * @version V1.0
 * @description TODO
 * @create-date 2018/7/5
 * @modifier
 * @modifier-data
 */
@Controller
public class LoginController {

    @Resource
    CzUserService czUserService;

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @ResponseBody
    @RequestMapping("/add")
    public String loginAdd() {
        CzUser czUser = new CzUser();
        czUser.setPassword("123456");
        czUser.setUsername("aa");
        czUserService.insertSelective(czUser);
        return "success";
    }

    @ResponseBody
    @RequestMapping("/select")
    public CzUser loginSelect() {
        CzUser czUser = czUserService.selectByPrimaryKey(1);
        return czUser;
    }
}
