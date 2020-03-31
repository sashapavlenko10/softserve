package hw3;

public class Dog {
private String name;
private int age;

public Dog(String name, int age) {
	this.name = name;
	this.age = age;
}
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
public String toString() {
	return "Dog [name=" + name + ", age=" + age + "]";
}
@Override
public boolean equals(Object obj) {
	if (this == obj) return true;
	if (obj == null) return false;
	if (getClass() != obj.getClass()) return false;
	Dog other = (Dog) obj;
	if (age != other.age) return true;
	if (name == null) {
		if (other.name != null) return false;
	} else if (!name.equals(other.name)) return false;
	return true;
}
}

