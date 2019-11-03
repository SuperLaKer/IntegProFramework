package com.slk.domain;

import lombok.Data;
import lombok.ToString;

import java.util.List;

// { name: , id: , child:[{name: , id: , child:[]}]}


@Data
@ToString
public class TeachPlanNode extends Teachplan {

    List<TeachPlanNode> children;

}
