package streaming;

import java.util.ArrayList;
import java.util.List;

public class Series implements Content {

    private String title;
    private List<Video> videos;
    private Genre genre;
    private double rating;

    public Series(String title, List<Video> videos, Genre genre, double rating) {
        if (videos == null || videos.isEmpty())
            throw new IllegalArgumentException("Cannot create Series with empty or null list!");
        this.title = title;
        this.videos = videos;
        this.genre = genre;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public List<Video> getVideos() {
        return new ArrayList<>(videos);
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public int compareTo(Content o) {
        return Content.super.compareTo(o);
    }

    public double getRating() {
        return rating;
    }

    @Override
    public int getLength() {
        return videos.stream().mapToInt(Video::getLength).sum();
    }
}
