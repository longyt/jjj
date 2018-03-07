package com.zking.Entity;

import java.io.Serializable;

/**
 * @author: longyt
 * @create: 2018-03-03 18:46
 * @desc:
 **/
public class StuEntity implements Serializable{

    private Integer sid;

    private String sex;

    private String sname;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
}
