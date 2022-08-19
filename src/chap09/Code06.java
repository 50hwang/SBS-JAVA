package chap09;

interface Things {

	/* fields */


	/* constructors */


	/* methods */
	void printInfo();

}


interface Book1 extends Things {

	/* fields */


	/* constructors */


	/* methods */
	void showTitle();

}


class ChildrenBook implements Book1 {

	/* fields */
	private String title;
	private String author;

	/* constructors */
	ChildrenBook() {}
	ChildrenBook(String title, String author) {
		this.title = title;
		this.author = author;
	}

	/* methods */
	public void printInfo() {	//반드시 오버라이딩해야 함
		System.out.println("** Information for books **");
	}
	
	public void showTitle() {	//반드시 오버라이딩해야 함
		System.out.println("Title : " + this.title);
		System.out.println("Author : " + this.author);
	}
	
}


public class Code06 {

	public static void main(String[] args) {

		ChildrenBook b = new ChildrenBook("Little Mermaid", "Andersen");
		b.printInfo();
		b.showTitle();
	}

}
