package javaAssignment;

import java.util.Scanner;

public class sumOfNnumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println("Sum of first "+n+" numbers is "+sum);
	}
}
