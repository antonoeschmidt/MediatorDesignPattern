public class ConcreteColleague extends Colleague{

    public ConcreteColleague(Mediator m, String colleageID) {
        super(m, colleageID);
    }

    @Override
    public void receive(String message) {
        System.out.println("Concrete received: " + message);
    }
}
