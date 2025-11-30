package org.example.com.uberreviewservice.services;

import org.example.com.uberreviewservice.models.Booking;
import org.example.com.uberreviewservice.models.Review;
import org.example.com.uberreviewservice.repositories.BookingRepo;
import org.example.com.uberreviewservice.repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ReviewService implements CommandLineRunner {
    private ReviewRepository reviewRepository;
    private BookingRepo bookingRepo;

    public ReviewService(ReviewRepository x, BookingRepo bookingRepo){
        this.reviewRepository = x;
        this.bookingRepo = bookingRepo;
    }

    @Override
    public void run(String... args) throws Exception {

//        Review r = Review.builder()
//                .content("amzing")
//                .rating(5.22)
//                .build();
//        Booking b = Booking.builder().endTime(new Date())
//                .startTime(new Date())
//                .review(r)
//                .build();
//
//        bookingRepo.save(b);

        Optional< Booking> b = bookingRepo.findById(7L);

        if(b.isPresent()){
            bookingRepo.delete(b.get());
        }else{
            System.out.println("No entry present");
        }
    }
}
