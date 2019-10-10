import org.junit.Test;

public class ApplicationMediatorTest {
    private ApplicationMediator mediator;
    private ConcreteColleague colleague1;
    private ConcreteColleague colleague2;


     void setupTest(ConcreteColleague colleague1, ConcreteColleague colleague2, ApplicationMediator mediator) {
    }

    @Test
    public void send() {

        mediator = new ApplicationMediator();
        colleague1 = new ConcreteColleague(mediator,"emp1");
        colleague2 = new ConcreteColleague(mediator, "emp2");
        mediator.addColleagues(colleague1);
        mediator.addColleagues(colleague2);
        String msg = "Send den her";
        String receiverID = "emp2";

        mediator.send(msg,receiverID);


    }
}