package hw5;

import hw4.Employee;

public class Runner {
public static void main(String[] args) {
	Dog [] dogs = new Dog[3];
	dogs[0] = new Dog("spike", 1);
	dogs[1] = new Dog("Tim", 2);
	dogs[2] = new Dog("rex", 3);
	for (Dog d : dogs)
		 System.out.println(" имя: " + d.getName() + 
				 " возраст: " + d.getAge());
	Dog dog = new Dog();
		dog.voice();
		dog.feed();
	Cat [] cats = new Cat[3];
	cats[0] = new Cat("Tom", 1);
	cats[1] = new Cat("Kot", 2);
	cats[2] = new Cat("Vaska", 3);
	for (Cat c : cats)
		 System.out.println(" имя: " + c.getName() + 
				 " возраст: " + c.getAge());
	Cat cat = new Cat();
	cat.voice();
	cat.feed();
}
}
