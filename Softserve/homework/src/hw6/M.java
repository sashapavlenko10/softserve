package hw6;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class M {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int x = sc.nextInt();
	Map <Integer,String> m = new TreeMap<>();
	m.put(1, "Vasya");
	m.put(2, "Fedya");
	m.put(3, "Igor");
	m.put(4, "Bodya");
	m.put(5, "Tima");
	m.put(6, "Borya");
	m.put(7, "Joma");
	System.out.println(m.get(x));
}
}
