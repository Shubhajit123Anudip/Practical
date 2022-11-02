package com.java;

public class MultiplicationMatrix {

	public static void main(String[] args) {
		int a[][]= {{16,14},{10,9}};
		int b[][]= {{10,4},{17,6}};
	//for storing result create another matrix
		  int c [][]=new int [2][2];{
			for(int i=0; i<2;i++) {
			for(int j=0; j<2;j++) {
				c[i][j]=a[i][j]*b[i][j];
					System.out.print(c[i][j]+" ");
		}
	System.out.println();
		}
	}

	}

}
