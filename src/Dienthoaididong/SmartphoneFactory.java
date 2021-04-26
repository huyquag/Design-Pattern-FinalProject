package Dienthoaididong;

//Create a Factory to generate object of concrete class based on given information.

//single static field, and return that value if smart phone is already created.

public class SmartphoneFactory {
	// Singleton pattern
	private static Smartphone Smartphoneproduct;
	public synchronized Smartphone getDienthoai(String dienthoaiType) {
		String n = null;
		
		if (dienthoaiType.equals(n)){
            return null;
        }
        else if(dienthoaiType.equals("Realmesix")){
            return new Realmesix();
        }
        else if(dienthoaiType.equals("Samsungs21ultra")){
            return new Samsungs21ultra();
        }
        else if(dienthoaiType.equals("Iphone12promax")){
            return new Iphone12promax();
        }
        else if(dienthoaiType.equals("Xiaominote8")){
            return new Xiaominote8();
        }
        return null;
	}
}
