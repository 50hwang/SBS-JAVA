package chap12;

import java.io.*;	//java.io 내의 라이브러리를 여러가지 사용하기 때문에 그냥 뭉땡그리기.

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
