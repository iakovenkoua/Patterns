package adapter;

import java.util.List;

public interface IGoodStructuredDocument {

    List<String> getHeaders();

    List<String> getFooters();

    List<String> getAuthors();

}
