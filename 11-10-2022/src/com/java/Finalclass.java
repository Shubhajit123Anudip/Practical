//Final keyword---
//final class----cannot extend the final class
package com.java;

/*public*/ final class Finalclass{}
class test extends Finalclass{//cannot extends
	void show() {System.out.println("nothing");}
	
	public static void main(String[]args) {
		test t=new test();
		t.show();
	}


}
