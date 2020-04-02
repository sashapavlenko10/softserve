package hw5.person;

public class Student extends Person{
public Student(String name) {
super(name);
}
	@Override
	public String print() {
		return "I am student ";
	}

}
