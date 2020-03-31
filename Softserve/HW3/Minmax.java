package hw3;

public class Minmax {
public static void main(String[] args) {
	int a =22; 
	int b = 15;
	int c = 7;
	if(a>b&&a>c){
		System.out.println("max number = " + a);
	}
	else  if (b>a&&b>c){
		System.out.println("max number " + b);
	}
	else {
		System.out.println("max number " + c);
	
	}
	if(a<b&&a<c){
		System.out.println("min number = " + a);
	}
	else  if (b<a&&b<c){
		System.out.println("min number = " + b);
	}
	else {
		System.out.println("min number = " + c);
	}
}
}
