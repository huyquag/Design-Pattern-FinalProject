package Generate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import DAO.*;

public class Client {
    static String DienthoaiType="";
    public static void main(String[] args) {
        Manager manager = new Manager();
        Prepare prepare = new Prepare();

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("What type do you want to purchase or Watching clients after Changing?");
            System.out.println("(1) Computer");
            System.out.println("(2) Smart phone");
            System.out.println("(3) Personal details");
            int choose = scanner.nextInt();
            if(choose==1) {
                ArrayList<String> ComponentsList = new ArrayList<>();
                ArrayList<String> GearList = new ArrayList<>();

                String ComputerType = null;
                String choosee = null;

                while (true) {
                    System.out.println("Which Computer do you want?");
                    System.out.println("(1) Desktop <---> 10000000 VND");
                    System.out.println("(2) LaptopAsusX790 <---> 20000000 VND");

                    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
                    try {
                        choosee = input.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    if (choosee.equals("1")) {
                        ComputerType = "Desktop";
                        System.out.println("<---> Desktop is chosen. <--->");
                        break;
                    } else if (choosee.equals("2")) {
                        ComputerType = "LaptopAsusX790";
                        System.out.println("<---> LaptopAsusX790 is chosen. <--->");
                        break;
                    }  else if (choosee.equals("3")) {
                    	ComputerType = "Adjust Information";
                    	System.out.println("<---> Adjust Information is chosen <--->");
                    	break;
                        }
                    else {
                        continue;
                    }
                }
    	        System.out.println("");
                Scanner scan = new Scanner(System.in);
                for (int i = 0; i <= 2; i++ ) {
                    System.out.println("-------------------- Components Categories --------------------");
                    System.out.println("(1) ramCase <---> 5000000 VND");
                    System.out.println("(2) MainBoard <---> 6000000 VND");
                    System.out.println("(3) caseCPU <---> 6000000 VND");
                    System.out.println("(Other) I finished the components selection.");

                    int value = scan.nextInt();
                    if (value == 1) {
                        ComponentsList.add("ramCase");
                        System.out.println("--> ramCase is chosen.");
                    } else if (value == 2) {
                        ComponentsList.add("MainBoard");
                        System.out.println("--> MainBoard is chosen.");
                    } else if (value == 3) {
                        ComponentsList.add("caseCPU");
                        System.out.println("--> caseCPU is chosen.");
                    }
                    
                    else break;
                }
                System.out.println("The selection of components is completed.");

    	        System.out.println("");
                Scanner scan2 = new Scanner(System.in);
                for (int i = 0; i <= 2; ++i) {
                    System.out.println("-------------------- Gear for computer --------------------");
                    System.out.println("(1) KeyBoard <---> 800000 VND");
                    System.out.println("(2) Headphone <---> 890000 VND");
                    System.out.println("(3) ComputerMouse <---> 980000 VND");
                    System.out.println("(Other) I finished the gear selection.");
                    int value = scan2.nextInt();
                    if (value == 1) {
                        GearList.add("KeyBoard");
                        System.out.println("--> KeyBoard is chosen.");
                    } else if (value == 2) {
                    	GearList.add("Headphone");
                        System.out.println("--> Headphone is chosen.");
                    } else if (value == 3) {
                    	GearList.add("ComputerMouse");
                        System.out.println("--> ComputerMouse is chosen.");
                    } else break;
                }
                System.out.println("The selection of gears is completed.");

                
                

                String[] Componentsarr = new String[ComponentsList.size()];
                Componentsarr = ComponentsList.toArray(Componentsarr);

                String[] GearArr = new String[GearList.size()];
                GearArr = GearList.toArray(GearArr);

                ComputerOrder ComputerOrder = new ComputerOrder (prepare, ComputerType, Componentsarr, GearArr);
                manager.takeOrder(ComputerOrder);
            }

            else if(choose==2) {
                Scanner scanBeverage = new Scanner(System.in);
                System.out.println("-------------------- Smartphone --------------------");
                for (int i = 0; i < 1; i++) {
                    System.out.println("-------------------- Smartphone Categories --------------------");
                    System.out.println("(1) Iphone12promax --- 30000000 VND");
                    System.out.println("(2) Realmesix --- 6000000 VND");
                    System.out.println("(3) Samsungs21ultra --- 26000000 VND");
                    System.out.println("(4) Xiaominote8 --- 5000000 VND");
                    System.out.println("(Other) I finished the drink selection.");
                    int dienthoai = scanBeverage.nextInt();
                    if(dienthoai==1){
                        DienthoaiType="Iphone12promax";
                        System.out.println("*** Iphone12promax is chosen.");
                    }
                    else if(dienthoai==2){
                    	DienthoaiType="Realmesix";
                        System.out.println("*** Realmesix is chosen.");
                    }
                    else if(dienthoai==3){
                    	DienthoaiType="Samsungs21ultra";
                        System.out.println("*** Samsungs21ultra is chosen.");
                    }
                    else if(dienthoai==4){
                    	DienthoaiType="Xiaominote8";
                        System.out.println("*** Xiaominote8 is chosen.");
                    }
                    else{
                        break;
                    }
                }
                System.out.println("The selection of smartphone is completed.");
                System.out.println("");

                DienthoaiOrder beverageOrder = new DienthoaiOrder(prepare, DienthoaiType);
                manager.takeOrder(beverageOrder);
            }
            else if(choose==3) {
              DAO clientDAO = new AdminDAO();
            	
	        //print all students
	        for (Accounts client : clientDAO.getAllClients()) {
	           System.out.println("Client: [RollNo : " + client.getRollNo() + ", Name : " + client.getName() +", Email : " + client.getemail() + " ]");
	        }
	        System.out.println("");
	
	        //update student
	        Accounts client =clientDAO.getAllClients().get(0);
	        client.setName("Long");
	        client.setemail("Long2k@gmail.com");
	        clientDAO.updateClients(client);
	        

	        //get the student
	        clientDAO.getClients(0);
	        System.out.println("");
	        System.out.println("Client: [RollNo : " + client.getRollNo() + ", Name : " + client.getName() +", Email : " + client.getemail() + " ]");		
	        System.out.println("");
        
                }
            
            else{
                System.out.println("-------------------------------------------------------------------------------");
                System.out.println("BON APPETIT");
                break;
            }
        }
   
    }
}
