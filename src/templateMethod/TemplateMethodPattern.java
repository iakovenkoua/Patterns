package templateMethod;

public class TemplateMethodPattern {
    public static void main(String[] args) {
        WorkWithFile workWithFile = new WriteCurrentDate();

        workWithFile.openFile();
        workWithFile.writeToFile();
        workWithFile.closeFile();
    }
}
