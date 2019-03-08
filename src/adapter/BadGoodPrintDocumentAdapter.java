package adapter;

import java.util.Arrays;
import java.util.List;

public class BadGoodPrintDocumentAdapter implements IGoodStructuredDocument {

    private final IBadStructuredDocument badStructuredDocument;

    public BadGoodPrintDocumentAdapter(IBadStructuredDocument badStructuredDocument) {
        this.badStructuredDocument = badStructuredDocument;
    }

    @Override
    public List<String> getHeaders() {
        return Arrays.asList(
                badStructuredDocument.getLeftHeader(),
                badStructuredDocument.getRightHeader()
        );
    }

    @Override
    public List<String> getFooters() {
        return Arrays.asList(
                badStructuredDocument.getLeftFooter(),
                badStructuredDocument.getRightFooter()
        );
    }

    @Override
    public List<String> getAuthors() {
        return Arrays.asList(
                badStructuredDocument.getFirstAuthor(),
                badStructuredDocument.getSecondAuthor()
        );
    }

}
