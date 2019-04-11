package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_person")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    /*@Id
    @KeySql(useGeneratedKeys = true)
    @Column(name = "person_id")
    private Integer id;
    @Column(name = "person_name")
    private String name;
    private Integer sex;*/
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer personId;
    private String personName;
    private Integer sex;
}
