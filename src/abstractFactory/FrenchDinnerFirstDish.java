package abstractFactory;

public class FrenchDinnerFirstDish implements FirstDish {
    @Override
    public void taste() {
        System.out.println("French dinner, first dish");
    }
}
