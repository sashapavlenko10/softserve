package hw3;

import java.util.Scanner;

public class Exp2 {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	        System.out.print("Введите число: ");
	        int day = sc.nextInt();
	        switch (day) {
	            case 1: System.out.println("Monday"); 
	            System.out.println("Понеділок"); System.out.println("Понедельник");break;
	            case 2: System.out.println("Tuesday"); 
	            System.out.println("Вівторок"); System.out.println("Вторник");break;
	            case 3:  System.out.println("Wednesday"); 
	            System.out.println("Середа"); System.out.println("Среда");break;
	            case 4:  System.out.println("Thursday"); 
	            System.out.println("Четверг"); System.out.println("Четвер");break;
	            case 5: System.out.println("Friday"); 
	            System.out.println("П`ятниця"); System.out.println("Пятница");break;
	            case 6:  System.out.println("Saturday");
	            System.out.println("Субота"); System.out.println("Субота");break;
	            case 7:  System.out.println("Sunday"); 
	            System.out.println("Неділя"); System.out.println("Воскресенья");break;
	            default: System.out.println("Wrong"); System.out.println("Неправильно");
}
}
}