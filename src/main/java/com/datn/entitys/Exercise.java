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
@Table(name = "exercises")
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "baitapId")
    private Integer baitapId;

    @Column(name = "tenbaitap", nullable = false)
    private String tenbaitap;

    @OneToMany(mappedBy = "exercise")
    private List<Question> questions;

    // Getters and Setters
}
