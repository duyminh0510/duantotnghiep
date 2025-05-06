package com.datn.entitys;

import java.sql.Date;
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
@Table(name = "course_accountdetails")
public class CourseAccountDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_accountkh")
    private Integer idAccountkh;

    @Column(name = "createdate", nullable = false)
    private Date createdate;

    @Column(name = "progress", nullable = false)
    private Double progress;

    @ManyToOne
    @JoinColumn(name = "accountId", nullable = false)
    private Account account;

    @ManyToOne
    @JoinColumn(name = "khoahocId", nullable = false)
    private Course course;

    // Getters and Setters
}

