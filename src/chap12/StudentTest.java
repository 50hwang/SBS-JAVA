package chap12;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		
		/*����� �Է�*/
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϸ�(Ȯ���� ����)�� �Է��Ͻÿ� > ");
		String fileName = sc.next();
		
		/*���� �Է�*/
		Student ST[] = new Student[10];
		File file = new File(fileName);
		Scanner scin = null;

		int i = 0;

		try {
			scin = new Scanner(file);
			while(scin.hasNext()) {	//������ �о�� ��ū�� �ִ��� �Ǵ� -> ������ true, ������ false
				int studentID = scin.nextInt();
				String studentName = scin.next();
				int score = scin.nextInt();
				
				ST[i++] = new Student(studentID, studentName, score);
			}
		} catch(IOException e) {
			System.out.println(fileName + " not exist!!");
		}
		
		/*��� ���*/
		System.out.println("== Student List ==");
		System.out.println("------------------");
		for (Student s : ST) {
			System.out.println(s);
		}
		
		scin.close();
		sc.close();

	}

}
