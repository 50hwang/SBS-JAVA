package chap12;

import java.io.IOException;

public class Code02 {

	public static void main(String[] args) {
		
		System.out.print("Enter one character : ");
		
		try {
			int x = System.in.read();
			System.out.println("You entered " + x);
			System.out.println("You entered " + ((char)x));
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
