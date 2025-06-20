package org.example.moviecatalogue.model;

public class Movie {
    private String title;
    private String director;
    private int year;
    private double score;

    public Movie() {
        // Пустой конструктор нужен для Spring/Jackson
    }

    public Movie(String title, String director, int year, double score) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.score = score;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

}
