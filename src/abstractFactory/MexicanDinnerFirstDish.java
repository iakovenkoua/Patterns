package abstractFactory;

public class MexicanDinnerFirstDish implements FirstDish {

    @Override
    public void taste() {
        System.out.println("Mexican dinner, first dish");
    }
}
