package com.zhuan.Controllers;

import com.zhuan.Pojo.Infor;
import com.zhuan.Pojo.Result;
import com.zhuan.Service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhuan
 */
@RestController
@RequestMapping("/zhuan/User")
public class UserController {
    @Autowired
    private IUserService iUserService;

    @RequestMapping(value = "/GetUserList.do")
    public Infor GetUserList(
            @RequestParam(value = "page",required = false, defaultValue = "1") Integer page,
            @RequestParam(value = "rows", required = false, defaultValue = "20") Integer rows) {
            /**
             *
             * 功能描述: 查询用户列表
             *
             * @param: [page, rows]
             * @return: java.util.List<User>
             * @auther: zhuan
             * @date: 2018/11/3 18:11
             */
        return iUserService.selectAll(page,rows);
    }


    @RequestMapping(value = "/AddUser.do")
    public Result addUser(
            @RequestParam(value = "name") String name,
            @RequestParam(value = "phone") String phone,
            @RequestParam(value = "idCard") String idCard,
            @RequestParam(value = "email") String email
    ){
        /**
         *
         * 功能描述: 
         *
         * @param: [name, phone, idCard, email]
         * @return: void
         * @auther: zhuan
         * @date: 2018/11/5 10:53
         */

        return iUserService.addUser(name,phone,idCard,email);

    }
}
