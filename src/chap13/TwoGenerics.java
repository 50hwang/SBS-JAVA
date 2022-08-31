package chap13;

class TwoGenerics<T, V> {

	T data1;
	V data2;
	
	TwoGenerics(T d1, V d2) {
		data1 = d1;
		data2 = d2;
	}
	
	void showGenericType() {
		System.out.println("Type of T : " + data1.getClass().getName());
		System.out.println("Type of V : " + data2.getClass().getName());
	}
	
	T getData1() {
		return data1;
	}
	
	V getData2() {
		return data2;
	}
	
}
