package keyHorstmanListing5_4_5_7;

public class Student  extends Person{
	private String major;
	public Student(String name, String major) {
		super(name);
		this.major = major;
	}
	public String getDesc() {
		return "a student majoring in" + major;
	}

}
