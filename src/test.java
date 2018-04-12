import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

import static junit.framework.TestCase.assertEquals;

public class test {

    @Test
    public void test1() {
        WaitingList waitingList = new WaitingList();

        String message = "Table of  5 can not accomodate any parties on the wait list.";

        Customer c = new Customer("Any", "408-666-1234", 4);
        waitingList.buidWaitingList(c);
        waitingList.handleRequest(5);
        assertEquals(1, Global.waitList.size());
    }

    @Test
    public void test2(){

        WaitingList waitingList = new WaitingList();

        Customer c = new Customer("Any", "408-666-1234", 4);
        waitingList.buidWaitingList(c);
        assertEquals(1, Global.waitList.size());

    }

    @Test
    public void test3(){

        WaitingList waitingList = new WaitingList();
        waitingList.buidWaitingList();

        assertEquals(20, Global.waitList.size());

    }

    @Test
    public void test4(){

        WaitingList waitingList = new WaitingList();
        DefaultHandler d = new DefaultHandler();
        d.handleRequest(4);

        assertEquals(1, waitingList.tableAvaible.size());

    }
}
