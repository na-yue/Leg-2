import java.util.Queue;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Client {
    
    public void runTest()
    {
//        WaitingList waitingList = new WaitingList();
//       // waitingList.buidWaitingList();
//
//        Random rand = new Random();
//
//        for(int i = 0; i < 20; i++){
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            int availableSeats = rand.nextInt(5) + 1;
//            waitingList.handleRequest(availableSeats);
//        }
        WaitingList waitingList = new WaitingList();
        Customer c = new Customer("Any", "408-666-1234", 4);
        waitingList.buidWaitingList(c);
        waitingList.handleRequest(5);

    }
    
    public static void main( String [] args )
    {
        Client c = new Client() ;
        c.runTest() ;

    }
    

}
