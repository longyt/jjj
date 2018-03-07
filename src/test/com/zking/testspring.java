package com.zking;

import com.zking.Entity.StuEntity;
import com.zking.dao.StuDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author: longyt
 * @create: 2018-03-03 19:37
 * @desc:
 **/
public class testspring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        StuDao stuDao = (StuDao) context.getBean("stuDao");
        //List<StuEntity> stuEntities = stuDao.SelectAllStu();
        //System.out.println(stuEntities.size());
    }
}
