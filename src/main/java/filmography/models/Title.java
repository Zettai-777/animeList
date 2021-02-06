package filmography.models;

/*
    Класс модели, описывает данные, которыми будем оперировать.
 */

public class Title {
    private int id;
    private String name;
    private int yearOfPublication;
    private boolean overed;
    private String genre;
    private boolean watched;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
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
                ", yearOfPublication=" + yearOfPublication +
                ", overed=" + overed +
                ", genre='" + genre + '\'' +
                ", watched=" + watched +
                '}';
    }
}
