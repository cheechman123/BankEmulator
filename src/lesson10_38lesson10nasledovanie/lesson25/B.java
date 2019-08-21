package lesson10_38lesson10nasledovanie.lesson25;

public class B {
	static B b = new B();
	static int n = 4 ; //4 ибо закончили с конструктором и перешли сюда
	static int i = returnIntStatic();
	static int k = 3; // 5 тут 0 ибо сюда не дошли но оно его вызвало 
	int j = returnInt();
	static {
		System.out.println("Static");//7 ибо это последний в иерархии вызова статик полей 
	}
	{
		System.out.println("clean");//2 ибо первый идет не статик метод
									//еще раз ибо с мейна вызывается конструктор 
									//а он статик 
	}
	B(){
		System.out.println("constructor");//3 ибо сам конструктор вызывается
										  // и опять сам конструктор 
	}
	static int returnIntStatic() {// 6 ибо началась иниц статик полей
		System.out.println(n);
		System.out.println(k);
		System.out.println("return static int ");
		return 1;
	}
	int returnInt() {//вызывается первым ибо сделали статик иниц коструктора а он вызывает все не статик поля 
		System.out.println("return int");//вызывается еще раз ибо в мейне стоит иниц конструктора 
		return 2;
	}
	public static void main(String[] args) {
		new B();
	}
}
