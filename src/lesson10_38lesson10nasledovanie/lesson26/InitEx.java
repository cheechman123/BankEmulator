package lesson10_38lesson10nasledovanie.lesson26;

class Parent {
	Parent() {
		System.out.println("parent constructor");
	}
	static {
		System.out.println("static parent init block");
	}
}

public class InitEx extends Parent {
	static {
		System.out.println("static init block");
	}
	{
		System.out.println("init block1");
	}
	{
		System.out.println("init block2");
	}
	InitEx(){
		super();
		System.out.println("constructor");
	}
	
	public static void main(String[] args) {
		new InitEx();
	}
	{
		System.out.println("init block3");
	}
}
