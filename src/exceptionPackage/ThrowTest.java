package exceptionPackage;

public class ThrowTest {

	public static void main(String[] args) {
		
		try {
			
			Exception e = new Exception("고의 예외");	//"문자열 메시지"가 담긴 예외 클래스 생성 
			throw e;	//예외 발생
			
		} catch(Exception e) {
			
			System.out.println("예외 발생");
			System.out.println(e.getMessage());	//예외가 발생했을 때의 처리 수단으로써 getMessage() 호출
			
		}

	}

}
