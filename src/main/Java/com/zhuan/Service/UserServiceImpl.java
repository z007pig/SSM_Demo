package com.zhuan.Service;

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
    public List<User> selectAll(int page, int rows) {
        /**
         *
         * 功能描述: 
         *
         * @param: [page, rows]
         * @return: java.util.List<User>
         * @auther: zhuan
         * @date: 2018/11/3 18:11
         */
        int startNum = (page-1)*rows;

        int endNum = page*rows;

        HashMap<String, String> map = new HashMap<>();

        map.put("startNum", String.valueOf(startNum));

        map.put("endNum", String.valueOf(endNum));

        return userMapper.selectAll(map);
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
                result.setFlag(1);
                result.setMsg("成功，id:"+userid);

            }else{
                result.setFlag(0);
                result.setMsg("失败");
            }
        }catch (Exception e){
            result.setFlag(0);
            result.setMsg(e.toString());
        }
        return  result;
    }
}
