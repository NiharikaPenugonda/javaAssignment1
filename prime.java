package javaAssignment;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		int multiples=1;
		for(int i=2;i<(n/2 + 1);i++) {
			if(n%i==0) {
				multiples+=1;
			}
		}
		if(multiples>1) {
			System.out.println(n+" is not a prime number");
		}else {
			System.out.println(n+" is a prime number");
		}
	}

}
