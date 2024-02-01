package com.javaacademy.lessons.homework.myhwork3.ex1;

import java.time.LocalDateTime;

public class Review {
    private int id;
    private String text;
    private int likes;
    private LocalDateTime dateTime;

    public Review(int id, String text, int likes, LocalDateTime dateTime) {
        this.id = id;
        this.text = text;
        this.likes = likes;
        this.dateTime = dateTime;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public int getLikes() {
        return likes;
    }

    public LocalDateTime getLocalDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", likes=" + likes +
                ", dateTime=" + dateTime +
                '}';
    }
}
