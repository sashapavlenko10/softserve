package HW8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the length of Rectangle:");
	   double length=0;
	   try {
	   length = sc.nextDouble();
	   if (length<0) throw new ArithmeticException("error");
	   }
	   catch(InputMismatchException | ArithmeticException e){
		   System.out.println(e);
	   }
	   System.out.println("Enter the width of Rectangle:");
	   double width=0;
	   try {
	   width = sc.nextDouble();
	   if (width<0) throw new ArithmeticException("error");
	   }
	  catch(InputMismatchException | ArithmeticException e) {
		  System.out.println(e);
	  }
	   finally {
		    if (sc == null) { sc.close(); }    
		}
	   double area = length*width;
	   System.out.println("Area of Rectangle is:"+area);
	}
}
