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
			methodA();	//메소드A 실행	-> 이루 발생한 예외는 자신이 떠안고, 자신을 실행시킨 main으로 떠넘김
		} catch(Exception e) {
			System.out.println("메인에서 처리");
		}

	}

}
