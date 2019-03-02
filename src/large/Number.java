package large;

import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		System.out.println("Enter number u dont want ");
		int targetNum = sc.nextInt();
		int t1 = 0;
		int t2 = 0;
		do {
			int count = 0;
			n--;
			t2 = n;
			do {
				t1 = t2 % 10;

				t2 = (t2 - t1) / 10;

				if (t1 == targetNum) {
					count--;
				}
			} while (t2 != 0);
			if (count == 0) {
				System.out.println(n);
				break;
			}
		} while (n != 0);
	}
}