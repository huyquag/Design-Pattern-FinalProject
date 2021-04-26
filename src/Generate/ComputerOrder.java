package Generate;

public class ComputerOrder implements CommandPattern {
    Prepare prepare;
    String[] ComponentsList, GearList;
    String order;
    public ComputerOrder(Prepare prepare, String order, String[] ComponentsList, String[] GearList){
        this.prepare = prepare;
        this.order = order;
        this.ComponentsList = ComponentsList;
        this.GearList = GearList;

    }

    public void orderType() {
        prepare.ComputerType = order;
        prepare.ComponentsList = this.ComponentsList;
        prepare.GearList = this.GearList;
        prepare.getOrder("Computer");
    }
}
