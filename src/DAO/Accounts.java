package DAO;

public class Accounts {
	   private String name;
	   private int id;
	   private String email;
	   
	   Accounts(String name, int id, String email){
	      this.name = name;
	      this.id = id;
	      this.email = email;
	   }

	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }

	   public int getRollNo() {
	      return id;
	   }

	   public void setRollNo(int rollNo) {
	      this.id = rollNo;
	   }
	   
	   public String getemail() {
		  return email;
	   }
	   
	   public void setemail(String email) {
		  this.email = email;
	   }
}
