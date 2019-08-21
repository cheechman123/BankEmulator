package keyHorstmanListing5_4_5_7;

import javax.print.attribute.standard.MediaSize.Other;

public class Manager extends Employee {
	private double bonus;
	public Manager(String name, double salary , int year , int month, int day) {
		super(name, salary, year, month, day);
		bonus = 0;	
	}
	public double getSalary() {
		double baseSalary = super.getSalary();
		return baseSalary + bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public boolean equals(Object oterObject) {
		if(!super.equals(oterObject))return false;
		Manager other = (Manager)oterObject;
		return bonus == other.bonus;
	}
	@SuppressWarnings("deprecation")
	public int hashCode() {
		return super.hashCode() + 17 * new Double(bonus).hashCode();
	}
	public String toString() {
		return super.toString() + "[bonus = " + bonus +"]";
	}
}
