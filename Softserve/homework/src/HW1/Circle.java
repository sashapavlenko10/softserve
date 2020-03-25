package lesson1;

import java.util.Scanner;

public class Circle {
	 static Scanner sc = new Scanner(System.in);
	   public static void main(String args[])
	   {
	      System.out.print("Введите радиус: ");
	      double radius = sc.nextDouble();
	      //Площадь круга вычисляется по формуле = PI*radius*radius
	      double area = Math.PI * (radius * radius);
	      System.out.println("Площадь круга равна: " + area);
	      //Длины окружности вычисляется по формуле = 2*PI*radius
	      double circumference= Math.PI * 2*radius;
	      System.out.println("Длины окружности равна: " + circumference) ;
}
}
