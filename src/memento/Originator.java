package memento;

public class Originator {
    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }

    class Memento {
        String state;

        Memento(String state){
            this.state = state;
        }

        String getState(){
            return state;
        }
    }
}
