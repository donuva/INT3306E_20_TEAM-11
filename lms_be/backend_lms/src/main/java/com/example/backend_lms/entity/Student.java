package com.example.backend_lms.entity;

import jakarta.persistence.*;
import lombok.Data;


import java.util.List;

@Entity
@Data

public class Student{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)
    private User user;

    @ManyToMany(mappedBy = "student", fetch = FetchType.EAGER)
    private List<Course> courses;
}
