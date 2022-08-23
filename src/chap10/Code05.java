package chap10;

public class Code05 {

	public static void main(String[] args) {
		
		String x = new String("Hello world");
		String y = new String("Hello world");
		
		/* String class가 일반 클래스와 다른 점 */
		System.out.println(x);				//문자열 클래스의 경우만 문자열 출력
		System.out.println(x.toString());	//이것 역시 마찬가지
		
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
