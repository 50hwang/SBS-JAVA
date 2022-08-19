package chap09;

public interface WithPrivate {
	
	default int getData() {
		print();
		return get() + 100;
	}
	
	private void print() {
		System.out.println(get());
	}
	
	private int get() {
		return 100;
	}
}
