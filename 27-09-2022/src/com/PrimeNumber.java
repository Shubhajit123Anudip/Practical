package com;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int num, i,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
		for(i=2;num<i;i++) {
			if(num%2==0)
				count++;
			    break;
		}
	
if(num==0)
	System.out.println("it is a prime number");
else
	System.out.println("it is not a prime number");
		}
		
	}


