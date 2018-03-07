package com.zking;

import com.zking.Entity.StuEntity;
import com.zking.dao.StuDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.util.List;

/**
 * @author: longyt
 * @create: 2018-03-03 18:54
 * @desc:
 **/
public class testMybatis {
    public static void main(String[] args) {
        try {
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
            SqlSession sqlSession = sqlSessionFactory.openSession();
            StuDao mapper = sqlSession.getMapper(StuDao.class);
            //List<StuEntity> stuEntities = mapper.SelectAllStu();
            //System.out.println("总数 " + stuEntities.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
