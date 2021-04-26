package Dienthoaididong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Samsungs21ultra extends Dienthoaicaocap {
	int price = 26000000;
	
	public int price() {
		return price;
	}
	
	public String getDescription() {
		return "Samsungs21ultra";
	}

	@Override
	public void addAccessories() {
		System.out.println("Galaxy Buds pro");
	}
	
    public boolean Accessories(){
        String required = getRequired();

        if(required.toLowerCase().startsWith("y")){
            price = price + 3600000;
            return true;
        }
        else
            return false;
    }
	
    private String getRequired() {
    	String choose = null;
    	System.out.println("Would you like to buy Galaxy Buds pro? (y/n)?");
    	
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

