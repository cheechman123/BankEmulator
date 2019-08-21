package lesson10_38lesson10nasledovanie.lesson17;

public class A {
	B b = new B();// объектная переменная
	final static int f = 0;
	volatile int d;// говорит потокам использовать не кешированную версию
	// а на прямую обращаться к переменной читать из памяти

	transient int g;// выберает для серилизации определенное поле
	final int q = 0; // делает константу с переменной
	// native используется для тех методов которые были написаны на других языках
	// и этот модификатор говорит компилятору подключить спец библиотеки и тд
	// strictfp - помогаем с определенной помощь. считать флоаты
	// synchonixed - делает что б метод выполнялся в одном потоке
	// final - в методах говорит что этот метод никогда не сможет быть переопределен

	// enum может быть в классе может быть вне класса , но не может быт ьв методе
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
