package com.example.entity;

import java.io.Serializable;
import java.util.List;

public class CatVo implements Serializable {
    private Integer current;  //当前页
    private Integer limit; //一页的数据条数
    private Long total;   //总数据数
    List<Cat> data; //返回的数据
    private Long pages ;  //页面数

    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<Cat> getData() {
        return data;
    }

    public void setData(List<Cat> data) {
        this.data = data;
    }

    public Long getPages() {
        return pages;
    }

    public void setPages(Long pages) {
        this.pages = pages;
    }
}