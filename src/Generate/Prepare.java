package Generate;

import Dienthoaididong.*;
import Computer.*;

public class Prepare {
    public static String DienthoaiType = "";
    public static String ComputerType = "";
    public static String[] ComponentsList = null;
    public static String[] GearList  = null;
    Computer computer;
    Smartphone dienthoai;
    
    public void getOrder(String factoryType){
        if(factoryType.equalsIgnoreCase("Computer")){
            System.out.println(DienthoaiType + "order received.");

            ComputerFactory computerF =  new ComputerFactory();
            computer = computerF.PComputer(ComputerType);

            computer.Addtocart(ComputerType);
            computer.Announce(ComputerType);
            computer.Payment(ComputerType);
            computer = Accessories(ComponentsList, GearList);

            System.out.println(computer.getDescription() + " order completed.");
            System.out.println("Cost:" + computer.price() +"VND");

        }
        else if(factoryType.equalsIgnoreCase("Dienthoai")){
            System.out.println(DienthoaiType + " order received.");

            SmartphoneFactory factory = new SmartphoneFactory();
            dienthoai = factory.getDienthoai(DienthoaiType);
            dienthoai.Delivery();

            System.out.println(dienthoai.getDescription() + " order completed.");
            System.out.println("Cost:" + dienthoai.price() +"VND");
        }
        System.out.println("");
        
    }
    public Computer Accessories(String[] ComponentsList, String[] GearList){
        for (int i = 0; i < ComponentsList.length; i++) {
            String components = ComponentsList[i];
            if(components.equals("ramCase")){
                computer = new ramCase(computer);
            }
            else if(components.equals("Mainboard")){
                computer = new MainBoardCase(computer);
            }
            else if(components.equals("caseCPU")){
                computer = new caseCPU(computer);
            }
        }

        for (int i = 0; i < GearList.length; i++) {
            String gear = GearList[i];
            if(gear.equals("KeyBoard")){
                computer = new KeyBoard(computer);
            }
            else if(gear.equals("Headphone")){
                computer = new Headphone(computer);
            }
            else if(gear.equals("ComputerMouse")){
                computer = new ComputerMouse(computer);
            }
        }

        return computer;
    }
 }
