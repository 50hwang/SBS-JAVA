package exceptionPackage;

class AgeException extends Exception {
	
	/* fields */
	
	/* constructors */
	public AgeException() {}
	public AgeException(String message) {
		super(message);
	}
	
}

public class AgeExceptionTest {

	public static void ticketing(int age) throws AgeException {
		if(age < 0) {
			throw new AgeException("���� �Է��� �߸��Ǿ����ϴ�.");
		}
	}
	
	public static void main(String[] args) {
		
		int age = -19;
		try {
			ticketing(age);
		} catch(AgeException e) {
			e.printStackTrace();
		}

	}

}
