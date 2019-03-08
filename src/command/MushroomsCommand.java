package command;

public class MushroomsCommand implements Command {
    @Override
    public void cook() {
        System.out.println("Add mushrooms to pizza");
    }
}
