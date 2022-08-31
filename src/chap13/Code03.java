package chap13;

public class Code03 {

	public static void main(String[] args) {

		Data2<Integer> d = new Data2<Integer>(100);
		int result = d.calcMultiple(5);
		System.out.println(result);

		Data2<Double> e = new Data2<Double>(17.5);
		int result2 = e.calcMultiple(5);
		System.out.println(result2);
		/* 애시당초, Data2<T extends Number> 자체가 정수의 하위 클래스에 한정되어있으므로,
		 * 17.5를 입력받아도, 정수로 강제 type casting 된 17을 반환한다.*/
		
	}

}
