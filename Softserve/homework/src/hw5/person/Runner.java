package hw5.person;

public class Runner {
public static void main(String[] args) {
	Person [] people = new Person[5];
	people[0] = new Staff("Employee", 700);
	people[1] = new Staff("Employee",500);
	people[2] = new Student("Stunent");
	people[3] = new Teacher("Teacher", 200);
	people[4] = new Cleaner("Cleaner", 100);
	for (Person p : people)
		 System.out.println(p.getName() +  p.print());
}
}
