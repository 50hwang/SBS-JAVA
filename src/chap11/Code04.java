package chap11;

public class Code04 {

	public static void main(String[] args) {
		
		int a= 5, b = 0, c;
		int A[] = new int[3];
		try {
			c = a / b;
			A[3] = 100;
		} catch(ArithmeticException e) {	//Ư�� ���̽��� ���� ���� ó��
			System.out.println("0���� ���� �� �����ϴ�.");
		} catch(Exception e) {	//���� ������ ���� ó�� -> �긦 ���� �ø� �� ����.
			System.out.println("���� �ε����Դϴ�.");
		} finally {
			System.out.println("finally ����");
		}

	}

}
