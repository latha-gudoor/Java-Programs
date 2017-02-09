package com.wbl.Loops;

/*Write a program print "ping" if a number is divisible by 3,"pong" if a number 
 * is divisible by 5, and "ping pong" 
 * if number is divisible by both, else print the number.*/


public class PingPong_Divisible {

	public void divisble(int n){
		if (n%3==0){
			System.out.println("divisible by 3 : Ping");
			if (n%5==0){
				System.out.println("divisible by 5 : Pong");
				if (n%3==0 && n%5==0){
					System.out.println("divisible by 3 and 5 : PingPong");
				}

			}

		}else
			System.out.println(n);
	}

	public static void main(String[] args) {
		//String str = args[0];
		//int i = Integer.parseInt(str);

		PingPong_Divisible num = new PingPong_Divisible();
		num.divisble(15);
		
		//num.divisble(i);
	}

}
