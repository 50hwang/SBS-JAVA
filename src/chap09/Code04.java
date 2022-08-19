package chap09;

import java.util.*;

public class Code04 {

	public static void main(String[] args) {

		Scanner scin = new Scanner(System.in);

		System.out.print("Enter number between 0 and 100 : > ");
		int num = scin.nextInt();

		if (num < Limit.MIN || num > Limit.MAX) {
			System.out.println("Out of range.");
		} else {
			System.out.println("num : " + num);
		}

	}

}
