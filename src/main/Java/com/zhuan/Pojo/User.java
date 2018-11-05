package com.zhuan.Pojo;


import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    private int id;

    private String name;

    private String phone;

    private String idCard;

    private String email;

    private String creationTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreationTime() {
        if(null == this.creationTime){
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
            return df.format(new Date());
        }else{
            return this.creationTime;
        }
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }
}
