package hw4;

public class Employee {
public String name;
public int department;
public int salary;
public Employee(String name, int department, int salary) {
	this.name = name;
	if (department>0 && department<=10)
	this.department = department;
	this.salary = salary;
}
public String getName() {
	System.out.println(name);
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getDepartment() {
	return department;
}
public void setDepartment(int department) {
	this.department = department;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", department=" + department + ", salary=" + salary + "]";
}  
}
