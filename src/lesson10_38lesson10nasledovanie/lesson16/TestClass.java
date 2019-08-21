package lesson10_38lesson10nasledovanie.lesson16;

public class TestClass {
	private int i = 5;//доступ только в этом классе 
	protected int j = 6;//доступ в пакете 
	int k = 8;//доступ в пакете 
	public int m = 9;//тоже везде 
	void method() {
		TestClass tc = new TestClass();
		System.out.println(tc.i);
	}
}
class TestModifiers{
	void method() {
		TestClass tc = new TestClass();
		System.out.println(tc.k);//i = private нет доступа в другом классе
	}
}
