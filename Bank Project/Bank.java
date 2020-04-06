

import java.util.Scanner;
public class Bank {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sentinal = 0;
		int size = 0;
		double[] accountBalences = new double[250];
		String[] accountNames = new String[250];
		while(sentinal != -1){
			System.out.println("Bank Admin Menu");
			System.out.println("Please Enter a Menu Option");
			System.out.println("(1): Add Customer to Bank");
			System.out.println("(2): Change Customer Name");
			System.out.println("(3): Check Account Balence");
			System.out.println("(4): Modify Account Balence");
			System.out.println("(5): Summary of All Accounts");
			System.out.println("(-1): Quit");
			
			int userInput = input.nextInt();
			if(userInput == 1){
				System.out.println("Bank Add Customer Menu");
				System.out.println("Please Enter an account balence");
				double balence = input.nextDouble();
				accountBalences[size] = balence;
				System.out.println("Please enter an account holder name: ");
				input.nextLine();
				String name = input.nextLine();
				accountNames[size] = name;
				System.out.println("Customer's ID is :" + size);
				size = size + 1;
			}
			else if(userInput == 2){
				System.out.println("Bank Change Name Menu");
				System.out.println("Please Enter a customer ID to change their name");
				int index = input.nextInt();
				System.out.println("What is the customer's new name?");
				input.nextLine();
				accountNames[index] = input.nextLine();
			}
			else if(userInput == 3){
				System.out.println("Bank Check Balence Menu");
				System.out.println("Please Enter a customer ID to check their balence");
				int index = input.nextInt();
				double balence = accountBalences[index];
				System.out.println("This customer has $" + balence + " in their account");
			}
			else if(userInput == 4){
				System.out.println("Bank Modify Balence Menu");
				System.out.println("Please Enter a customer ID to check their balence");
				int index = input.nextInt();
				System.out.println("What is the customer's new account balence");
				accountBalences[index] = input.nextDouble();
			}
			else if(userInput == 5){
				System.out.println("Bank All Customer Summary Menu");
				double total = 0;
				for(int i = 0; i < size; i++){
					total = total + accountBalences[i];
					System.out.println(accountNames[i] + " has $" + accountBalences[i] + " in their account");
				}
				System.out.println("In total, there is $" + total + " in the bank");
			}
			else if(userInput == -1){
				System.exit(-1);
			}
			else{
				System.out.println("Error: Invalid input entered");
			}
		}
	}

}
