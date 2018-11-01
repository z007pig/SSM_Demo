package com.zhuan.Service;

import com.zhuan.Dao.UserMapper;
import Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int deleteByPrimaryKey(byte[] uid) {
        return userMapper.deleteByPrimaryKey(uid);
    }

    @Override
    public int insert(Student record) {
        return userMapper.insert(record);
    }

    @Override
    public int insertSelective(Student record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public Student selectByPrimaryKey(byte[] uid) {
        return userMapper.selectByPrimaryKey(uid);
    }

    @Override
    public List<Student> selectByCondition(Student record) {
        return userMapper.selectByCondition(record);
    }

    @Override
    public int updateByPrimaryKeySelective(Student record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Student record) {
        return userMapper.updateByPrimaryKey(record);
    }
}
