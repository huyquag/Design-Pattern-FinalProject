package Computer;

public class Desktop extends Computer {
    public  Desktop(){
        description = "Desktop";
    }

    @Override
    public int price() {
        return 10000000;
    }
}
