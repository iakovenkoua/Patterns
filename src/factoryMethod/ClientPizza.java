package factoryMethod;

public class ClientPizza {
    public static void main(String[] args) {
        final Pizza pizza = SimplePizzaFactory.createPizza();
        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
    }
}
