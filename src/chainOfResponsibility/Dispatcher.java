package chainOfResponsibility;

public interface Dispatcher {

    void setNextChain(Dispatcher nextChain);

    void dispense(Client client);
}
