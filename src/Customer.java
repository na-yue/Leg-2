import java.util.Scanner;

public class Customer {
    String name;
    String phoneNumber;
    int partyNumber;

    public Customer(String name, String phoneNumber, int partyNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.partyNumber = partyNumber;

        System.out.println(name + " registed on the wait list with party number " + partyNumber + "!");
    }

    public boolean reply(){
        System.out.println("Send message to customer " + this.name);
        System.out.println("Table Ready");
        System.out.println("Do you want to come? Please enter Yes or No");

        Scanner scanner = new Scanner(System.in);

        String reply = scanner.nextLine();
        if(reply.equalsIgnoreCase("yes")){
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
