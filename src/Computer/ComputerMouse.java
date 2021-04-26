package Computer;

public class ComputerMouse extends Gear {
    private Computer computer;

    public ComputerMouse(Computer computer){
        this.computer = computer;
    }

    @Override
    public int price() {
        return 9888888 + computer.price();
    }

    @Override
    public String getDescription() {
        return computer.getDescription() + ", 8 grb";
    }
}
