package bridge;

public class UkrKitchen implements Kitchen {
    @Override
    public void prepareFoodItems() {
        System.out.println("Ukrainian kitchen prepare");
    }

    @Override
    public void boilItems() {
        System.out.println("Ukrainian kitchen boil");
    }

    @Override
    public void serveItems() {
        System.out.println("Ukrainian kitchen serve");
    }
}
