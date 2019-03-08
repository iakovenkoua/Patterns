package mediator;

public class ConciergeMediator implements Mediator {

    private Client client;
    private CallTaxi callTaxi = new CallTaxi(this);
    private CallMasterForHouse callMasterForHouse = new CallMasterForHouse(this);
    private CallDeliveryFlowers callDeliveryFlowers = new CallDeliveryFlowers(this);


    @Override
    public void typeOfService(String typeOfService) {

    }

    @Override
    public String callAnswer() {

        return null;
    }
}
