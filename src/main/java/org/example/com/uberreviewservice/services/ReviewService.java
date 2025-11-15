package org.example.com.uberreviewservice.services;

import org.example.com.uberreviewservice.models.Review;
import org.example.com.uberreviewservice.repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReviewService implements CommandLineRunner {
    private ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository x){
        this.reviewRepository = x;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("hiiiiiiiiiii");
        Review r = Review.builder()
                .content("amzing")
                .rating(5.22)
                .build();
        //code to create plain java object
        System.out.println(r);
//        reviewRepository.save(r);//this code executes sql query
        reviewRepository.deleteById(3L);
//        List<Review> reviews = reviewRepository.findAll();
//        for(int i=0;i<reviews.size();i++){
//            System.out.println(reviews.get(i).getContent());
//        }
    }
}
