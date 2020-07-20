package com.atguigu.gmall.service;



import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;


public interface UserService {
    List<UmsMember> getAllUsers();

    List<UmsMemberReceiveAddress> getAddressByMemberId(String memberId);
}
