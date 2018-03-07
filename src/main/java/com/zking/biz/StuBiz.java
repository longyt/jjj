package com.zking.biz;

import com.zking.Entity.StuEntity;
import com.zking.util.PageBean;

import java.util.List;

public interface StuBiz {

    public List<StuEntity> Select(StuEntity stuEntity, PageBean pageBean);

}
