package com.zking.controller;

import com.zking.Entity.StuEntity;
import com.zking.biz.StuBiz;
import com.zking.util.PageBean;
import com.zking.dao.StuDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author: longyt
 * @create: 2018-03-03 20:01
 * @desc:
 **/
@Controller
public class stuController {

    @Autowired
    private StuDao stuDao;

    @Autowired
    private StuBiz stuBiz;


    @ResponseBody
    @RequestMapping("testspring")
    public String testSpting(){
        /*List<StuEntity> stuEntities = stuDao.SelectAllStu();
        System.out.println("个数："+stuEntities.size());
        System.out.println("我成功了ksandkjdsakjksdkjasdkj");*/

        PageBean pageBean=new PageBean();
        pageBean.setPageRecord(2);
        pageBean.setCurPage(1);
        StuEntity stuEntity=new StuEntity();
        List<StuEntity> stuEntities = stuBiz.Select(stuEntity, pageBean);
        System.out.println(pageBean);
        for (StuEntity entity : stuEntities) {
            System.out.println(entity.getSname());
        }
        //System.out.println("ok");
       /* PageBean pageBean=new PageBean();
        List<StuEntity> stuEntities = stuBiz.SelectAllStu(pageBean);
        System.out.println(stuEntities.toString());*/
        return "hhaaaaaaaaaaajsdksdkjs";
    }
}
