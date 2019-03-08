package abstractFactory;

public class FrenchDinnerFactory implements AbstractDinnerFactory {

    @Override
    public FirstDish getFirstDish() {
        return new FrenchDinnerFirstDish();
    }

    @Override
    public SecondDish getSecondDish() {
        return new FrenchDinnerSecondDish();
    }
}
