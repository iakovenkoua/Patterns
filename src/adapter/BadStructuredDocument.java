package adapter;

public class BadStructuredDocument implements IBadStructuredDocument {

    private final String leftHeader;
    private final String rightHeader;

    private final String leftFooter;
    private final String rightFooter;

    private final String author1;
    private final String author2;

    public BadStructuredDocument(String leftHeader, String rightHeader, String leftFooter, String rightFooter,
                                 String author1, String author2) {
        this.leftHeader = leftHeader;
        this.rightHeader = rightHeader;
        this.leftFooter = leftFooter;
        this.rightFooter = rightFooter;
        this.author1 = author1;
        this.author2 = author2;
    }

    @Override
    public String getLeftHeader() {
        return leftHeader;
    }

    @Override
    public String getRightHeader() {
        return rightHeader;
    }

    @Override
    public String getLeftFooter() {
        return leftFooter;
    }

    @Override
    public String getRightFooter() {
        return rightFooter;
    }

    public String getFirstAuthor() {
        return author1;
    }

    public String getSecondAuthor() {
        return author2;
    }

}
