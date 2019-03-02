package interest;

import java.util.Scanner;

public class Account {
	double r1 = 0.09;

	double calculateInterest(double b) {
		double t1 = r1 * b;
		return t1;

	}
}

class SavingsAccount extends Account {
	double r2 = 0.07;

	double calculateInterest(double b2) {
		double t2 = r2 * b2;
		return t2;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account i = new Account();
		SavingsAccount s = new SavingsAccount();
		Scanner sc = new Scanner(System.in);
		double b = sc.nextDouble();
		System.out.println("enter choice 1 for FD Interst and 2 for savings Ac interst");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			System.out.println(i.calculateInterest(b));
			break;
		case 2:
			System.out.println(s.calculateInterest(b));
			break;
		default:
			System.out.println("enter again");

		}

	}

}
