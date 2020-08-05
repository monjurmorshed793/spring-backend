package com.backend.service.repositories;

import com.backend.service.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BikeRepository  extends JpaRepository<Bike, Long> {

}
