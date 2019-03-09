package observerOrListener;

public class ClientFirst extends Observer{

    public ClientFirst(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Change storm state: " + subject.getState());
    }
}
