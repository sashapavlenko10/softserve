package test;

public class Penguin extends NonFlyingBird{

	public Penguin(String string) {
		super(string);
	}

	@Override
	public String toString() {
		return "Penguin: ";
	}

}
