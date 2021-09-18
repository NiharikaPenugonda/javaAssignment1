package javaAssignment;

import java.util.Scanner;

public class countDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		int temp=n;
		int count=0;
		while(temp>0) {
			count++;
			temp=temp/10;
		}
		System.out.println("No.of digits in "+n+" is "+count);
	}

}
