package com.slk.dao;

import com.slk.domain.Teachplan;
import org.springframework.data.jpa.repository.JpaRepository;

// JPA什么方法都不用写
public interface TeachPlanDao extends JpaRepository<Teachplan, String> {

}
