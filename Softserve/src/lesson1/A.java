package lesson1;

import java.util.Scanner;

public class A {
	
	 public static void main(String[] args) {
		 
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("enter digit a:");
		 int a = scanner.nextInt();
		 System.out.print("enter digit b:");
		 int b = scanner.nextInt();
		 int sum = a+b;
		 System.out.println("sum = " + sum);
		 int sub=a-b;
		 System.out.println("subtraction = " + sub);
		 int mul = a*b;
		 System.out.println("multiplication = " + mul);
		 double div = (double)a/b;
		 System.out.println("division = " + div);
		    }

	 }

