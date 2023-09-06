package Assignment4;
import java.util.Scanner;

public class RepeatChar {


//Given a String, find the first repeated character in it.


	static char firstRepeating(String str) {
		int n = str.length();
		char ans = ' ';
		int index = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			char temp = str.charAt(i);

			// Checking that character in temp repeats or not by running a for loop
			for (int j = i + 1; j < n; j++) {
				if (str.charAt(j) == temp) {

					if (j < index) {
						index = j;
						ans = str.charAt(j);
					}
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.next();
		System.out.println("first repeated character : " + firstRepeating(str));
	}

}