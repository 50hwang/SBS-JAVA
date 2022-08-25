package chap11;

public class Code03 {

	public static void main(String[] args) {
		
		try {
			System.out.println("Hello world");
			System.out.println("Inside Try");
		} catch(Exception e) {
			System.out.println("I am Catch");
		} finally {
			System.out.println("Finally Block");
		}

	}

}
