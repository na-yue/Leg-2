import java.util.LinkedList;
import java.util.Queue;

public class ConcreteHandler3 implements Handler {


    private Handler successor = null;
    Queue<Customer> q = new LinkedList();

    public ConcreteHandler3() {
    }

    public ConcreteHandler3(Customer c) {
        q.add(c);
    }

    public void addCustomer(Customer c) {
        q.add(c);
    }

    public void handleRequest(int tableSeatsNum ) {
        // System.out.println( "R1 got the request...");
        System.out.println( this.getClass().getName() + " => This one is mine!");


        if ( tableSeatsNum >= 3 && q.size() > 0 ) {

            while(q.size() > 0){

                Customer front = q.remove();
                Boolean reply = front.reply();

                if(reply) return;
            }

            if ( successor != null )
                successor.handleRequest(tableSeatsNum);
        }
        else {
            if ( successor != null )
                successor.handleRequest(tableSeatsNum);
        }
    }


    public void setSuccessor(Handler next) {
        this.successor = next ;
    }

}