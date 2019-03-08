package adapter;

public class Client {

    public static void main(String[] args) {
        final IBadStructuredDocument document = new BadStructuredDocument("LeftHeader", "RightHeader",
                "LeftFooter", "RightFooter", "Author 1", "Author 2");
        printDocument(new BadGoodPrintDocumentAdapter(document));
    }

    private static void printDocument(IGoodStructuredDocument document) {
        System.out.println("Headers:");
        for (String header : document.getHeaders()) {
            System.out.println(header);
        }
        System.out.println("Footers:");
        for (String footer : document.getFooters()) {
            System.out.println(footer);
        }
        System.out.println("Authors:");
        for (String author : document.getAuthors()) {
            System.out.println(author);
        }
    }
}
