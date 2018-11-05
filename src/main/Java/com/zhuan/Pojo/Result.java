package com.zhuan.Pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: zhuan
 * @Date: 2018/11/5 11:01
 * @Description:
 */
public class Result {
    private int flag;

    private String msg;

    private String time;

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getTime() {
        if(null == this.time){
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
            return df.format(new Date());
        }else{
            return this.time;
        }
    }

    public void setTime(String time) {
        this.time = time;
    }
}
