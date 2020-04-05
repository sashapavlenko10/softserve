package test;

public class FlyingBird extends Bird {

	public FlyingBird(String st) {

	}
	
	@Override
	public String fly() {
		return "fly";
	}

	@Override
	public String toString() {
		return "FlyingBird: ";
	}
	

}
