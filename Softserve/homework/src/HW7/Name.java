package HW7;

import java.util.Scanner;

public class Name {
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("введите имя: ");
       String firstName=sc.nextLine();
	   System.out.println("введите фамилию: ");
       String lastName=sc.nextLine();
	   System.out.println("введите отчество: ");
       String patronymic= sc.nextLine();
       
       System.out.println(lastName+" "+firstName.charAt(0)+
       " "+patronymic.charAt(0));
       System.out.println(firstName);
       System.out.println(firstName+" "+patronymic+" "+lastName);
}
}
