package org.example.com.uberreviewservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class StudentCourse extends BaseModel{

    @ManyToOne
    private Student student;

    @ManyToOne
    private Course course;

    private Date enrolledDate;
    private String status;
    private Integer marks;
}
