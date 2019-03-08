package factoryMethod;

class SimplePizzaFactory {

    private SimplePizzaFactory() { }

    static Pizza createPizza() {
        switch (PizzaType.CLAM_PIZZA) {
            case CHEESE_PIZZA: return new CheesePizza();
            case VEGGIE_PIZZA: return new VeggiePizza();
            case CLAM_PIZZA: return new ClamPizza();
            case PEPPERONI_PIZZA: return new PepperoniPizza();
        }
        return null;
    }
}
