package templateMethod;

public abstract class WorkWithFile {

    public void openFile(){
        System.out.println("File is open");
    }

    public void closeFile(){
        System.out.println("File is closed");
    }

    abstract void writeToFile();
}
