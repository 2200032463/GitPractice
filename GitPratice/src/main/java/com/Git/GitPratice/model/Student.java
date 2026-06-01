package com.Git.GitPratice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Student {

    @Id
    private Long StudentId;
    @Column(name = "name")
    private String name;
}
