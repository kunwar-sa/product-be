package com.kunwar.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kunwar.product.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

    List<Review> findByIdIn(List<Long> ids);
}
