package Computer;

public class MainBoardCase extends EComponents{
	private Computer computer;

    public MainBoardCase(Computer computer){
        this.computer = computer;
    }

    @Override
    public int price() {
        return 6000000 + computer.price();
    }

    @Override
    public String getDescription() {
        return computer.getDescription() + ", MainBoard";
    }
}
