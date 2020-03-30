package hw3;

public enum E {
	Europe("Germany"),
	Asia("China"),
	Africa("Egypt"),
	North_America("USA"),
	South_America("Argentina"),
	Australia("New_zeland"),
	Antarctica("Antarctica");
	private final String str;
	
	E(String str) {
		this.str=str;
	}
	public String get() {
		return str;
		}
}


