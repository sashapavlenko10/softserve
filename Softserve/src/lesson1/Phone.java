package lesson1;

public class Phone {
public static void main(String[] args) {
	double a = 2.5;
	double b = 3.5;
	double c = 4.5;
	double minute1 = 1;
	double minute2 = 2;
	double minute3 = 3;
	double ger = a*minute3;
	System.out.println("звонок из Германии = " + ger + " $");
	double aus = b*minute2;
	System.out.println("звонок из Австралии = " + aus + " $");
	double usa = c*minute1;
	System.out.println("звонок из США = " + usa + " $");
	
}
}
