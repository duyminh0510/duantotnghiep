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
@Table(name = "accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "accountId")
    private Integer accountId;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @OneToMany(mappedBy = "account")
    private List<Certificate> certificates;

    @OneToMany(mappedBy = "account")
    private List<Comment> comments;

    @OneToMany(mappedBy = "account")
    private List<Review> reviews;

    @OneToMany(mappedBy = "account")
    private List<CourseAccountDetail> courseAccountDetails;

    // Getters and Setters
}

