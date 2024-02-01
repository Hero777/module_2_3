package com.javaacademy.lessons.homework.myhwork3.ex1;

import java.time.LocalDateTime;

public class Runner {
    public static void main(String[] args) {
        LocalDateTime firstTime = LocalDateTime.of(2024, 1, 25, 13, 37);
        LocalDateTime secondTime = LocalDateTime.of(2024, 1, 25, 16, 37);
        LocalDateTime thirdTime = LocalDateTime.of(2024, 1, 25, 13, 37);
        ReviewCollection reviewCollection = new ReviewCollection();
        reviewCollection.addReview(new Review(1, "отличный товар", 200, firstTime));
        reviewCollection.addReview(new Review(2, "так себе товар", 100, secondTime));
        reviewCollection.addReview(new Review(3, "плохой товар", 100, thirdTime));
        System.out.println(reviewCollection);
    }
}
