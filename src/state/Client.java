package state;

public class Client {
    public static void main(String[] args) {
        Oven oven = new Oven();

        ColdState coldState = new ColdState();
        coldState.doAction(oven);

        ReadyToWorkState readyToWork = new ReadyToWorkState();
        readyToWork.doAction(oven);

        OverHeatState overHeatState = new OverHeatState();
        overHeatState.doAction(oven);

    }
}


// https://sourcemaking.com/design_patterns/state/java/1
