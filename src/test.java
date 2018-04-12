import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

public class test {



    @Test
    public void test1() {
        WaitingList waitingList = new WaitingList();

//        Scanner scanner = new Scanner(System.in);
//
//        String customerParams  = scanner.nextLine();

        //Customer c = new Customer(customerName, phoneNumber, partyNumber);

        Customer c = new Customer("Any", "408-666-1234", 4);
        waitingList.buidWaitingList(c);
        waitingList.handleRequest(5);
    }
}
