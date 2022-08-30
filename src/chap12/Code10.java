package chap12;

import java.io.FileOutputStream;
import java.io.IOException;

public class Code10 {

	public static void main(String[] args) {

		String content = "Hello Java Programming";
		byte[] bytes = content.getBytes();

		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream("data4.txt");	//���� �����̸� �ڵ� ���� -> Eclipse���� �ڵ����� ���������� �ʴ´�.
			fos.write(bytes);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}

	}

}
