package chap12;
import java.io.*;

public class Code06 {

	public static void main(String[] args) {

		File file = new File("data2.txt");
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(file);
			int x;
			while((x = fis.read()) != 1) {
				System.out.print((char)x);
			}
		} catch(IOException e) {
			System.out.println(e);
		} finally {
			try {
				fis.close();					//finally ��Ʈ���� ������ �ݾ��ֵ��� �Ѵ�.
			} catch(IOException e) {
				System.out.println(e);
			}
		}
		
	}

}
