package hw5.person;

public abstract class Person {
public abstract String print();
private String name;

public Person() {}
public Person(String name) {
	this.name=name;
}
public String getName() {
return name;
}
}