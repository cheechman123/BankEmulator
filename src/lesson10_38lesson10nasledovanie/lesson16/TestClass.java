package lesson10_38lesson10nasledovanie.lesson16;

public class TestClass {
	private int i = 5;//������ ������ � ���� ������ 
	protected int j = 6;//������ � ������ 
	int k = 8;//������ � ������ 
	public int m = 9;//���� ����� 
	void method() {
		TestClass tc = new TestClass();
		System.out.println(tc.i);
	}
}
class TestModifiers{
	void method() {
		TestClass tc = new TestClass();
		System.out.println(tc.k);//i = private ��� ������� � ������ ������
	}
}
