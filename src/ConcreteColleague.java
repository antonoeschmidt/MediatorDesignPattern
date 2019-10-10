public class ConcreteColleague extends Colleague{

    public ConcreteColleague(Mediator m, String colleageID) {
        super(m, colleageID);
    }

    /*@Override
    public void broadcast(String message, String receiverID) {
        super.broadcast(message, receiverID);
    }

    @Override
    public Mediator getMediator() {
        return super.getMediator();
    }

    @Override
    public String getColleagueID() {
        return super.getColleagueID();
    }*/

    @Override
    public void receive(String message) {
        System.out.println("Message received: " + message);
    }
}
