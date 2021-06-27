import java.util.Scanner;

public class BankAccount {
	
	int balance;
	int prevtrans;
	String customerName;
	String customerID;

	BankAccount(String cName, String cID){
		
		customerName = cName;
		customerID = cID;
		
	}
	public void deposit (int amount) {
		
		try {
			if (amount>0) {
				balance += amount;
				prevtrans = amount;
			}
		}
			catch (Exception e) {
			System.out.println("Please enter a valid number");
			}
		 
	}
	
	public void withdraw(int amount) {
		
		try {
			if ((amount > 0) && !(amount > balance)) {
				balance -= amount;
				prevtrans = -amount;
			}
		}
		catch (Exception e){
			System.out.println("Not sufficient funds/Enter a valid amount");
		}
		
		
	}
	
	public void getTransaction(){
		
		if (prevtrans>0) {
			System.out.println("Deposited: "+ prevtrans);
		}
		else if (prevtrans<0) {
			System.out.println("Withdrawn: "+ Math.abs(prevtrans));
		}
		else
			System.out.println("No transaction occured");
	}
	
	public void showMenu() {
		
		char option = '\0';
		
		Scanner scan = new Scanner(System.in);
		int amount,withdraw;
		
		System.out.println("Welcome " + customerName);
		System.out.println("Your Bank ID is " + customerID);
		System.out.println("\n");
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous Transaction");
		System.out.println("E. Exit");
		
		do {
		System.out.println("=====================================================================================");
		System.out.println("Enter an option");
		System.out.println("=====================================================================================");
		option = scan.next().charAt(0);
		Character.toLowerCase(option);
		System.out.println("\n");
		
		switch(option) {
		
		case 'a':
			System.out.println("----------------------------------------");
			System.out.println("Your total balance is $"+balance);
			System.out.println("----------------------------------------");
			System.out.println("\n");
			break;
			
		case 'b':
			System.out.println("----------------------------------------");
			System.out.println("Enter amount to deposit: ");
			amount = scan.nextInt();
			System.out.println("----------------------------------------");
			deposit(amount);
			System.out.println("$"+amount+" Has been deposited");
			System.out.println("\n");
			break;
		case 'c':
			System.out.println("----------------------------------------");
			System.out.println("how much would you like to withdraw?");
			System.out.println("----------------------------------------");
			withdraw = scan.nextInt();
			withdraw(withdraw);
			System.out.println("\n");
			break;
			
					
		case 'd':
			System.out.println("----------------------------------------");
			getTransaction();
			System.out.println("----------------------------------------");
			System.out.println("\n");
			break;
			
		case 'e':
			System.out.println("***********exiting************");
			break;
			
		default:
			System.out.println("Please enter a valid option!");
			break;
			
		}
			
		}while (Character.toLowerCase(option) != 'e');
		
		System.out.print("Thanks for banking with us today");
		
		
		
		
	}

}
