package test;

public class NonFlyingBird extends Bird{

	public NonFlyingBird(String st) {
		
	}

	@Override
	public String fly() {
		return "not fly";
	}

	@Override
	public String toString() {
		return "NonFlyingBird: ";
	}

}
