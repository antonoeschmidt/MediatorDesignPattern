import com.sun.xml.internal.bind.v2.model.core.ID;

public abstract class Colleague {
    private Mediator mediator;
    private String colleagueID;

    public Colleague(Mediator m, String colleagueID) {
        mediator = m;
        colleagueID = colleagueID;
    }
    public void broadcast(String message, String receiverID) {
        mediator.send(message, receiverID);
    }
    public Mediator getMediator() {
        return mediator;
    }

    public String getColleagueID() {
        return colleagueID;
    }

    public abstract void receive(String message);
}

