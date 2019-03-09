package memento;

public class MementoPatternDemo {
    public static void main(String[] args) {

        String enterText = " State ";

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState(enterText);
        careTaker.add(originator.saveStateToMemento());

        originator.setState(enterText + " second");
        careTaker.add(originator.saveStateToMemento());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}
