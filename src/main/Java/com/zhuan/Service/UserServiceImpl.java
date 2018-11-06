package com.zhuan.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhuan.Pojo.Infor;
import com.zhuan.Pojo.Page;
import com.zhuan.Pojo.Result;
import com.zhuan.Pojo.User;
import com.zhuan.Dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Infor selectAll(Integer page, Integer rows) {
        /**
         *
         * 功能描述: 
         *
         * @param: [page, rows]
         * @return: java.util.List<User>
         * @auther: zhuan
         * @date: 2018/11/3 18:11
         */

       // Infor infor = new Infor();

        HashMap<String, Integer> map = new HashMap<>();

        PageHelper.startPage(page, rows, true);

        int startNum = (page-1)*rows;

        int endNum = page*rows;

        map.put("startNum",startNum);

        map.put("endNum",endNum);
        try{
            List<User> userList = userMapper.selectAll();  //map

            //用PageInfo对结果进行包装
            PageInfo pageInfo= new PageInfo(userList);

           // infor.setAll(userList,pageInfo,"");

            Infor infor = new Infor(userList,pageInfo,"");

            return infor;

        }catch (Exception e){
            Infor infor = new Infor();

            infor.getResult().fail(e==null?"":e.toString());

            return infor;
        }


    }

    @Override
    public Result addUser(String name, String phone, String idCard, String email) {
        
        /**
         *
         * 功能描述: 
         *
         * @param: [name, phone, idCard, email]
         * @return: com.zhuan.Pojo.Result
         * @auther: zhuan
         * @date: 2018/11/5 11:30
         */

        Result result = new Result();

        User user  = new User();

        user.setName(name);
        user.setPhone(phone);
        user.setIdCard(idCard);
        user.setEmail(email);

        try {
            int resultnum = userMapper.addUser(user);

            int userid = user.getId();//获取人员id

            if(resultnum == 1){
                result.success("成功，id:"+userid);

            }else{
                result.fail("");
            }
        }catch (Exception e){
            result.fail(e.toString());
        }
        return  result;
    }
}
