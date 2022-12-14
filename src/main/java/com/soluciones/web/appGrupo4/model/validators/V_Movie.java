package com.soluciones.web.appGrupo4.model.validators;



import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "movie")
public class V_Movie {
    
    @Id
    @Column(name = "id_movie")
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String idMovie;

    @Column(name = "cover_movie")
    private String coverUrl;

    @Column(name = "name_movie")
    private String name;

    @Column(name = "duration_movie")
    private int duration;

    @Column(name = "synopsis_movie", columnDefinition="LONGTEXT")
    private String synopsis;

    @Column(name = "realease_movie")
    private String releaseDate;

    @Column(name = "rate_movie")
    private double rate;



    // constructor

    public V_Movie() {
        this.idMovie = "";
        this.coverUrl = "";
        this.name = "";
        this.duration = 0;
        this.synopsis = "";
        this.releaseDate = "";
        this.rate = 0;
    }


    
    // getters & setters 

    public String getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(String idMovie) {
        this.idMovie = idMovie;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

}
