package employee;

public class Runner {
public static void main(String[] args) {
	String v = "Vasya";
	String p = "Petya";
	String k = "Kolya";
	int salary = 700;
	int salary1 = 1000;
	int salary2 = 1200;
	int time = 7;
	int time1 = 8;
	int time2 = 9;
	Employee emp= new Employee(v, salary, time);
	Employee emp1= new Employee(p, salary1, time1);
	Employee emp2= new Employee(k, salary2, time2);
	System.out.println(emp);
	System.out.println(emp1);
	System.out.println(emp2);

}
}