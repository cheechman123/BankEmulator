package lesson10_38lesson10nasledovanie.lesson11;

public class Main {
	void useCar(Car car) {
		car.driving();
		System.out.println(car.getNumOfSeets());
	}
	public static void main(String[] args) {
		Main main = new Main();
		main.useCar(new Car());
		Toyota t = new Toyota();
		
		Car c = new Car();
		
		System.out.println(c.getNumOfSeets());
		System.out.println(t.getNumOfSeets());
	}
}
