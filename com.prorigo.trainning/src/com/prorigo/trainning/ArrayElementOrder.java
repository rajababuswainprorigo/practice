package com.prorigo.trainning;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayElementOrder {
	public static void main(String[] args) {
		// defining an array of integer type
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array size : ");
		int size = sc.nextInt();
		int[] array = new int[size];
		// invoking sort() method of the Arrays class
		for (int i = 0; i < size; i++) {
			System.out.print("Enter Array Element : ");
			int element = sc.nextInt();
			array[i] = element;
		}

		Arrays.sort(array);
		System.out.println("Elements of array sorted in ascending order: ");
		// prints array using the for loop
		for (int i : array) { // changed from for to for each loop
			System.out.print(i + " ");
		}
	}
}
