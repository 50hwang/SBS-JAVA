package chap10;

public class Code05 {

	public static void main(String[] args) {
		
		String x = new String("Hello world");
		String y = new String("Hello world");
		
		if ( x == y ) {
			System.out.println("x == y");
		} else {
			System.out.println("x != y");
		}
		
		if (x.equals(y)) {
			System.out.println("x equals y");
		} else {
			System.out.println("x not equals y");
		}
		
	}

}
