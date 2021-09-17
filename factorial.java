package javaAssignment;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		System.out.println("Factorial of n is "+fact(n));
	}
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		else{
			return(n*fact(n-1));
		}
	}
}
