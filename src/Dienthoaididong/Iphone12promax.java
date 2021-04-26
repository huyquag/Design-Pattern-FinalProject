package Dienthoaididong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Iphone12promax extends Dienthoaicaocap {
	private int price = 30000000;
	
	private String name = "Iphone12promax";

    
	public int price() {
		return price;
	}
	
//	public void setprice(int price) {
//		this.price = price;
//	}
//	
	public String getDescription() {
		return name;
	}
	
//    public void setDescription(String name) {
//        this.name = name;
//    }
    
	@Override
	public void addAccessories() {
		System.out.println("Airpod");
	}
	
    public boolean Accessories(){
        String required = getRequired();

        if(required.toLowerCase().startsWith("y")){
            price = price + 4000000;
            return true;
        }
        else
            return false;
    }
	
    private String getRequired() {
    	String choose = null;
    	System.out.println("Would you like to buy Airpod? (y/n)?");
    	
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
