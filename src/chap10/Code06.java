package chap10;

public class Code06 {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("Hello");

		StringBuffer sb2 = new StringBuffer();
		sb2.append("World");	//����ִ� StringBuffer ��ü�� "World"���ڿ� ����.
		
		StringBuffer sb3 = new StringBuffer(20);
		sb3.append("Java Programming is created by James Gosling");
		
		//StringBuffer ���õ� ��°��� �������� �ƴ� ���ڿ� ���̴�.
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb3);

		System.out.println(sb1.capacity());	//�⺻ ����(16)�� �߰��� ���ڿ�(+5) ����
		System.out.println(sb2.capacity());	//�⺻ ����(16)
		System.out.println(sb3.capacity());	//�⺻ ����(16)�� Capacity(20)�� �־� �հ� 36������, �Է� ���ڿ��� ũ�Ⱑ 44�� �Ѿ���ȱ⿡ 44�� ��.

	}

}
