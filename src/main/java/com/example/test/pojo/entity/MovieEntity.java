package com.example.test.pojo.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "movie", schema = "dbo", catalog = "sideproject")
public class MovieEntity {
    private Long id;
    private int year;
    private int month;
    private String type;
    private String movie;
    private String starring;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "year")
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Basic
    @Column(name = "month")
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "movie")
    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    @Basic
    @Column(name = "starring")
    public String getStarring() {
        return starring;
    }

    public void setStarring(String starring) {
        this.starring = starring;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieEntity that = (MovieEntity) o;
        return id == that.id &&
                year == that.year &&
                month == that.month &&
                Objects.equals(type, that.type) &&
                Objects.equals(movie, that.movie) &&
                Objects.equals(starring, that.starring);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, year, month, type, movie, starring);
    }
}
