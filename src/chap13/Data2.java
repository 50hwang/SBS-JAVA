package chap13;

class Data2<T extends Number> {

	T obj;
	
	Data2(T ob) {
		obj = ob;
	}
	
	int calcMultiple(int n) {
		return obj.intValue() * n;
	}
	
}
