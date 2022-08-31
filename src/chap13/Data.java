package chap13;

public class Data<T> {	//클래스명 옆에 제네릭 기호 <>를 적고, 그 안에 매개변수 기술
	
	T obj;	//인스턴스 변수 obj의 자료형은 T
	
	Data(T ob) {	//생성자 Data는 자료형이 T인 인수 1개를 입력받음.
		obj = ob;
	}
	
	T getObj() {	//인스턴스 변수 obj의 자료형은 T
		return obj;
	}
	
	void showType() {
		System.out.println("Type of T : " + obj.getClass().getName());
	}
	
}
