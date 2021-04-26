package Computer;

public class caseCPU extends EComponents   {
    private Computer computer;

    public caseCPU(Computer computer){
        this.computer = computer;
    }

    @Override
    public int price() {
        return 9400000 + computer.price();
    }

    @Override
    public String getDescription() {
        return computer.getDescription() + ", CPU core i9";
    }
}