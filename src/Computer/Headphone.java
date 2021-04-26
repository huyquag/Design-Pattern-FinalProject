package Computer;

public class Headphone extends Gear {
    private Computer computer;

    public Headphone(Computer computer){
        this.computer = computer;
    }

    @Override
    public int price() {
        return 890000 + computer.price();
    }

    @Override
    public String getDescription() {
        return computer.getDescription() ;
    }
}
