package arrayList;

import java.util.*;
//import java.util.ArrayList;
//import java.util.Iterator;

public class ArrayListCheck {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Amir");
		names.add(null);

		names.add("Arnie");
		names.add("Beth");
		names.add("Lucy");
		names.add(2, "Aditya");
//	    names.remove(2);
//	    names.removeAll(names);

//	    System.out.println(names);

		Iterator<String> itr = names.iterator();

		while (itr.hasNext()) {
			String elem = itr.next();
			elem += " Gautam";
			System.out.println(elem + " ");

		}

	}

}
