package com.datn.entitys;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cauhoiId")
    private Integer cauhoiId;

    @Column(name = "noidung", nullable = false)
    private String noidung;

    @Column(name = "luaChonA_")
    private String luaChonA;

    @Column(name = "luaChonB")
    private String luaChonB;

    @Column(name = "luaChonC")
    private String luaChonC;

    @Column(name = "luaChonD")
    private String luaChonD;

    @Column(name = "dapAnDung_", nullable = false)
    private String dapAnDung;

    @Column(name = "createdate", nullable = false)
    private Date createdate;

    @ManyToOne
    @JoinColumn(name = "baitapId", nullable = false)
    private Exercise exercise;

    // Getters and Setters
}

