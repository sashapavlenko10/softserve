package hw6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Coll {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int x = sc.nextInt();
	List<Integer> myCollection = new ArrayList<>(x);
	for (int i = 0; i < 10; i++) {
		myCollection.add(sc.nextInt());
	Collections.sort(myCollection);
	 System.out.println(myCollection);
		 System.out.println(myCollection);
	System.out.println(myCollection);
	Iterator itr = myCollection.iterator();
	while (itr.hasNext()) {
		int y = (Integer)itr.next();
		if (y>20 || y<5)
			itr.remove();
	}
	System.out.println("отcopтирован:"+myCollection);
}
}
}