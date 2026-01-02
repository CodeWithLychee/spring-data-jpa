package org.example.com.uberreviewservice.models;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@RequiredArgsConstructor
@Getter
@Setter
public class Course extends  BaseModel{

    private String name;

//
//    @ManyToMany
//    private List<Student> students = new ArrayList<>();

    @OneToMany(mappedBy = "course")
    private List<StudentCourse> students = new ArrayList<>();
}
