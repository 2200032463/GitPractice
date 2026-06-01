package com.Git.GitPratice.model;




@Entity
@Data
public class Student {

    @Id
    private Long StudentId;
    @Column(name = "name")
    private String name;
}
