package com.zking.dao;

import com.zking.Entity.StuEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StuDao {

    public List<StuEntity> SelectAllStu(StuEntity stuEntity);

}
