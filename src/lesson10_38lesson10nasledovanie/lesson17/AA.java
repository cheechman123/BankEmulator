package lesson17переменные;

public class AA {
	public static final int add(int a, int b) {
		return a + b;
	}

	protected static final double add(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		AA a = new AA();
		BB b = new BB();
		System.out.println(a.add(12.12, 12.12));
		System.out.println(a.add(11, 11));
		b.add(1);
		System.out.println(b.getA());
		b.setA(10);
	}

}

class BB extends AA {
	private int a = 10;

	void add(int a) {
		System.out.println("kakoito metod");
	}

	public int getA() {
		return a;
	}
	

	public void setA(int a) {

		if (a > 10) {
			System.out.println("wrong");
		} else if (a == 10) {
			System.out.println("nice");
		} else {
			System.out.println("anyway wrond");
		}
		this.a = a;
	}
}
