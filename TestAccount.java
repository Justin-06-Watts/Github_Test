public class TestAccount {
	public static void main(String[] args) {
		Account acct1,acct2; // Declare a variable named acct1
		acct1 = new Account("Justin",29000); // Instantiation 
		acct2 = new Account("Michelle",290000);
		acct1.deposit(500);
		acct2.withdraw(5000);
		acct1.withdraw(30000);
		acct2.deposit(50000);
		acct1.getBalance();
		acct2.getBalance();
	}
}



