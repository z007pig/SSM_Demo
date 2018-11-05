package com.zhuan.Service;

import com.zhuan.Pojo.Result;
import com.zhuan.Pojo.User;

import java.util.List;

public interface IUserService {

    List<User> selectAll(int page , int rows);

    Result addUser(String name,String phone,String idCard, String email);
}
