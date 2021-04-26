package Computer;

public class ramCase extends EComponents{
	private Computer computer;

    public ramCase(Computer computer){
        this.computer = computer;
    }

    @Override
    public int price() {
        return 5000000 + computer.price();
    }

    @Override
    public String getDescription() {
        return computer.getDescription() + ", 8gb";
    }
}
