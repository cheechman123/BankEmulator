package lesson10_38lesson10nasledovanie.lesson13;

public class Person {
	private String name;
	private boolean blond;
	//для приватных переменных надо что б всегда были геттеры и сеттеры 
	//для булианов перед именем добавляется "IS"
	public boolean isBlond() {
		return blond;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
