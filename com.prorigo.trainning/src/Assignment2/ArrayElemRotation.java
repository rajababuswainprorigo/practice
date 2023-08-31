package Assignment2;
import java.util.Scanner;

public class ArrayElemRotation {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Initialize array
		int[] arr = new int[] { 1, 2, 3, 4, 5 };

		// Displays original array
		System.out.println("Original array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// n determine the number of times an array should be rotated
		System.out.println("enter the delimeter of your choice:-"); //if entered more numbers than the elements present in the array the will be considered the same from beginning
		int n = sc.nextInt();
		// Rotate the given array by n times toward left
		for (int i = 0; i < n; i++) {
			int j, first;
			// Stores the first element of the array
			first = arr[0];
			for (j = 0; j < arr.length - 1; j++) {
				// Shift element of array by one
				arr[j] = arr[j + 1];
			}
			// First element of array will be added to the end
			arr[j] = first;
		}
		System.out.println();
		// Displays resulting array after rotation
		System.out.println("Array after left rotation: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
