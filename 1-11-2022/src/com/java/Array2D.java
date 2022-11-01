package com.java;
//multidimensional array
public class Array2D {
	public static void main(String[]args) {
		//declaring & initializing 2D array
		int arr[][]= {{2,5,6},{4,5,6},{1,2,5}};
		for(int i=0;i<3;i++) {//for printing row
			for(int j=0;j<3;j++) {//for printing column
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
