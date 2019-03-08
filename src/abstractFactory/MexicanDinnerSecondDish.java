package abstractFactory;

public class MexicanDinnerSecondDish implements SecondDish {
    @Override
    public void taste() {
        System.out.println("Mexican dinner, second dish");
    }
}
