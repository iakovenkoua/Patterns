package state;

public class Oven {

    private State state;

    public Oven(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
