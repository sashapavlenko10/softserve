package hw3;

public class Runner {
public static void main(String[] args) {
	Product prod1 = new Product("bred", 15, 20);
	System.out.println(prod1);
	Product prod2 = new Product("milk", 12, 25);
	System.out.println(prod2);
	Product prod3 = new Product("eggs", 5, 250);
	System.out.println(prod3);
	Product prod4 = new Product("water", 11, 70);
	System.out.println(prod4);
	int a =15; 
	int b = 12;
	int c = 11;
	if(a>b&&a>c){
		System.out.println("bred= " + a);
	}
	else  if (b>a&&b>c){
		System.out.println("milk" + b);
	}
	else {
		System.out.println("water " + c);
	
	}
}
}
