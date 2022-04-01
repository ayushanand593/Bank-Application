import java.util.*;
public class Customer {
	private String name;
	private ArrayList<Double> transactions;
	public Customer(String name,double initalamount) {
		this.name = name;
		this.transactions=new ArrayList<Double>();
		addtransaction(initalamount);//To add the initial amount into the arraylist.
	}
	public String getName() {
		return name;
	}
	public ArrayList<Double> getTransactions() {
		return transactions;
	}
	public void addtransaction(double amount) {
		this.transactions.add(amount);// Autoboxing is happening here.Primitve type into object.
	}
}
