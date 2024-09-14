
public class Account{
	int balance;
	String name;
	static int num_of_acc = 0;
	public Account(String name, int balance) {
		this.balance =balance;
		this.name = name;
		Account.num_of_acc++;
	}
	
	public void withdraw(int amount) {
		if(this.balance>amount) {
			this.balance -=amount;
		}else {
			System.out.println("Insufficient funds. Could not withdraw");
		}
	}
	
	public void deposit(int amount) {
		if(amount<=30000){
			this.balance +=amount;
			System.out.printf("Amount successfully Deposited\n");
		}else {
			System.out.println("Deposit amount exceeds limit of $30,000");
		}
	}
	 
	public void getBalance() {
		System.out.printf("%s's Current balance is $",this.name);
		System.out.println(this.balance);
	}
	
}
/* class declaration
 * attributes
 * constructor
 * Static Variables: Known as class variables and are shared among all instances of a class.
 * static Mehtods belong to the class rather than any specific object and can be called without
 * creating an instance of the class. They can only access other static members.*/
