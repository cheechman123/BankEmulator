package keyHorstmanListing5_4_5_7;

public abstract class Person {
	public abstract String getDesc();
	private String name ;
	public Person(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
