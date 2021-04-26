package Generate;

public class Manager {
    CommandPattern commandpattern;

    public void takeOrder(CommandPattern c){
        commandpattern = c;
        commandpattern.orderType();
    }
}
