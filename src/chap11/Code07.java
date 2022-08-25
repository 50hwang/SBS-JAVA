package chap11;

class MyException extends Exception {	//Exception Ŭ������ ��ӹ޴� Ŭ����
	
	/* fields */
	int x;
	
	/* constructors */
	MyException(int x) {
		this.x = x;
	}
	
	/* methods */
	public String toString() {
		return "I am " + x + " in MyException Class";
	}
	
}

public class Code07 {
	
	public static void main(String[] args) {
		
		MyException me = new MyException(10);	//me�� ���� ��ü ���� ����
		try {
			System.out.println("Before throw MyException");
			throw me;
		} catch(MyException e) {
			System.out.println(e);
		}
		System.out.println("Main ends");

	}

}
