package DAO;

import java.util.List;

public interface DAO {
   public List<Accounts> getAllClients();
   public Accounts getClients(int id);
   public void updateClients(Accounts clients);
   public void deleteClients(Accounts clients);
}