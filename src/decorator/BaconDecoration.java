package decorator;

public class BaconDecoration extends BaseDecoration{
    public BaconDecoration(Pizza pizza) {
        this.createPizza = pizza;
    }

    @Override
    public void coockes() {
        createPizza.coockes();
        System.out.println("With bacon");
    }
}
