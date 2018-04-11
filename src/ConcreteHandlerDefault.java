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
        WaitingList b = new WaitingList();
        b.tableAvaible.add(tableSeatsNum);

        if(b.waitList.size() > 0) {
            System.out.println("Table of  " + tableSeatsNum + " can not accomodate any parties on the wait list.");
            return;
        }

        System.out.println("Wait list is empty.");

    }


    public void setSuccessor(Handler next) {
        this.successor = next ;
    }

}
