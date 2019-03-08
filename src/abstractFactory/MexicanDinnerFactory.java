package abstractFactory;

public class MexicanDinnerFactory implements AbstractDinnerFactory {
    @Override
    public FirstDish getFirstDish() {
        return new MexicanDinnerFirstDish();
    }

    @Override
    public SecondDish getSecondDish() {
        return new MexicanDinnerSecondDish();
    }
}
