package hw3;

import java.util.Scanner;

public class Exp2 {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	        System.out.print("������� �����: ");
	        int day = sc.nextInt();
	        switch (day) {
	            case 1: System.out.println("Monday"); 
	            System.out.println("��������"); System.out.println("�����������");break;
	            case 2: System.out.println("Tuesday"); 
	            System.out.println("³������"); System.out.println("�������");break;
	            case 3:  System.out.println("Wednesday"); 
	            System.out.println("������"); System.out.println("�����");break;
	            case 4:  System.out.println("Thursday"); 
	            System.out.println("�������"); System.out.println("������");break;
	            case 5: System.out.println("Friday"); 
	            System.out.println("�`������"); System.out.println("�������");break;
	            case 6:  System.out.println("Saturday");
	            System.out.println("������"); System.out.println("������");break;
	            case 7:  System.out.println("Sunday"); 
	            System.out.println("�����"); System.out.println("�����������");break;
	            default: System.out.println("Wrong"); System.out.println("�����������");
}
}
}