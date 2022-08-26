package chap12;
import java.io.FileInputStream;
import java.io.IOException;


public class Code03 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("data1.txt");

			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			
		} catch(IOException e) {
			System.out.println(e);
		} finally {
			try{
				fis.close();	//예외 처리가 필요함.
			} catch(IOException e) {	//public void close() throws IOException
				System.out.println(e);
			}
		}
		System.out.println("main end");
		
	}

}
