package com.zhuan.Pojo;

import com.github.pagehelper.PageInfo;

/**
 * @Auther: zhuan
 * @Date: 2018/11/6 12:59
 * @Description:
 */
public class Page {

    //当前页
    private  int nowPage;

    //每页的数量
    private  int rowNum;

    //总记录数
    private  long  total;

    //总页数
    private int pages;


    public int getNowPage() {
        return nowPage;
    }

    public void setNowPage(int nowPage) {
        this.nowPage = nowPage;
    }

    public int getRowNum() {
        return rowNum;
    }

    public void setRowNum(int rowNum) {
        this.rowNum = rowNum;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    //将分页插件的对象转化成自己的分页对象
    public void setPageObj(PageInfo pageInfo){

        this.setNowPage(pageInfo.getPageNum());

        this.setRowNum(pageInfo.getPageSize());

        this.setTotal(pageInfo.getTotal());

        this.setPages(pageInfo.getPages());
    }
}
