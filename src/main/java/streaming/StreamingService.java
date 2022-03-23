package streaming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamingService {

    private List<Content> contents = new ArrayList<>();

    public void addContent(Content content) {
        contents.add(content);
    }

    public List<Content> getContents() {
        return new ArrayList<>(contents);
    }

    public List<Content> getContentsSortedByRating() {
        return contents.stream().sorted(Content::compareTo).collect(Collectors.toList());
    }


    public List<Content> findByTitle(String title) {
        return contents.stream().filter(a -> a.getTitle().equals(title)).collect(Collectors.toList());
    }

    public Map<Genre, Integer> countContentByGenre() {
        Map<Genre, Integer> result = new HashMap<>();
        for (Map.Entry<Genre, Long> e : countContentByGenreLong().entrySet()) {
            result.put(e.getKey(), e.getValue().intValue());
        }
        return result;
    }


    public Map<Genre, Long> countContentByGenreLong() {
        return contents.stream().collect(Collectors.groupingBy(Content::getGenre, Collectors.counting()));
    }


}
