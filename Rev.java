package logics;

import java.util.Scanner;

public class Rev {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o = new Scanner(System.in);
		System.out.println("enter a number :");
		int num = o.nextInt();
		int rev = 0;

		while(num != 0) {
			int remainder = num % 10;
			rev = rev * 10 + remainder;
			num = num / 10;
		}
		System.out.println("reverse of given number is :"+rev);
		o.close();
	}

}
