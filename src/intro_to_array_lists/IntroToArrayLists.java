package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> list = new ArrayList<String>();
		//2. Add five Strings to your list
		String a = "kieu";
		String b = "molly";
		String c = "melinda";
		String d = "brooklyn";
		String e = "lina";
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		list.add(e);
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list);
		}
		//4. Print all the Strings using a for-each loop
		for(String lists : list) {
			System.out.println(lists + "\n");
		}
		//5. Print only the even numbered elements in the list.
		int o = 0;
		for(int i = 0; i < 3; i++) {
			System.out.println(list.get(o));
			o = o+2;
		}
		//6. Print all the Strings in reverse order.
		System.out.println(e+" "+d+" "+c+" "+b+" "+a + "\n");
		//7. Print only the Strings that have the letter 'e' in them.
		System.out.println(a);
		System.out.println(c);
	}
}
