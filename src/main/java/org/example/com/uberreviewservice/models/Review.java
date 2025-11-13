package org.example.com.uberreviewservice.models;


import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Entity
@Table(name = "Booking_Review")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //identity means auto increment
    Long id;

    @Column(nullable = false)
    String content;

    double rating;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate // only at object creation
    Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate // when object update
    Date updatedAt;
}
