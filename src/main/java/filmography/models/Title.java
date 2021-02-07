package filmography.models;

/*
    Класс модели, описывает данные, которыми будем оперировать.
 */

import javax.persistence.*;

@Entity
@Table(name = "titles")
public class Title {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "season")
    private int season;

    @Column(name = "year_of_publication")
    private int yearOfPublication;

    @Column(name = "overed")
    private boolean overed;

    @Column(name = "genre")
    private String genre;

    @Column(name = "watched")
    private boolean watched;

    public Title(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public boolean isOvered() {
        return overed;
    }

    public void setOvered(boolean overed) {
        this.overed = overed;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isWatched() {
        return watched;
    }

    public void setWatched(boolean watched) {
        this.watched = watched;
    }

    @Override
    public String toString() {
        return "Title{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", season=" + season +
                ", yearOfPublication=" + yearOfPublication +
                ", overed=" + overed +
                ", genre='" + genre + '\'' +
                ", watched=" + watched +
                '}';
    }
}
