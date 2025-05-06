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
import com.cloudinary.provisioning.Account;

@Entity
@Table(name = "reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "danhgiaId")
    private Integer danhgiaId;

    @Column(name = "rating", nullable = false)
    private String rating;

    @Column(name = "comment", nullable = false)
    private String comment;

    @Column(name = "createdate", nullable = false)
    private Date createdate;

    @ManyToOne
    @JoinColumn(name = "khoahocId", nullable = false)
    private Course course;

    @ManyToOne
    @JoinColumn(name = "accountId", nullable = false)
    private Account account;

    // Getters and Setters
}
