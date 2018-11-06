package com.zhuan.Service;

import com.zhuan.Pojo.Infor;
import com.zhuan.Pojo.Result;

import java.util.List;

public interface IUserService {

    Infor selectAll(Integer page , Integer rows);

    Result addUser(String name,String phone,String idCard, String email);
}
