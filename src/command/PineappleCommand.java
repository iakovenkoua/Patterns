package command;

public class PineappleCommand implements Command {
    @Override
    public void cook() {
        System.out.println("Add pineapple to pizza");
    }
}
