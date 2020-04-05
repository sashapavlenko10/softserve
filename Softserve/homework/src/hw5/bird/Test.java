package test;

public class Test {
public static void main(String[] args) {
	Bird [] bird = new Bird [4]; 
	 bird[0] = new Chiken("Chiken");
	 bird[1] = new Eagle("Eagle");
	 bird[2] = new Swallow("Swallow");
	 bird[3] = new Penguin("Penguin");
	 for (Bird b : bird)
		 System.out.println(b+b.fly());
}
}

