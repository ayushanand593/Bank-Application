import java.util.*;
public class Bank {
	private String name;
	private ArrayList<Branch> branches;
	public Bank(String name) {
		this.name = name;
		this.branches=new ArrayList<Branch>();
	}
	public boolean addbranch(String name) {
		if(findbranch(name)==null) {
			this.branches.add(new Branch(name));//Calling branch constructor
			return true;
		}
		return false;
	}
	public boolean addcustomer(String branchname,String customername,double initialamount) {
		Branch branches=findbranch(branchname);
		if(branches!=null) {
			return branches.addcustomer(customername, initialamount);
		}
		return false;
	}
	public boolean addtransaction(String branchname,String customername,double amount) {
		Branch branch=findbranch(branchname);
		if(branch!=null) {
			return branch.addtransaction(customername, amount);
		}
		return false;
	}
	private Branch findbranch(String name) {
		for(int i=0;i<this.branches.size();i++) {
			Branch existingbranch=this.branches.get(i);
			if(existingbranch.getName().equals(name)) {
				return existingbranch;
			}
		}
		return null;
	}
	public boolean listcustomers(String branchname,boolean transaction) {
		Branch branch=findbranch(branchname);
		if(branch!=null) {
			System.out.println("Customer details at "+branch.getName());
			ArrayList<Customer> branchcustomer=branch.getCustomers();
			for(int i=0;i<branchcustomer.size();i++) {
				Customer branchcustomers=branchcustomer.get(i);//Array list variable on RHS.
				System.out.println("Customer: "+branchcustomers.getName()+"["+(i+1)+"]");
				if(transaction) {
					System.out.println("Transactions");
					ArrayList<Double> transactions=branchcustomers.getTransactions();
					for(int j=0;j<transactions.size();j++) {
						System.out.println("["+(j+1)+"] amount "+transactions.get(j));
					}
				}
			}
			return true;
		}else {
			return false;
		}
	}
	
}
