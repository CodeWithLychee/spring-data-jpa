package org.example.com.uberreviewservice.repositories;

import org.example.com.uberreviewservice.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepo extends JpaRepository<Booking,Long> {

    //method 1 for writing queries
    List<Booking>findAllByDriverId(Long driverId);

    //method 2 : raw queries

}
