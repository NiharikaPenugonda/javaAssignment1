package javaAssignment;

import java.util.Scanner;

public class reverseAnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		int rem,rev=0;
		while(n>0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("Reverse of "+n+" is "+rev);
	}

}
