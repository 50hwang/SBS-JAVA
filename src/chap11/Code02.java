package chap11;

public class Code02 {

	public static void main(String[] args) {

		int a = 5, b = 0, c;
		try {
			c = a / b; // ArithmeticException 즉, 계산상의 예외 발생
			System.out.println(c);
		} catch (ArithmeticException e) { // ArithmeticException 예외 발생 시 수행할 코드
			System.out.println("0으로 나눌 수 없습니다.");
		}

		int n[] = { 1, 3, 5, 6, 10 };
		int i = 0;
		try {
			for (i = 0; i <= 5; i++) { // OutofBoundsException 즉, 범위 초과의 예외 발생
				System.out.println("n[" + i + "] = " + n[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) { // OutofBoundsException 예외 발생 시 수행할 코드
			System.out.println(i + "는 없는 인덱스입니다.");
		}
	}

}
