package command;

public class PineappleCommand implements Command {

    @Override
    public void cook(BaseReceiver baseReceiver) {
        System.out.println("Add pineapple to pizza");
    }
}
