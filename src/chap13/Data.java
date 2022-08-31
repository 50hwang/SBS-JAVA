package chap13;

public class Data<T> {	//Ŭ������ ���� ���׸� ��ȣ <>�� ����, �� �ȿ� �Ű����� ���
	
	T obj;	//�ν��Ͻ� ���� obj�� �ڷ����� T
	
	Data(T ob) {	//������ Data�� �ڷ����� T�� �μ� 1���� �Է¹���.
		obj = ob;
	}
	
	T getObj() {	//�ν��Ͻ� ���� obj�� �ڷ����� T
		return obj;
	}
	
	void showType() {
		System.out.println("Type of T : " + obj.getClass().getName());
	}
	
}
