package state;

public class OverHeatState implements State {

    @Override
    public void doAction(Oven oven) {
        System.out.println("Oven is overheat state");
    }

}
