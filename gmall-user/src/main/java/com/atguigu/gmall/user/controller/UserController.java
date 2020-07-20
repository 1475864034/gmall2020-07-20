package com.atguigu.gmall.user.controller;



import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/getAddressById")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddressList = userService.getAddressByMemberId(memberId);
        return umsMemberReceiveAddressList;
    }

    @RequestMapping("/getAllUsers")
    @ResponseBody
    public List<UmsMember> getAllUsers(){

        List<UmsMember> umsMemberList = userService.getAllUsers();
        return umsMemberList;
    }

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){

        return "Hello User";
    }
}
