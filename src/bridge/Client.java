package bridge;

public class Client {
    public static void main(String[] args) {
        final Dish dish = new FirstDish(new UkrKitchen());
        dish.prepare();
        dish.boil();
        dish.serve();
    }

}
