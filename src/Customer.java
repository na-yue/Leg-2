import java.util.Scanner;

public class Customer {
    String name;
    String phoneNumber;
    int partyNumber;

    public Customer(String name, String phoneNumber, int partyNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.partyNumber = partyNumber;

        System.out.println(name + " registered on the wait list with party number " + partyNumber + "!");
    }

    public boolean reply(){
        System.out.println("Send message to customer " + this.name ) ;
        System.out.println("Table for " + partyNumber +" is Ready ");
        System.out.println("Do you want to come? Please enter Confirm or Leave");

        Scanner scanner = new Scanner(System.in);

        String reply = scanner.nextLine();
        if(reply.equalsIgnoreCase("confirm")){
            System.out.println("Customer " + this.name + " confirmed!");
            System.out.println("Please go to table!");
            return true;
        }

        System.out.println("Customer " + this.name + " cancel!");
        return false;
    }

    public String getName() {
        return name;
    }

    public int getPartyNumber() {
        return partyNumber;
    }
}
