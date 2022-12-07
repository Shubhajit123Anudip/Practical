package com.java;

public class ConsoleEg {

	public static void main(String[] args) {

		System.out.println("Please enter your name");
		String s=System.console().readLine();
		
		System.out.println("Welcome"+s);
		/*System.out.println("Please enter your password");
		char[] ch=c.readPassword();
		String s1=String.valueOf(ch);//converting char array to string
		System.out.println("Your password is " +s1);*/
	}
	}
