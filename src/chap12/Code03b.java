package chap12;

import java.io.FileInputStream;
import java.io.IOException;

public class Code03b {

	public static void main(String[] args) {

		FileInputStream fis = null;

		try {
			fis = new FileInputStream("data1.txt");
			int x;

			while ((x = fis.read()) != -1) {
				System.out.print((char) x);
			}

		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				fis.close();	//���� ó���� �ʿ���.
			} catch (IOException e) {	//public void close() throws IOException
				System.out.println(e);
			}
		}

	}

}
