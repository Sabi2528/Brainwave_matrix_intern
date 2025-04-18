
package atmproject;
import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int balance = 10000;
		int deposit, withdraw;

		while (true) {
		    System.out.println("\n=== ATM Menu ===");
		    System.out.println("1. Check Balance");
		    System.out.println("2. Deposit Money");
		    System.out.println("3. Withdraw Money");
		    System.out.println("4. Exit");
		    System.out.print("Choose an option: ");

		    int choice = sc.nextInt();

		    switch (choice) {
		        case 1:
		            System.out.println("Your current balance is: ₹" + balance);
		            break;

		        case 2:
		            System.out.print("Enter amount to deposit: ₹");
		            deposit = sc.nextInt();
		            balance += deposit;
		            System.out.println("₹" + deposit + " deposited successfully.");
		            break;

		        case 3:
		            System.out.print("Enter amount to withdraw: ₹");
		            withdraw = sc.nextInt();
		            if (withdraw <= balance) {
		                balance -= withdraw;
		                System.out.println("₹" + withdraw + " withdrawn successfully.");
		            } else {
		                System.out.println("Insufficient balance!");
		            }
		            break;

		        case 4:
		            System.out.println("Thank you for using our ATM. Goodbye!");
		            sc.close();
		            System.exit(0);

		        default:
		            System.out.println("Invalid option! Please try again.");
		    }
		}


	}

}
