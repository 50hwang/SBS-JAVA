package chap12;

import java.io.FileOutputStream;
import java.io.IOException;

public class Code10 {

	public static void main(String[] args) {

		String content = "Hello Java Programming";
		byte[] bytes = content.getBytes();

		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream("data4.txt");	//없는 파일이면 자동 생성 -> Eclipse에서 자동으로 보여주지는 않는다.
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
