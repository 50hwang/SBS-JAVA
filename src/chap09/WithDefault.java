package chap09;

public interface WithDefault {

	/* fields */
	int COUNT = 100;


	/* constructors */


	/* methods */
	void test();

	default void show() {
		System.out.println("I am show");
	}
}
