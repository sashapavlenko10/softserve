package HW4_1car;
import java.util.Scanner;

public class Runner {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("введите год: ");
	int a = sc.nextInt();
	Car run = new Car();
	Car car = new Car("bentley",2002,5.5);
	run.setYear(a);
	run.setType("bmw");
	run.setEngine(2.4);
	System.out.println(run);
	System.out.println(car);
	
}
}
