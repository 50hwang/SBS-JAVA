package chap12;

import java.io.FileReader;
import java.io.IOException;

public class Code07 {

	public static void main(String[] args) {

		FileReader fis = null;

		try {
			fis = new FileReader("data3.txt");

			int x;
			while ((x = fis.read()) != -1) {
				System.out.print((char) x);
			}
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				fis.close(); // finally 파트에서 파일을 닫아주도록 한다.
			} catch (IOException e) {
				System.out.println(e);
			}
		}

	}

}
