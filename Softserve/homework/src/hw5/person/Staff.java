package hw5.person;

public class Staff extends Person {
private double salary;
public Staff(String name,double salary) {
	super(name);
	this.salary=salary;
}
@Override
public String print() {
	 return " I am " + getName() + " salary= " + getSalary();
}
public double getSalary() {
	return salary;
}

}
	


