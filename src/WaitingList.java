import java.util.*;



public class WaitingList {

    // this list keep avaible tables which are not take by customers
    public static List<Integer> tableAvaible= new ArrayList<>();



    Handler h1 = new PartyForOneHandler() ;
    Handler h2 = new PartyForTwoHandler() ;
    Handler h3 = new PartyForThreeHandler() ;
    Handler h4 = new PartyForFourHandler() ;
    Handler d  = new DefaultHandler() ;

    public WaitingList() {
        h4.setSuccessor(h3);
        h3.setSuccessor(h2);
        h2.setSuccessor(h1);
        h1.setSuccessor(d);
    }

    public void buidWaitingList(Customer c){


//        for(int i = 0; i < 20; i++){
//            Random rand = new Random();
//
//            // random phone number
//            int num1 = (rand.nextInt(7) + 1) * 100 + (rand.nextInt(8) * 10) + rand.nextInt(8);
//            int num2 = rand.nextInt(743);
//            int num3 = rand.nextInt(10000);
//
//            DecimalFormat df3 = new DecimalFormat("000"); // 3 zeros
//            DecimalFormat df4 = new DecimalFormat("0000"); // 4 zeros
//
//            String phoneNumber = df3.format(num1) + "-" + df3.format(num2) + "-" + df4.format(num3);
//
//            // random party number
//            int  partyNumber = rand.nextInt(5) + 1;
//
//            String customerName = "Customer" + i;
//            Customer c = new Customer(customerName, phoneNumber, partyNumber);

            Global.waitList.add(c);
            distribute(c);

//        }

    }

    public void distribute(Customer c){

        switch (c.getPartyNumber()){
            case 1:
                h1.addCustomer(c);
                break;
            case 2:
                h2.addCustomer(c);
                break;
            case 3:
                h3.addCustomer(c);
                break;
            case 4:
                h4.addCustomer(c);
                break;
            default:
                System.out.println("More than 5!!!!!");
                System.out.println("Our restaurant is not able to accommodate your party!!");
        }
    }

    public void handleRequest(int num){
        h4.handleRequest(num);
    }

}
