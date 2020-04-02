package hw5.person;

public class Runner {
public static void main(String[] args) {
	Person [] people = new Person[3];
	people[0] = new Staff("Teacher ", 700);
	people[1] = new Staff("Cleaner ",500);
	people[2] = new Student("Stunent ");
	for (Person p : people)
		 System.out.println(p.getName() +  p.print());
}
}
