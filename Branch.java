import java.util.*;
public class Branch {
	private String name;
	private ArrayList<Customer> customers;
	public Branch(String name) {
		this.name = name;
		this.customers=new ArrayList<Customer>();
	}
	public String getName() {
		return name;
	}
	
	public ArrayList<Customer> getCustomers() {
		return customers;
	}
	public boolean addcustomer(String customername,double initialamount) {
		if(findcustomer(customername)==null) {
			this.customers.add(new Customer(customername, initialamount));
			return true;
		}
		return false;
	}
	public boolean addtransaction(String name,double amount) {
		Customer existingcustomer=findcustomer(name);
		if(existingcustomer!=null) {
			existingcustomer.addtransaction(amount); //Calling the method from the customer class
			return true;
		}
		return false;
	}
	private Customer findcustomer(String name) {
		for(int i=0;i<this.customers.size();i++) {
			Customer existingcustomer=this.customers.get(i);
			if(existingcustomer.getName().equals(name)) {
				return existingcustomer;
			}
		}
		return null;
	}
	
}
