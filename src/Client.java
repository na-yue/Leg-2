import java.util.Queue;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Client {
    
    public void runTest()
    {
        BuildWaitingList buildWaitingList = new BuildWaitingList();
        buildWaitingList.buidWaitingList();

        Random rand = new Random();

        for(int i = 0; i < 20; i++){
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            int availableSeats = rand.nextInt(5) + 1;
            buildWaitingList.handleRequest(availableSeats);
        }

    }
    
    public static void main( String [] args )
    {
        Client c = new Client() ;
        c.runTest() ;

    }
    

}
