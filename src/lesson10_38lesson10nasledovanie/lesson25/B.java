package lesson10_38lesson10nasledovanie.lesson25;

public class B {
	static B b = new B();
	static int n = 4 ; //4 ��� ��������� � ������������� � ������� ����
	static int i = returnIntStatic();
	static int k = 3; // 5 ��� 0 ��� ���� �� ����� �� ��� ��� ������� 
	int j = returnInt();
	static {
		System.out.println("Static");//7 ��� ��� ��������� � �������� ������ ������ ����� 
	}
	{
		System.out.println("clean");//2 ��� ������ ���� �� ������ �����
									//��� ��� ��� � ����� ���������� ����������� 
									//� �� ������ 
	}
	B(){
		System.out.println("constructor");//3 ��� ��� ����������� ����������
										  // � ����� ��� ����������� 
	}
	static int returnIntStatic() {// 6 ��� �������� ���� ������ �����
		System.out.println(n);
		System.out.println(k);
		System.out.println("return static int ");
		return 1;
	}
	int returnInt() {//���������� ������ ��� ������� ������ ���� ����������� � �� �������� ��� �� ������ ���� 
		System.out.println("return int");//���������� ��� ��� ��� � ����� ����� ���� ������������ 
		return 2;
	}
	public static void main(String[] args) {
		new B();
	}
}
