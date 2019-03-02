package test2;

import java.util.Scanner;

public class David {
	static double Calc(double bsal){
		double HRA=(0.5)*bsal;
		double spcl=(0.75)*bsal;
		double PF=(0.12)*bsal;
		
		double total=HRA+PF+spcl;
		System.out.println(total);
		return total;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the basic sal");
		double bsal=sc.nextDouble();
		double totalsal=Calc(bsal);
		System.out.println("total net sal is "+ totalsal);
	}

}
