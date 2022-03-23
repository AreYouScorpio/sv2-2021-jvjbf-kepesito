package streaming;

public class Video {

    private String title;
    private int length;

    public Video(String title, int lengthInMin) {
        this.title = title;
        this.length = lengthInMin;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

}
