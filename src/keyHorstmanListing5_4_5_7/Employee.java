package keyHorstmanListing5_4_5_7;

import java.time.LocalDate;
import java.util.Objects;

public class Employee extends Person {
	private double salary;
	private String name;
	private LocalDate hireDay;
	
	public Employee(String name, double salary, int year, int month, int day) {
		super(name);
		this.name = name;
		this.salary = salary;
		hireDay = LocalDate.of(year, month, day);
	}
	public String getName () {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public LocalDate getHireDay() {
		return hireDay;
	}
	
	public void raiseSalary(double byPersent) {
		double raise = salary * byPersent / 100;
		salary += raise;
	}
	public boolean equals(Object otherObject) {
		if(this == otherObject)
			return true;
		if(otherObject == null)
			return false;
		if(getClass() !=otherObject.getClass())
			return false;
		Employee other = (Employee) otherObject;
		
		return Objects.equals(name, other.name)
				&& salary == other.salary
				&&Objects.equals(hireDay, other.hireDay);
	}
	public int hashCode() {
		return Objects.hash(name,salary,hireDay);
	}
	public String toString () {
		return getClass().getName() + "[name = " + name + ", salary = " + salary +", hireDay = " + hireDay  + "]";
	}
	@Override
	public String getDesc() {
		return String.format("an employee with a salary of $%.2f",salary);
	}
}
