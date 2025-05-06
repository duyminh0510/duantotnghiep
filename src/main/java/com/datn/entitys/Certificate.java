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
@Table(name = "certificates")
public class Certificate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chungchiId")
    private Integer chungchiId;

    @Column(name = "createdate", nullable = false)
    private Date createdate;

    @Column(name = "loai", nullable = false)
    private String loai;

    @Column(name = "tenchungchi", nullable = false)
    private String tenchungchi;

    @Column(name = "description", nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "accountId", nullable = false)
    private Account account;

    @ManyToOne
    @JoinColumn(name = "khoahocId", nullable = false)
    private Course course;

    // Getters and Setters
}
