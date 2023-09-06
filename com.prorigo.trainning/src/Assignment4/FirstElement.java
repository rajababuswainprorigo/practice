package Assignment4;

import java.util.ArrayList;

public class FirstElement {

//Given the list of integers, find the first element of the list.

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(5);
		list.add(393);
		list.add(23);
		list.add(33);
		list.add(55);
		list.add(95);

		System.out.println("Total elements in an array : " + list);

		// find first element
		int first = list.get(0);
		System.out.println("First element of aaray is : " + first);

	}
}