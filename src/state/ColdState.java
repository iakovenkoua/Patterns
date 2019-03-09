package state;

public class ColdState implements State{

    @Override
    public void doAction(Oven oven) {
        System.out.println("Oven is cold state");
        oven.setState(this);
    }
}
