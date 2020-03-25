package lesson1;

import java.util.Scanner;

public class Name {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	System.out.println("What is your name?");
	String name = scanner.nextLine();
	System.out.println("Where are you live " + name + "?");
	String adress = scanner.nextLine();
	System.out.println(name + ", " + adress);
	}

}
