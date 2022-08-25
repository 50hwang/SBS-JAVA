package chap11;

public class Code02 {

	public static void main(String[] args) {

		int a = 5, b = 0, c;
		try {
			c = a / b; // ArithmeticException ��, ������ ���� �߻�
			System.out.println(c);
		} catch (ArithmeticException e) { // ArithmeticException ���� �߻� �� ������ �ڵ�
			System.out.println("0���� ���� �� �����ϴ�.");
		}

		int n[] = { 1, 3, 5, 6, 10 };
		int i = 0;
		try {
			for (i = 0; i <= 5; i++) { // OutofBoundsException ��, ���� �ʰ��� ���� �߻�
				System.out.println("n[" + i + "] = " + n[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) { // OutofBoundsException ���� �߻� �� ������ �ڵ�
			System.out.println(i + "�� ���� �ε����Դϴ�.");
		}
	}

}
