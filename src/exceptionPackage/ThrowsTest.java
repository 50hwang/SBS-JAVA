package exceptionPackage;

public class ThrowsTest {

	public static void methodA() throws Exception {
		methodB();
	}

	public static void methodB() throws Exception {
		methodC();
	}
	
	public static void methodC() throws Exception {
		Exception e = new Exception();
		throw e;
	}
	
	public static void main(String[] args) {
		
		try {
			methodA();	//�޼ҵ�A ����	-> �̷� �߻��� ���ܴ� �ڽ��� ���Ȱ�, �ڽ��� �����Ų main���� ���ѱ�
		} catch(Exception e) {
			System.out.println("���ο��� ó��");
		}

	}

}
