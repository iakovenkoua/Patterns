package builder;

public class PrintDocument {
    private final String name;
    private final String title;

    private int ttlNumber;
    private boolean isHeaderEnabled;
    private boolean isFooterEnabled;
    private String author;

    public PrintDocument(PrintDocumentBuilder builder) {
        this.name = builder.name;
        this.title = builder.title;
        this.ttlNumber = builder.ttlNumber;
        this.author = builder.author;
        this.isHeaderEnabled = builder.isHeaderEnabled;
        this.isFooterEnabled = builder.isFooterEnabled;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public int getTtlNumber() {
        return ttlNumber;
    }

    public void setTtlNumber(int ttlNumber) {
        this.ttlNumber = ttlNumber;
    }

    public boolean isHeaderEnabled() {
        return isHeaderEnabled;
    }

    public void setHeaderEnabled(boolean headerEnabled) {
        isHeaderEnabled = headerEnabled;
    }

    public boolean isFooterEnabled() {
        return isFooterEnabled;
    }

    public void setFooterEnabled(boolean footerEnabled) {
        isFooterEnabled = footerEnabled;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void showDocument() {
        System.out.println("Name: " + name);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("TTL number: " + ttlNumber);
        System.out.println("Header enabler: " + isHeaderEnabled);
        System.out.println("Footer enabled: " + isFooterEnabled);
    }

    public static class PrintDocumentBuilder {

        private final String name;
        private final String title;

        private int ttlNumber;
        private boolean isHeaderEnabled;
        private boolean isFooterEnabled;
        private String author;

        public PrintDocumentBuilder(String name, String title) {
            this.name = name;
            this.title = title;
        }

        public int getTtlNumber() {
            return ttlNumber;
        }

        public boolean isHeaderEnabled() {
            return isHeaderEnabled;
        }

        public boolean isFooterEnabled() {
            return isFooterEnabled;
        }

        public String getAuthor() {
            return author;
        }

        public PrintDocumentBuilder setTtlNumber(int ttlNumber) {
            this.ttlNumber = ttlNumber;
            return this;
        }

        public PrintDocumentBuilder setHeaderEnabled(boolean headerEnabled) {
            isHeaderEnabled = headerEnabled;
            return this;
        }

        public PrintDocumentBuilder setFooterEnabled(boolean footerEnabled) {
            isFooterEnabled = footerEnabled;
            return this;
        }

        public PrintDocumentBuilder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public PrintDocument build() {
            return new PrintDocument(this);
        }

    }

}
