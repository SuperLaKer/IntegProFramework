package com.slk.controller;

import com.slk.dao.TeachPlanMapper;


import com.slk.domain.Teachplan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/teachplan")
public class TeachPlanController {

    @Autowired
    TeachPlanMapper teachPlanMapper;

    /**
     * 根据课程id查询课程计划（课程的章节目录）
     * @param "课程id"
     * @return "课程计划对象"
     */
    @GetMapping("/one")
    @ResponseBody
    public Teachplan findOne() {
        return teachPlanMapper.findOne();
    }
}
