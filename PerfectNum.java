package logics;

import java.util.Scanner;

public class PerfectNum {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number:");
		Long n = s.nextLong();
		int sum = 0;
		int i = 1;
		
		while(i <= n / 2) {
			if(n % i == 0) {
				sum = sum + i;
				i++;
			}
			if(sum == n) {
				System.out.println(n+" is perfect number");
			}else {
				System.out.println(n+" is not a perfect number");
			}
		}
	}
}
