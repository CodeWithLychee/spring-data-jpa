package org.example.com.uberreviewservice.services;

import org.example.com.uberreviewservice.models.Booking;
import org.example.com.uberreviewservice.models.Driver;
import org.example.com.uberreviewservice.repositories.BookingRepo;
import org.example.com.uberreviewservice.repositories.DriverRepository;
import org.example.com.uberreviewservice.repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewService implements CommandLineRunner {
    private DriverRepository driverRepository;
    private ReviewRepository reviewRepository;
    private BookingRepo bookingRepo;

    public ReviewService(ReviewRepository x, BookingRepo bookingRepo, DriverRepository driverRepository){
        this.reviewRepository = x;
        this.bookingRepo = bookingRepo;
        this.driverRepository = driverRepository;
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

//        Optional< Booking> b = bookingRepo.findById(7L);
//
//        if(b.isPresent()){
//            bookingRepo.delete(b.get());
//        }else{
//            System.out.println("No entry present");
//        }

//        Optional<Driver> drivers = driverRepository.findByIdAndDrivingLicenceNo(1L, "Dl12121");
//        Optional<Driver> drivers = driverRepository.findById(1L);
//        if(drivers.isPresent()){
//            System.out.println(drivers.get().getName());
//            List<Booking> b = drivers.get().getBookings();
//
//            for(Booking booking: b){
//                System.out.println(booking.getId());
//            }

//            List<Booking> bookings = bookingRepo.findAllByDriverId(drivers.get().getId());
//
//            for(Booking booking:bookings){
//                System.out.println(booking.getBookingStatus());
//            }
        Optional<Driver> driver = driverRepository.hqlFindByIdAndDrivingLicenceNo(1L,"Dl12121");
        System.out.println(driver.get().getName());
        }


//        Optional<Booking> b = bookingRepo.findById(1L);

}
