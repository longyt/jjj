package com.zking;

import com.zking.biz.StuBiz;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author: longyt
 * @create: 2018-03-06 10:57
 * @desc:
 **/
public class testcache{

    @Autowired
    private StuBiz stuBiz;



    @Test
    public void testlist(){
        System.out.println("ok");
        //List<StuEntity> stuEntities = stuBiz.SelectAllStu(pageBean);
        //System.out.println(stuEntities.size());
    }
}
