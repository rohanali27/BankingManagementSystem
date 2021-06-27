import java.util.Scanner;

public class BankingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		String cName, cID;
		System.out.print("Hello Please enter you Name");
		cName = scan.nextLine();
		
		System.out.println("Please enter your Bank ID");
		cID = scan.nextLine();
		
		
		
		BankAccount bank = new BankAccount(cName, cID);
		bank.showMenu();
		
	}
	
	

}
