package chap12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Code04 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt");	//try ��Ʈ���� ������ ������ �Ѵ�.
			System.out.println((char)fis.read());
		} catch(FileNotFoundException e) {
			System.out.println("input.txt�� ���� �����Դϴ�.");
		} catch(IOException e) {
			System.out.println(e);
		} finally {
			try {
				fis.close();					//finally ��Ʈ���� ������ �ݾ��ֵ��� �Ѵ�.
			} catch(IOException e) {
				System.out.println(e);
			} catch(NullPointerException e) {	//���� ������ �־��� �� fis�� null�̱� ������ �߻��ϴ� ����
				System.out.println("fis�� null ���� ���� �ֽ��ϴ�.");
			}
		}
		

	}

}
