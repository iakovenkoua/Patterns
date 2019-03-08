package mediator;

public class CallTaxi {
    private Mediator mediator;

    public CallTaxi(Mediator mediator) {
        this.mediator = mediator;
    }

    public void answer(){
        mediator.callAnswer();
        System.out.println("Time");
    }
}
