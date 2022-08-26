package chap12;
import java.util.Scanner;

public class Code01 {

	public static void main(String[] args) {
		
		Scanner scin = new Scanner(System.in);
		
		System.out.print("Name : ");
		String name = scin.next();
		
		System.out.print("Phone Number : ");
		String phone = scin.next();

		System.out.print("Age : ");
		int age = scin.nextInt();
		
		System.out.print("Height : ");
		float height = scin.nextFloat();
		
		System.out.print("Gender : ");
		char gender = scin.next().charAt(0);	// String의 첫문자
		
		
		System.out.println("Name : " + name);
		System.out.println("Phone Number : " + phone);
		System.out.println("Age : " + age);
		System.out.println("Height : " + height);
		System.out.println("Gender : " + gender);
		

	}

}
