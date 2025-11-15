package org.example.com.uberreviewservice.repositories;

import org.example.com.uberreviewservice.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//communication with database
public interface ReviewRepository extends JpaRepository<Review,Long> {

}
