package chap10;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		
		/* 컴퓨터의 랜덤 숫자 생성 */

		int hiddenNumber = (int)((Math.random() * 100) + 1);	//Math.random()은 0.0 이상 1.0 미만의 난수 반환
		while(hiddenNumber == 0) {	//0이 나올 경우에 대비해서 재시도
			hiddenNumber = (int)((Math.random() * 100) + 1);
		} 
		
		/* 사용자 입력 시도 */

		Scanner scin = new Scanner(System.in);
		
		int usedChance = 0;
		int guessNumber;
		
		System.out.println("컴퓨터가 1부터 100 사이의 하나의 정수를 선택했습니다.");
		System.out.println("**** 컴퓨터가 선택한 수를 맞춰 보세요 ****");
		System.out.println("--------------------------------");

		/* 판정 */
		
		while(true) {
			
			System.out.print("1과 100 사이의 값을 입력하세요 : ");
			guessNumber = scin.nextInt();
			++usedChance;
			
			if(guessNumber == hiddenNumber) {	//OK
				
				System.out.println("컴퓨터가 선택한 수를 맞췄습니다.\n");	//동작 테스트
				System.out.println("시도 횟수는 " + usedChance + "번입니다.");	//동작 테스트
				break;
				
			} else if(guessNumber > hiddenNumber) {	//BIGGER
				
				System.out.println("더 작은 수를 입력하세요.\n");	//동작 테스트
				continue;
				
			} else if(guessNumber < hiddenNumber) {	//SMALLER
				
				System.out.println("더 큰 수를 입력하세요.\n");	//동작 테스트
				continue;
				
			}
			
		}
		
		scin.close();
		
	}

}
