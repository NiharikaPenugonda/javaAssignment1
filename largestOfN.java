package javaAssignment;

import java.util.Scanner;

public class largestOfN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int largest=arr[0];
		System.out.println("Enter "+n+" numbers");
		arr[0]=sc.nextInt();
		for(int i=1;i<n;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		System.out.println("Largest number is "+largest);
	}

}
