package Assignment4;

import java.util.Scanner;

public class NonRepeatChar {

//Given a String, find the first non-repeated character in it.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:-");
		String s = sc.next();
		String string = s;
		int index = -1;
		char fnc = ' ';

		if (string.length() == 0) {
			System.out.println("EMPTY STRING");
		}

		for (char i : string.toCharArray()) {
			if (string.indexOf(i) == string.lastIndexOf(i)) {
				fnc = i;
				break;
			} else {
				index += 1;
			}
		}
		if (index == string.length() - 1) {
			System.out.println("All characters are repeating");
		} else {
			System.out.println("First non-repeating character is " + fnc);
		}

	}

}