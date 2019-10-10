import java.util.ArrayList;

public class ApplicationMediator implements Mediator {
    private ArrayList<Colleague> colleagues;

    public ApplicationMediator() {
        colleagues = new ArrayList<Colleague>();
    }

    public void addColleagues (Colleague colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void send(String message, String receiverID) {
        for (Colleague col:
             colleagues) {
            if (col.getColleagueID().equalsIgnoreCase(receiverID)) {
                col.receive(message);
            }


        }
    }
}
