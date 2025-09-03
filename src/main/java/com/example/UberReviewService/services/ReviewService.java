package com.example.UberReviewService.services;

import com.example.UberReviewService.model.Review;
import com.example.UberReviewService.repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ReviewService implements CommandLineRunner {

    private ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository){
        this.reviewRepository = reviewRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("***********");



        Review r = Review.builder()
                .content("amazing")
                .rating(4.0)
                .build();
        System.out.println(r.toString());



        reviewRepository.save(r);

    }
}
