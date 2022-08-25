package chap11;

public class Code04 {

	public static void main(String[] args) {
		
		int a= 5, b = 0, c;
		int A[] = new int[3];
		try {
			c = a / b;
			A[3] = 100;
		} catch(ArithmeticException e) {	//특정 케이스에 대한 예외 처리
			System.out.println("0으로 나눌 수 없습니다.");
		} catch(Exception e) {	//최종 마지막 예외 처리 -> 얘를 위로 올릴 수 없다.
			System.out.println("없는 인덱스입니다.");
		} finally {
			System.out.println("finally 구문");
		}

	}

}
