import java.util.*;
public class Main {
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
	Bank bank=new Bank("Bank of India");
	bank.addbranch("Patna");
	bank.addcustomer("Patna", "Ayush", 10000);
	bank.addcustomer("Patna", "Priyanshu", 10000);
	bank.listcustomers("Patna", true);
	}

}
