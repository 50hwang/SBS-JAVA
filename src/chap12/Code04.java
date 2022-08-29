package chap12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Code04 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt");	//try 파트에서 파일을 열도록 한다.
			System.out.println((char)fis.read());
		} catch(FileNotFoundException e) {
			System.out.println("input.txt는 없는 파일입니다.");
		} catch(IOException e) {
			System.out.println(e);
		} finally {
			try {
				fis.close();					//finally 파트에서 파일을 닫아주도록 한다.
			} catch(IOException e) {
				System.out.println(e);
			} catch(NullPointerException e) {	//없는 파일을 넣었을 때 fis가 null이기 때문에 발생하는 예외
				System.out.println("fis가 null 값을 갖고 있습니다.");
			}
		}
		

	}

}
