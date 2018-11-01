package com.zhuan.Controllers;

import Entity.Student;
import com.zhuan.Service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhuan
 */
@RestController
@RequestMapping("/api/User")
public class UserController {
    @Autowired
    private IUserService service;

    @GetMapping()
    public String Get() {
        List<Student> students = service.selectByCondition(new Student());
        String jsonResult = com.alibaba.fastjson.JSON.toJSONString(students);
        return jsonResult;
    }
}
