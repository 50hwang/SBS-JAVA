package chap10;

public class Code06 {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("Hello");

		StringBuffer sb2 = new StringBuffer();
		sb2.append("World");	//비어있는 StringBuffer 객체에 "World"문자열 붙임.
		
		StringBuffer sb3 = new StringBuffer(20);
		sb3.append("Java Programming is created by James Gosling");
		
		//StringBuffer 역시도 출력값은 참조값이 아닌 문자열 값이다.
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb3);

		System.out.println(sb1.capacity());	//기본 상태(16)에 추가로 문자열(+5) 생성
		System.out.println(sb2.capacity());	//기본 상태(16)
		System.out.println(sb3.capacity());	//기본 상태(16)에 Capacity(20)을 주어 합계 36이지만, 입력 문자열의 크기가 44로 넘어버렸기에 44가 됨.

	}

}
