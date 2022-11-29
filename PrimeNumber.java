package com.bridgelabz;

//Prime Number
//Just like the Perfect number, the Prime number is also a special type of number. When the number is divided greater than 1 and divided by 1 or itself is referred to as the Prime number. 0 and 1 are not counted as prime numbers. All the even numbers can be divided by 2, so 2 is the only even prime minister.
public class PrimeNumber {

	public static void main(String[] args) {
		int n = 23;
		checkPrime(n);
	}

	private static void checkPrime(int n) {
		int count = 0;

		// negative numbers, 0 and 1 are not prime
		if (n < 2)
			System.out.println("The given is number " + n + " is not prime");

		// checking the number of divisors b/w [1, n]
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				count += 1;
		}

		// if count of divisors greater than 2 then its not prime
		if (count > 2)
			System.out.println("The given is number " + n + " is not prime");

		else
			System.out.println("The given is number " + n + " is prime");
	}

}
