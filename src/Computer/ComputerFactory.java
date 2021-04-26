package Computer;

public class ComputerFactory {
	public Computer PComputer(String ComputerType) {
		
	
    if (ComputerType.equals(null)){
        return null;
    }
    else if(ComputerType.equals("LaptopAsusX790")){
        return new LaptopAsus();
    }
    else if(ComputerType.equals("Desktop")){
        return new Desktop();
    }
	return null;
	}
}

