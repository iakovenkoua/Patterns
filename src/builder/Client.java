package builder;

public class Client {
    public static void main(String[] args) {
        final PrintDocument document = new PrintDocument.PrintDocumentBuilder("My document", "Document title")
                .setAuthor("John Smith")
                .setTtlNumber(12345)
                .setHeaderEnabled(true)
                .build();
        document.showDocument();
    }
}
