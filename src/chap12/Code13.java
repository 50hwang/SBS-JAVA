package chap12;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Code13 {

	public static void main(String[] args) {
		
		BufferedInputStream bis = null;
		
		try {
			
			bis = new BufferedInputStream(new FileInputStream("data6.txt"));
			int x = 0;
			
			while((x = bis.read()) != -1) {
				System.out.println((char) x);
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bis.close();
			} catch(IOException e) {
				System.out.println(e);
			}
		}

	}

}
