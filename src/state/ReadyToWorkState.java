package state;

public class ReadyToWorkState implements State {

    @Override
    public void doAction(Oven oven) {
        System.out.println("Oven is ready to work state");
        oven.setState(this);
    }
}
