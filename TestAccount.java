import java.util.Scanner;

public class TestAccount {
	public static void main(String[] args) {
		/*Account acct1,acct2; // Declare a variable named acct1'
		
		acct1 = new Account("Justin",29000); // Instantiation 
		acct2 = new Account("Michelle",290000);
		acct1.deposit(500);
		acct2.withdraw(5000);
		acct1.withdraw(30000);
		acct2.deposit(50000);
		acct1.getBalance();
		acct2.getBalance();*/
		int ch = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Hi there,Im gonna create your account what's your name?");
		String name = scan.nextLine();
		System.out.println("Great, now how much money are you starting with?");
		int balance = scan.nextInt();
		Account acct1 = new Account(name,balance);
		
		while(ch!=4){
			System.out.println("Please select the option you wish to apply.");
			System.out.println("1. Withdraw\n2.Deposit\n3. See Balance\n4. Exit");
			ch = scan.nextInt();
			switch(ch){
				case 1: 
					System.out.println("Please enter the amount you wish to withdraw.");
					acct1.withdraw(scan.nextInt());
					break;
				case 2: 
					System.out.println("Please enter the amount you wish to deposit.");
					acct1.deposit(scan.nextInt());
					break;
				case 3:
					acct1.getBalance();
					break;
				case 4:
					break;
				default:
					System.out.println("Ensure you enter a valid option.");
			}
			
			
		}
		
	}
}



