package exceptionPackage;

public class ThrowTest {

	public static void main(String[] args) {
		
		try {
			
			Exception e = new Exception("���� ����");	//"���ڿ� �޽���"�� ��� ���� Ŭ���� ���� 
			throw e;	//���� �߻�
			
		} catch(Exception e) {
			
			System.out.println("���� �߻�");
			System.out.println(e.getMessage());	//���ܰ� �߻����� ���� ó�� �������ν� getMessage() ȣ��
			
		}

	}

}
