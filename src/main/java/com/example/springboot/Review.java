package com.example.springboot;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String isi;
    private String usernamereview;

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", isi='" + isi + '\'' +
                ", usernamereview='" + usernamereview + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }

    public void setUsernamereview(String usernamereview) {
        this.usernamereview = usernamereview;
    }

    public Review() {
    }

    public Review(int id, String isi, String usernamereview) {
        this.id = id;
        this.isi = isi;
        this.usernamereview = usernamereview;
    }

    public Review(String isi, String usernamereview) {
        this.isi = isi;
        this.usernamereview = usernamereview;
    }

    public String getIsi() {
        return isi;
    }

    public String getUsernamereview() {
        return usernamereview;
    }

}
