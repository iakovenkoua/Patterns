package bridge;

public abstract class Dish {
    protected final Kitchen kitchen;

    public Dish(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public void prepare() {
        kitchen.prepareFoodItems();
    }

    public void boil() {
        kitchen.boilItems();
    }

    public void serve() {
        kitchen.serveItems();
    }
}
