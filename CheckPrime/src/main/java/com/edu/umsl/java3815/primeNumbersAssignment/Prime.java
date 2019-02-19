package com.edu.umsl.java3815.primeNumbersAssignment;

import java.util.ArrayList;

public class Prime {

	public static void main(String[] args) {
		checkNumbers();
	}

	static void checkNumbers() {

		int max = 10;

		System.out.println("Here is a list of Prime numbers between 1 and 10: ");

		ArrayList<Integer> list = new ArrayList<Integer>();

		// loops through the numbers one by one
		for (int n = 1; n < max; n++) {
			boolean prime = true;
			// analyzes if n is prime

			for (int j = 2; j < n; j++) {
				if (n % j == 0) {
					prime = false;
					break; // exits the inner loop
				}
			}
			if (prime && n != 1) {
				list.add(n);
			}
		}
		for (int i : list) {
			System.out.println(i + " ");
		}
	}
}