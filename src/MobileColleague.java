public class MobileColleague extends Colleague {

    public MobileColleague(Mediator m, String cID) {
        super(m, cID);
    }

    @Override
    public void receive(String message) {
        System.out.println("Mobile received: " + message);
    }
}
