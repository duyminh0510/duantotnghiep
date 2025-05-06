package com.datn.entitys;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "lessons")
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "baigiangId")
    private Integer baigiangId;

    @Column(name = "tenbaigiang", nullable = false)
    private String tenbaigiang;

    @OneToMany(mappedBy = "lesson")
    private List<Comment> comments;

    // Getters and Setters
}
