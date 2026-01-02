package org.example.com.uberreviewservice.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@RequiredArgsConstructor
@Getter
@Setter
public class Student extends BaseModel{
    private String name;

    private String rollNo;

//    @ManyToMany
//    @JoinTable(
//            name = "course_students",
//            joinColumns = @JoinColumn(name ="student_id"),
//            inverseJoinColumns = @JoinColumn(name = "course_id")
//    )
//    private List<Course> courses = new ArrayList<>();

    @OneToMany(mappedBy = "student")
    private List<StudentCourse> courses = new ArrayList<>();
}



