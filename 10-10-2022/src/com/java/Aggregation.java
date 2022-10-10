package com.java;

public class Aggregation {
	int Squre(int r) {
		return r*r;
	}

}
class circle{
	Aggregation ag;
	double pi=3.14;
	double area(int radius) {
		ag=new Aggregation();
		int psqure=ag.Squre(radius);
		return pi*psqure;
	}
	public static void main(String args[]) {
		circle c=new circle();
		double result=c.area(5);
		System.out.println(result);
	}
}