package chap13;

public class Code03 {

	public static void main(String[] args) {

		Data2<Integer> d = new Data2<Integer>(100);
		int result = d.calcMultiple(5);
		System.out.println(result);

		Data2<Double> e = new Data2<Double>(17.5);
		int result2 = e.calcMultiple(5);
		System.out.println(result2);
		/* �ֽô���, Data2<T extends Number> ��ü�� ������ ���� Ŭ������ �����Ǿ������Ƿ�,
		 * 17.5�� �Է¹޾Ƶ�, ������ ���� type casting �� 17�� ��ȯ�Ѵ�.*/
		
	}

}
