package Computer;

public class KeyBoard extends Gear  {
    private Computer computer;

    public KeyBoard(Computer computer){
        this.computer = computer;
    }

    @Override
    public int price() {
        return 800000 + computer.price();
    }

    @Override
    public String getDescription() {
        return computer.getDescription() ;
    }
}
