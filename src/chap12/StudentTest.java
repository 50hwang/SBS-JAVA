package chap12;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		
		/*사용자 입력*/
		Scanner sc = new Scanner(System.in);
		System.out.print("파일명(확장자 포함)을 입력하시오 > ");
		String fileName = sc.next();
		
		/*파일 입력*/
		Student ST[] = new Student[10];
		File file = new File(fileName);
		Scanner scin = null;

		int i = 0;

		try {
			scin = new Scanner(file);
			while(scin.hasNext()) {	//다음에 읽어올 토큰이 있는지 판단 -> 있으면 true, 없으면 false
				int studentID = scin.nextInt();
				String studentName = scin.next();
				int score = scin.nextInt();
				
				ST[i++] = new Student(studentID, studentName, score);
			}
		} catch(IOException e) {
			System.out.println(fileName + " not exist!!");
		}
		
		/*결과 출력*/
		System.out.println("== Student List ==");
		System.out.println("------------------");
		for (Student s : ST) {
			System.out.println(s);
		}
		
		scin.close();
		sc.close();

	}

}
