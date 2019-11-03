package com.slk.dao;

import com.slk.domain.TeachPlanNode;
import com.slk.domain.Teachplan;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper  // Mybatis实现
public interface TeachPlanMapper {

    List<Teachplan> findAll();


    // Mapper实现
    Teachplan findOne();

    // 映射到Node中
    TeachPlanNode findOneNode();

}
