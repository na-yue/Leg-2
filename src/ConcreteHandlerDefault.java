import java.util.LinkedList;
import java.util.Queue;

public class ConcreteHandlerDefault implements Handler {

    private Handler successor = null;
    Queue<Customer> q = new LinkedList();

    public ConcreteHandlerDefault() {
    }


    public void addCustomer(Customer c) {

    }

    public void handleRequest(int tableSeatsNum ) {
        //System.out.println( "R1 got the request...");
        System.out.println( this.getClass().getName() + " => This one is mine!");

        System.out.println("Wait list is empty now");
        BuildWaitingList b = new BuildWaitingList();
        b.tableAvaible.add(tableSeatsNum);

    }


    public void setSuccessor(Handler next) {
        this.successor = next ;
    }

}
