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
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "khoahocId")
    private Integer khoahocId;

    @Column(name = "tenkhoahoc", nullable = false)
    private String tenkhoahoc;

    @OneToMany(mappedBy = "course")
    private List<Certificate> certificates;

    @OneToMany(mappedBy = "course")
    private List<Review> reviews;

    @OneToMany(mappedBy = "course")
    private List<CartItem> cartItems;

    @OneToMany(mappedBy = "course")
    private List<OrderItem> orderItems;

    @OneToMany(mappedBy = "course")
    private List<CourseAccountDetail> courseAccountDetails;

    // Getters and Setters
}

