package com.nt.git;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		int n,rem,temp,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Here::");
		n=sc.nextInt();
		temp=n;
		while(n>0) {
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is not Palindrome`");
		}

	}

}
