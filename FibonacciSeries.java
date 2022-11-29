package com.bridgelabz;

import java.util.Scanner;

//Fibonacci series is a special type of series in which the next term is the sum of the previous two terms. For example, if 0 and 1 are the two previous terms in a series, then the next term will be 1(0+1).
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number1 = 0, number2 = 1, number3;
		System.out.print("Enter the range : ");
		int range = scanner.nextInt();
		System.out.print("Fibonacci series is : ");
		System.out.print("0, 1, ");
		for (int i = 2; i < range; i++) {
			number3 = number1 + number2;
			number1 = number2;
			number2 = number3;
			System.out.print(number3);
			if (i < range - 1)
				System.out.print(", ");
		}
	}

}
