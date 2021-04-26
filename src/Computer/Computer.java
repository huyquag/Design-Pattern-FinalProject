package Computer;
import java.util.Scanner;  
public abstract class Computer {
    String description = "";

    public abstract int price();

    public String getDescription(){
        return description;
    }

    public void Addtocart(String type) {
        System.out.println("Add to cart:"+ type );
    }

    public void Announce (String type) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Address:");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Filling Address:" + userName + type );
    }

    public void Payment(String type) {	
        System.out.println("Paying money after receiving:" + type);
    }
}
