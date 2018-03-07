package com.zking.biz.impl;

import com.zking.Entity.StuEntity;
import com.zking.biz.StuBiz;
import com.zking.dao.StuDao;
import com.zking.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: longyt
 * @create: 2018-03-05 20:25
 * @desc:
 **/
@Service
public class StuBizImpl implements StuBiz {

    @Autowired
    private StuDao stuDao;

    public List<StuEntity> Select(StuEntity stuEntity,PageBean pageBean) {
        //System.out.println("kk");
        return stuDao.SelectAllStu(stuEntity);
    }
}
