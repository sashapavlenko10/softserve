package hw5;

public class Dog implements Animal{
	private String name;
	private int age;
public Dog(String name, int age) {
	this.name=name;
	this.age=age;
}
public Dog() {}
	public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

	@Override
	public void voice() {
		System.out.println("Gav");
		
	}

	@Override
	public void feed() {
		System.out.println("Meat");
		
	}
	@Override
	public String toString() {
		return "Dog [name=" + ", age=" + age + "]";
	}
	
	

}
