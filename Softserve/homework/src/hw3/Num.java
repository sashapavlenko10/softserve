package hw3;
import java.util.Scanner;

class Num{
public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println(" ¬ведите первое число: ");
		int a = sc.nextInt();
		Num.number(a);
		System.out.println(" ¬ведите второе число: ");
		int b = sc.nextInt();   
		Num.number(b);
		System.out.println(" ¬ведите третье число: ");
		int c = sc.nextInt();
		Num.number(c);
}

static int number(int n) {
	
	 if((n%2)==0)
	  {
   System.out.print("„исло: " + n + " - четное. ");
}
else{
  if((n%1)==0){
    System.out.print("„исло: " + n + " - нечетное. ");
  }
}
	return n;
}
}
