package employee;

public class Employee {
private String name;
private int rate;
private int hours;
public static int totalSum = 0; 
public Employee() {totalSum++;}

public Employee(String name, int rate, int hours) {
	this.name = name;
	this.rate = rate;
	this.hours = hours;
	totalSum++;
}

public Employee(String name, int rate) {
	this.name = name;
	this.rate = rate;
	totalSum++;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRate() {
	return rate;
}
public void setRate(int rate) {
	this.rate = rate;
}
public int getHours() {
	return hours;
}
public void setHours(int hours) {
	this.hours = hours;
}
public int getSalary() {
	return this.rate * this.hours;
}
public String toString() {
	return " name: " + name + ", rate: " + rate + ", salary: " + getSalary() + ", bonus: " 
+ getBonuses() + ", change rate: " + changeRate();
}
public int changeRate() {
	return 100;
	 
}
public double getBonuses() {
	double b = this.rate * 0.1;
	return b;
}
public static void print (Employee ... emp) {
	int sum=0;
	for(Employee e: emp) {
		sum+=e.getSalary();}
		System.out.println("total salary = " + sum);
		
}
}

