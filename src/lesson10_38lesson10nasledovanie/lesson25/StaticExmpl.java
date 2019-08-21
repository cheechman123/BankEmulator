package lesson10_38lesson10nasledovanie.lesson25;

public class StaticExmpl {
	static int i = 5;
	int j;
	static {
		++i;
		System.out.println("static initialazier");
	}
	{
		System.out.println("initializer");
	}
	public StaticExmpl() {
		System.out.println("constructor");
	}
	static void staticMethod() {
		i++;
		System.out.println("static method");
	}
	public static void main(String[] args) {
		System.out.println(StaticExmpl.i);
		StaticExmpl.staticMethod();
		System.out.println(StaticExmpl.i);
	}
	//статические пол€ и метод≥ нам нужн≥ что б иметь неоктор≥е 
	//переменн≥е на уровне Їкземпл€ра класса
	
}
