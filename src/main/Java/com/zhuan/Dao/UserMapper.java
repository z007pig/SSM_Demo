package com.zhuan.Dao;

import Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    int deleteByPrimaryKey(byte[] uid);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(byte[] uid);

    List<Student> selectByCondition(Student record);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}