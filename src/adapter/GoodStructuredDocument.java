package adapter;

import java.util.ArrayList;
import java.util.List;

public class GoodStructuredDocument implements IGoodStructuredDocument {
    private final List<String> headers = new ArrayList<>();
    private final List<String> footers = new ArrayList<>();
    private final List<String> authors = new ArrayList<>();

    public GoodStructuredDocument() {
    }

    public void addHeader(String header) {
        headers.add(header);
    }

    public void addFooter(String footer) {
        footers.add(footer);
    }

    public void addAuthor(String author) {
        authors.add(author);
    }

    @Override
    public List<String> getHeaders() {
        return headers;
    }

    @Override
    public List<String> getFooters() {
        return footers;
    }

    @Override
    public List<String> getAuthors() {
        return authors;
    }
}
