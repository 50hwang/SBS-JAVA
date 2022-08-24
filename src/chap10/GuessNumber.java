package chap10;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		
		/* ��ǻ���� ���� ���� ���� */

		int hiddenNumber = (int)((Math.random() * 100) + 1);	//Math.random()�� 0.0 �̻� 1.0 �̸��� ���� ��ȯ
		while(hiddenNumber == 0) {	//0�� ���� ��쿡 ����ؼ� ��õ�
			hiddenNumber = (int)((Math.random() * 100) + 1);
		} 
		
		/* ����� �Է� �õ� */

		Scanner scin = new Scanner(System.in);
		
		int usedChance = 0;
		int guessNumber;
		
		System.out.println("��ǻ�Ͱ� 1���� 100 ������ �ϳ��� ������ �����߽��ϴ�.");
		System.out.println("**** ��ǻ�Ͱ� ������ ���� ���� ������ ****");
		System.out.println("--------------------------------");

		/* ���� */
		
		while(true) {
			
			System.out.print("1�� 100 ������ ���� �Է��ϼ��� : ");
			guessNumber = scin.nextInt();
			++usedChance;
			
			if(guessNumber == hiddenNumber) {	//OK
				
				System.out.println("��ǻ�Ͱ� ������ ���� ������ϴ�.\n");	//���� �׽�Ʈ
				System.out.println("�õ� Ƚ���� " + usedChance + "���Դϴ�.");	//���� �׽�Ʈ
				break;
				
			} else if(guessNumber > hiddenNumber) {	//BIGGER
				
				System.out.println("�� ���� ���� �Է��ϼ���.\n");	//���� �׽�Ʈ
				continue;
				
			} else if(guessNumber < hiddenNumber) {	//SMALLER
				
				System.out.println("�� ū ���� �Է��ϼ���.\n");	//���� �׽�Ʈ
				continue;
				
			}
			
		}
		
		scin.close();
		
	}

}
