package com.zhuan.Pojo;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @Auther: zhuan
 * @Date: 2018/11/6 14:33
 * @Description:
 */
public class Infor {
    //信息list
    private List infor;

    //分页对象
    private  Page page;

    //结果对象
    private  Result result;

    public List getInfor() {
        return infor;
    }

    public void setInfor(List infor) {
        this.infor = infor;
    }

    public Page getPage() {

        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public Result getResult() {

        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    //构造函数初始化
    public Infor(){
        this. result = new Result();

        this.page = new Page();
    }

    public Infor(List infor, PageInfo pageInfo, String e){
        //一个类创建了多个构造函数时，在一个构造函数中调用另一个构造函数,用this关键字来实现。
        this();

        this.setInfor(infor);

        this.getPage().setPageObj(pageInfo);

        this.getResult().success(e);
    }

    public void setAll(List infor, PageInfo pageInfo, String e){

        this.setInfor(infor);

        this.getPage().setPageObj(pageInfo);

        this.getResult().success(e);
    }

}
