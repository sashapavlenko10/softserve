package hw4;

import java.util.Scanner;

public class Runner {
public static void main(String[] args) {
	
	 Employee[] staff = new Employee[7];
	 staff[0] = new Employee("Harry Hacker", 1, 1200);
	 staff[1] = new Employee("Tony Tester", 2, 1500);
	 staff[2] = new Employee("Carl Cracker", 1, 1400);
	 staff[3]= new Employee("Marry Oker", 1, 900);
	 staff[4] = new Employee("Tani Ater", 2, 500);
	 staff[5]= new Employee("John Bambo", 2, 1700);
	 staff[6]= new Employee("Ivan Ivanov", 1, 700);

			 Scanner sc =  new Scanner(System.in);
			 System.out.println("введите департамент: ");
			 int dep = sc.nextInt();
			 Employee t;
			 for(int i=0;i<staff.length-1;i++) {
				 for(int j=0;j<staff.length;j++) {
					 if(staff[i].getSalary()>staff[j].getSalary()) {
						 t=staff[i];
						 staff[i]=staff[j];
						 staff[j]=t;}}}
	 for (Employee e : staff)
		if ( dep == e.getDepartment())
			System.out.println(" name: " + e.getName()+" salary: "+e.getSalary());
	 
	 }
}
