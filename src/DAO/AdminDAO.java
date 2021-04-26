package DAO;

import java.util.ArrayList;
import java.util.List;
import Dienthoaididong.*;

public class AdminDAO implements DAO{
	   //list is working as a database
	   List<Accounts> clients;

	   public AdminDAO(){
	      clients = new ArrayList<Accounts>();
	      Accounts student1 = new Accounts("Thinh",0,"Thinh2k@gamil.com");
	      clients.add(student1);
	   }
	   @Override
	   public void deleteClients(Accounts client) {
		  clients.remove(client.getRollNo());
	      System.out.println("<----> Client: Roll No " + client.getRollNo() + ", deleted from database <---->");
	   }

	   //retrive list of students from the database
	   @Override
	   public List<Accounts> getAllClients() {
	      return clients;
	   }

	   @Override
	   public Accounts getClients(int rollNo) {
	      return clients.get(rollNo);
	   }

	   @Override
	   public void updateClients(Accounts client) {
	      clients.get(client.getRollNo()).setName(client.getName());
	      System.out.println("<----> Client: Roll No " + client.getRollNo() + ", updated in the database <---->");
	   }

    
}
