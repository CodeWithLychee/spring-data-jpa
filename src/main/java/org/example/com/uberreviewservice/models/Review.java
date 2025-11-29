package org.example.com.uberreviewservice.models;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "Booking_Review")
@Getter
@Setter

@Builder
@NoArgsConstructor
@AllArgsConstructor

@EntityListeners(AuditingEntityListener.class)
public class Review extends BaseModel{

    @Column(nullable = false)
    private String content;

    private double rating;

    // kafi saare constuctor baan jaege
//    public Review(Long id){};
//    public Review(Long id,String content){};
//    public Review(Long id,Double Rating){};

    @Override
    public String toString(){
        return "review " + this.content + this.rating + this.createdAt ;
    }

}
