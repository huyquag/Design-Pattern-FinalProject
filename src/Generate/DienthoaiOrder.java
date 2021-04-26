package Generate;

public class DienthoaiOrder implements CommandPattern {
	
	private Prepare prepare;
	private String order;

	public DienthoaiOrder(Prepare prepare, String order){
	     this.prepare = prepare;
	     this.order= order;
	}

	    @Override
	 public void orderType() {
	     prepare.DienthoaiType = order;
	     prepare.getOrder("Dienthoai");
	}	
}
