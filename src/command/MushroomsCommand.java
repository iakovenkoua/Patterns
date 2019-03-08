package command;

public class MushroomsCommand implements Command {
    @Override
    public void cook(BaseReceiver baseReceiver) {
        System.out.println("Add mushrooms to pizza");
    }
}
