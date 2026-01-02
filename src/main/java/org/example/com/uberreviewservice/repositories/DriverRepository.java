package org.example.com.uberreviewservice.repositories;

import org.example.com.uberreviewservice.models.Booking;
import org.example.com.uberreviewservice.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface DriverRepository extends JpaRepository<Driver,Long> {

    //Method1 : for fetching data from database
    Optional <Driver> findByIdAndDrivingLicenceNo(Long id, String license_number);

    //method 2 : writing raw queries
    @Query(nativeQuery = true,value = "SELECT * from Driver where id = :id AND driving_licence_no =:Licence")
    Optional<Driver> rawFindByIdAndDrivingLicenceNo(Long id, String Licence);
    //here error is thrown at run time

    //method 3: via hibernate
    @Query("SELECT d FROM Driver as d WHERE d.Id = :id AND d.drivingLicenceNo = :licence")
    Optional<Driver> hqlFindByIdAndDrivingLicenceNo(
            Long id, String licence
    );
    //here error is thrown at compile time
}
