import java.rmi.*;
import java.rmi.server.*;
import java.sql.*;
import java.util.*;
class BankImpl extends UnicastRemoteObject implements Bank{
BankImpl()throws RemoteException{}

public List<Customer> getCustomers(){
List<Customer> list=new ArrayList<Customer>();
try{


Customer c=new Customer();
c.setAcc_no(1);
c.setFirstname("jose");
c.setLastname("jose");
c.setEmail("jose");
c.setAmount(1.0f);
list.add(c);


}catch(Exception e){System.out.println(e);}
return list;
}//end of getCustomers()
}