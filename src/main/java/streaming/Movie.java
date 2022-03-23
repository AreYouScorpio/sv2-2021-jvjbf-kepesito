package streaming;

public class Movie implements Content {

    private Video video;
    private Genre genre;
    double rating;

    public Movie(Video video, Genre genre, double rating) {
        this.video = video;
        this.genre = genre;
        this.rating = rating;
    }


    @Override
    public String getTitle() {
        return video.getTitle();
    }

    @Override
    public double getRating() {
        return this.rating;
    }


    @Override
    public int getLength() {
        return video.getLength();
    }

    @Override
    public Genre getGenre() {
        return this.genre;
    }

}
