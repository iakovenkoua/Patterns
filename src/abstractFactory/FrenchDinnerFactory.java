package abstractFactory;

public class FrenchDinnerFactory implements AbstractDinnerFactory {

    @Override
    public FirstDish getFirstDish() {
        return null;
    }

    @Override
    public SecondDish getSecondDish() {
        return null;
    }
}
