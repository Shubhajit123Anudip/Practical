package com;
import java.io.*;

public class Pattern{
	public static void printTraingle(int n) {//method to print pattern 
		for (int i=0;i<=n;i++) {
			for(int j=n-i;j>=1;j--) {
				System.out.print("");
				
			}
			for(int j=0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n = 5;
      printTraingle(n);//calling method

	}

}
