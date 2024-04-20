package task2;

import java.util.Scanner;

public class Account {
	double balance;
	double amount;

	public Account() {
		super();
	}

	public Account(double balance, double amount) {
		super();
		this.balance = balance;
		this.amount = amount;
	}
	
	public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited" + amount + " successfully.");
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn" + amount + " successfully.");
        }
    }

    public void showBalance() {
        System.out.println("Current Balance:" + balance);
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
        Account account = new Account();

        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Show Balance");
        System.out.println("4. Exit");

        int choice;
        do {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.showBalance();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
	} while (choice != 4);
}
}


