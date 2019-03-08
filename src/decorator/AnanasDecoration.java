package decorator;

public class AnanasDecoration extends BaseDecoration{
    public AnanasDecoration(Pizza pizza) {
        this.createPizza = pizza;
    }

    @Override
    public void coockes() {
        createPizza.coockes();
        System.out.println("With ananas");
    }
}
