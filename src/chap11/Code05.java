package chap11;

public class Code05 {

	public static void main(String[] args) {
		
		int A[] = new int[5];
		
		try {
			A[7] = 100;
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception Message : " + e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("\n\n> out.");
		}
		
	}

}
