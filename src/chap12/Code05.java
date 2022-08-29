package chap12;

import java.io.*;	//java.io ���� ���̺귯���� �������� ����ϱ� ������ �׳� �����׸���.

public class Code05 {

	public static void main(String[] args) {

		int i;
		
		try (FileInputStream fin = new FileInputStream("data.txt");) {
			do {
				i = fin.read();
				if (i != -1) {
					System.out.println((char)i);
				} 
			} while(i != -1);
		} catch(IOException e) {
			System.out.println("Error reading file.");
		}
		
	}

}
