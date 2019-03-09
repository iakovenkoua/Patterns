package observerOrListener;

public class ClientSecond extends Observer {

    public ClientSecond(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Change storm state:  " + subject.getState());
    }
}
