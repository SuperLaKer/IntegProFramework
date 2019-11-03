package com.slk.serverTest;


import com.slk.MySpringBootApplication;
import com.slk.dao.TeachPlanMapper;
import com.slk.domain.TeachPlanNode;
import com.slk.domain.Teachplan;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = MySpringBootApplication.class)
@RunWith(SpringRunner.class)
public class MyTest {


    @Autowired
    TeachPlanMapper teachPlanMapper;

    @Test
    public void testMapper(){
        Teachplan teachPlan = teachPlanMapper.findOne();
        System.out.println(teachPlan);
    }

    @Test
    public void testTeachPlanNode(){
        TeachPlanNode teachPlanNode = teachPlanMapper.findOneNode();
        System.out.println(teachPlanNode);
    }
}
// TeachPlanNode(
//              children=[TeachPlanNode(children=[TeachPlanNode(children=null),
//              TeachPlanNode(children=null)]),
//              TeachPlanNode(children=[TeachPlanNode(children=null),
//              TeachPlanNode(children=null)]),
//              TeachPlanNode(children=[])])