package lesson10_38lesson10nasledovanie.lesson17;

public class A {
	B b = new B();// ��������� ����������
	final static int f = 0;
	volatile int d;// ������� ������� ������������ �� ������������ ������
	// � �� ������ ���������� � ���������� ������ �� ������

	transient int g;// �������� ��� ����������� ������������ ����
	final int q = 0; // ������ ��������� � ����������
	// native ������������ ��� ��� ������� ������� ���� �������� �� ������ ������
	// � ���� ����������� ������� ����������� ���������� ���� ���������� � ��
	// strictfp - �������� � ������������ ������. ������� ������
	// synchonixed - ������ ��� � ����� ���������� � ����� ������
	// final - � ������� ������� ��� ���� ����� ������� �� ������ ���� �������������

	// enum ����� ���� � ������ ����� ���� ��� ������ , �� �� ����� ��� �� ������
	enum Cofe {
		SMALL(100), MID(200), BIG(400) {
			String getCofeClass() {
				return "B";
			}
		};
		int mil;
		String cofeClass = "A";

		Cofe(int mil) {
			this.mil = mil;
		}

		int getMil() {
			return mil;
		}
		String getCofeClass() {
			return cofeClass;
		}
	}

	public static void main(String[] args) {
		Cofe cofe = Cofe.BIG;
		System.out.println(cofe);
		System.out.println(cofe.mil);
		System.out.println(cofe.getCofeClass());
	}

}
