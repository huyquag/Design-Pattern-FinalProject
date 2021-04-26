	package Dienthoaididong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public abstract class Dienthoaicaocap implements Smartphone {
	public abstract int price();
	public abstract String getDescription();
	//template
	public void Delivery() {
		addtocart();
		AnnouceAddress();
		Payment();
		
        if(Accessories()) {
            addAccessories();
        }
        
    	if(Temperedglass()) {
    		pasteglass();
    	}
	}
	
    public void addtocart() {
        System.out.println("Add to cart and onward stepping" );
    }

    public void AnnouceAddress () {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Address:");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Filling Address:" + userName  );
    }

    public void Payment() {
        System.out.println("Pay after receiving");
    }
	
    public abstract void addAccessories();

    boolean Accessories(){
        return true;
    }
	
	public void pasteglass(){
        System.out.println("Paste glass");
    }
    
    //or startWith
    public boolean Temperedglass() {
    	String required = getRequired();
    	
    	if(required.toLowerCase().startsWith("y")) {
    		return true;
    	}else
    		return false;
    	
    }
    
    private String getRequired() {
    	String choose = null;
    	System.out.println("Would you like to tempered glass (Free)? (y/n)?");
    	
    	//Đọc yêu cầu 
    	
    	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    	try {
    		choose = input.readLine();
    	}catch (IOException e) {
            e.printStackTrace();
        }
    	
    	if(choose == null) {
    		choose = "No";
    	}
    	return choose;
    }
}
