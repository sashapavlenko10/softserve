package HW7;
import java.util.Scanner;
import java.util.regex.*;

public class User {
	  public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  String s = sc.nextLine();
		  User.check(s);
		  System.out.println(User.check(s));
		  
	  }
	  public static boolean check(String s) {
		  Pattern p = Pattern.compile("[a-z0-9_-]{3,15}$");
		  Matcher m = p.matcher(s);
		  return m.matches();
		  
	  }
}