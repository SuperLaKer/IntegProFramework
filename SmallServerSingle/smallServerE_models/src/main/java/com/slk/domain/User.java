package com.slk.domain;


import lombok.Data;
import lombok.ToString;
import com.slk.returnObj.StatusCode;

import javax.persistence.*;

@Data
@ToString
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
}
