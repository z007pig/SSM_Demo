package com.zhuan.Dao;

import com.zhuan.Pojo.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public interface UserMapper {

    List<User> selectAll(HashMap map);

    int addUser(User user);
}