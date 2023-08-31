package Assignment1;

public class FizzBuzz {

	public static void fb() { // method declaration
		for (int i = 1; i <= 100; i++) { // this for loop will iterate till 100

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Fizz");
			} else if (i % 3 == 0) {//modulus will check if the remainder is zero
				System.out.println("Buzz");
			} else if (i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else {
				System.out.println(i);

			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fb(); // method calling

	}
}