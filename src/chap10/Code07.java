package chap10;

public class Code07 {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("Good Morning");
		sb1.append('!');
		sb1.append(" Alice!");
		System.out.println(sb1);
		
		StringBuffer sb2 = new StringBuffer("water");
		StringBuffer sb3 = new StringBuffer("wafer");
		
		System.out.println("sb2.charAt(2) : " + sb2.charAt(2));
		System.out.println("sb2.compareTo(sb3) : " + sb2.compareTo(sb3));	//자바 8에선 안 된다. 11에서부터 된다.
		
		StringBuffer sb4 = new StringBuffer("Java Programming Language");
		sb4.delete(5, 8);// 인덱스 5에서 인덱스 7까지 삭제
		System.out.println("sb4.delete(5, 8) : " + sb4);
		
		StringBuffer sb5 = new StringBuffer("Hello World");
		sb5.insert(5, ',');
		System.out.println("sb5 : " + sb5);
		System.out.println("sb5.substring(7) : " + sb5.substring(7));
		System.out.println("sb5 : " + sb5);
		System.out.println("sb5.capacity(7) : " + sb5.capacity());

		sb5.trimToSize();
		System.out.println("after trin : " + sb5.capacity());
		
	}

}
