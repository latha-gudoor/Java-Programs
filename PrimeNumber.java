package com.wbl.Loops;

import java.util.Scanner;

// Write a program  to check if a given number is prime or not.
public class PrimeNumber {


	public void prime(int n){
		//int n1=0;
		if (n%2==0){
			System.out.println(n + " is a Prime Number");
		}
		else 
		{
			System.out.println(n + " is not a Prime Number");
		}
	}

	public static void main(String[] args) {
		PrimeNumber prime = new PrimeNumber();
		System.out.println("Enter the number : ");
		Scanner n1 = new Scanner(System.in);
		int num = n1.nextInt();


		prime.prime(num);

	}

}
