package javaAssignment;

import java.util.Scanner;

public class typeCasting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter integer value");
		int n=sc.nextInt();
		System.out.println("Enter float value");
		float f=sc.nextFloat();		
		System.out.println("Integer "+n);
		System.out.println("Int to float "+(float)n);
		System.out.println("Int to double "+(double)n);
		System.out.println("Float "+f);
		System.out.println("float to int "+(int)f);
		System.out.println("float to double "+(double)f);
	}

}
