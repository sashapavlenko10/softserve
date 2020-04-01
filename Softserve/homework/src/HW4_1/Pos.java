package HW4_1;

public class Pos {
	public static void main(String[] args) {	
		int [] n = {1,2,3,4,5};
		int imax = 0;
		int i = 0;
		while (i < n.length) {
			if (n[i] > imax) {
				imax = i;
			}
			i++;
		}	
		System.out.println("тут " + (imax + 1) + " мест");

	}}