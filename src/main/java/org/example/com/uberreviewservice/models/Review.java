package org.example.com.uberreviewservice.models;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Entity
@Table(name = "Booking_Review")
@Getter
@Setter

@Builder
@NoArgsConstructor
@AllArgsConstructor

@EntityListeners(AuditingEntityListener.class)
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    //identity means auto increment
    private Long id;

    @Column(nullable = false)
    private String content;

    private double rating;

    @Temporal(TemporalType.DATE)
    @CreatedDate // only at object creation
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate // when object update
    private Date updatedAt;

    // kafi saare constuctor baan jaege
//    public Review(Long id){};
//    public Review(Long id,String content){};
//    public Review(Long id,Double Rating){};

    @Override
    public String toString(){
        return "review " + this.content + this.rating + this.createdAt ;
    }

}
