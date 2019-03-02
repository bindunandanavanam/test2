package sammy;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u= new User();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter contact age and name");
		long contact=sc.nextLong();
		int age=sc.nextInt();
		String name=sc.next();
		if(age<55 && age>20){
		u.setAge(age);
		}
		else{
			 throw new ArithmeticException("not valid");  
		}
		u.setContact(contact);
		u.setName(name);
		System.out.println("name :"+u.getName());
		System.out.println("age: "+u.getAge());
		System.out.println("contact: "+u.getContact());

	}

}
