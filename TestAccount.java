public class TestAccount {
	public static void main(String[] args) {
		Account acct1; // Declare a variable named acct1
		acct1 = new Account(); // Instantiation 
		acct1.deposit(500);
		int balance = acct1.getBalance(); 
		System.out.println(balance);
	}
}

