package chap13;

public class Code01 {

	public static void main(String[] args) {
		
		Data<Integer> d1 = new Data<Integer>(100);
		
		System.out.println(d1.getObj());
		d1.showType();
		
		Data<String> d2 = new Data<String>("Java");
		System.out.println(d2.getObj());
		d2.showType();

	}

}
