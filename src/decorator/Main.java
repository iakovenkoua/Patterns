package decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new AnanasDecoration(
                new BaconDecoration(
                        new CheezeDecoration(
                                new CurrentPizza()
                        )
                )
        );
        pizza.coockes();
    }
}
