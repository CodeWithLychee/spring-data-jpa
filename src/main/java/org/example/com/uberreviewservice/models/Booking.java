package org.example.com.uberreviewservice.models;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Booking extends BaseModel{

    @Enumerated(value = EnumType.STRING)
//    @Enumerated(value = EnumType.ORDINAL)
    private BookingStatus bookingStatus;

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date startTime;

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date endTime;

    private Long TotalDistance;

    private Integer Amount;

    //i want to show relationship
    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    private Review review;
    //now here we have 1:1 realtionship bw them

    @ManyToOne
    private Driver driver;

    @ManyToOne
    private Passenger passenger;
}
