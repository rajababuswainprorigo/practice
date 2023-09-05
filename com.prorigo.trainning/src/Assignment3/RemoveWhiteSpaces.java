package Assignment3;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String s = "Checking Whitespaces By Rajababu";
		for (char c : s.toCharArray()) { // CharArray() method converts the given string into a sequence of characters.
											// The returned array length is equal to the length of the string
			if (c != ' ')
				System.out.print(c);
		}
	}

}
