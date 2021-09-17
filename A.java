package javaAssignment;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		B obj=new B();
		System.out.println((float)obj.add(a, b));
	}

}
