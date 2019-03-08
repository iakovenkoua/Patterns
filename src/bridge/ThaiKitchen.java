package bridge;

public class ThaiKitchen implements Kitchen {
    @Override
    public void prepareFoodItems() {
        System.out.println("Thai kitchen prepare");
    }

    @Override
    public void boilItems() {
        System.out.println("Thai kitchen boil");
    }

    @Override
    public void serveItems() {
        System.out.println("Thai kitchen serve");
    }
}
