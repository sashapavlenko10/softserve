package hw4;

import java.util.Scanner;

public class Runner {
public static void main(String[] args) {
	 Scanner sc =  new Scanner(System.in);
	 System.out.println("введите департамент: ");
	 int dep = sc.nextInt();
	 Employee  staff, staff1,  staff2, staff3, staff4;
	 staff = new Employee("Carl Cracker", dep, 1400);
	 staff1 = new Employee("Harry Hacker", dep, 1200);
	 staff2 = new Employee("Tony Tester", dep, 3500);
	 staff3 = new Employee("John Rambo", dep, 1700);
	 staff4 = new Employee("Ivan Ivanov", dep, 2500);
	 System.out.println(staff); 
	 System.out.println(staff1); 
	 System.out.println(staff2); 
	 System.out.println(staff3); 
	 System.out.println(staff4); 
	int[] arr = {2500, 1700, 3500, 1200, 1400};
	int tmp;
	for (int i = 0; i < arr.length - 1; i++) {
		for (int j = i + 1; j < arr.length; j++) {
			if (arr[i] < arr[j]) {
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
		}
	}
	System.out.println("salary: ");
	for (int i = 0; i < arr.length; i++) {
		System.out.print(" $ " +arr[i]);
	}
}
}