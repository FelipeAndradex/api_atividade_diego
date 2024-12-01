package sptech.api_atividade_diego.model;

import org.springframework.data.mongodb.core.mapping.Document;

public class MovieResponse {
    private String title;
    private String director;
    private int year;

    public MovieResponse() {
    }

    public MovieResponse(String title, String director, int year) {
        this.title = title;
        this.director = director;
        this.year = year;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDirector() { return director; }
    public void setDirector(String director) { this.director = director; }
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
}


