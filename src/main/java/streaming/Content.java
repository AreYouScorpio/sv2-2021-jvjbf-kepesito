package streaming;

public interface Content extends Comparable<Content> {

    String getTitle();

    double getRating();

    int getLength();

    Genre getGenre();

    @Override
    public default int compareTo(Content o) {
        return Double.valueOf(getRating()).compareTo(o.getRating());
    }
}
