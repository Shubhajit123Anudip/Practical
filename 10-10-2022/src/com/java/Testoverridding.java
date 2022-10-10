//Method overriding (1.same name method 2.same parameters 3.IS-A relation)
package com.java;

class Testoverridding {
	void run() {
		System.out.println("Running mode on");
	}
class Overridding extends Testoverridding{
	void run() {
		System.out.println("Running mode off");
	}
	
}
	public static void main(String[] args) {
	  Testoverridding a=new Testoverridding();
		a.run();
		

	}

}
