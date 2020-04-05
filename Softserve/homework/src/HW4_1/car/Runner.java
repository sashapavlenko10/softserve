package HW4_1car;
import java.util.Scanner;

public class Runner {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("введите год: ");
	int a = sc.nextInt();
	Car [] car = new Car[5];
	car[0] = new Car("bentley",2005,5.5);
	car[1] = new Car("bmw",2007,4.4);
	car[2] = new Car("mercedes",2002,3.4);
	car[3] = new Car("lexus",2012,1.2);
	car[4] = new Car("jugul",1995,1.1);
	 for (Car c : car)
		if (a == c.getYear())
		System.out.println(c);
	
}
}
