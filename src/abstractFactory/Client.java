package abstractFactory;

public class Client {

    public static void main(String[] args) {
        final AbstractDinnerFactory factory = new FrenchDinnerFactory();

        final FirstDish firstDish = factory.getFirstDish();
        firstDish.taste();

        final SecondDish secondDish = factory.getSecondDish();
        secondDish.taste();
    }

}
