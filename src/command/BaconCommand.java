package command;

public class BaconCommand implements Command {

    public BaconCommand(PizzaReceiver pizza) {
        this.cook(pizza);
    }

    @Override
    public void cook(BaseReceiver baseReceiver) {
        System.out.println("Add bacon to " + baseReceiver);
    }
}
