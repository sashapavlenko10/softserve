package hw3;

public enum d {
breed("ter`er");

private final String str;

d(String str) {
	 this.str=str;
}
public String get() {
	System.out.println(str);
	return str;	
}
}
