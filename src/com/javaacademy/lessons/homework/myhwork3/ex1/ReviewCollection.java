package com.javaacademy.lessons.homework.myhwork3.ex1;

import java.util.Comparator;
import java.util.TreeSet;

public class ReviewCollection {

    Comparator<Review> reviewComparator = (review1, review2) -> {
        if (review1.getLikes() != review2.getLikes()) {
            return review2.getLikes() - review1.getLikes();
        } else {
            return review2.getLocalDateTime().compareTo(review1.getLocalDateTime());
        }
    };
    private TreeSet<Review> reviews = new TreeSet<>(reviewComparator);

    public void addReview(Review review) {
        reviews.add(review);
    }

//    public Review getReview(int id) {
//        for (Review review : reviews) {
//            if (review.getId() == id) {
//                return review;
//            }
//        }
//        return null;
//    }

    @Override
    public String toString() {
        return "ReviewCollection{" +
                "reviews=" + reviews +
                '}';
    }
}
