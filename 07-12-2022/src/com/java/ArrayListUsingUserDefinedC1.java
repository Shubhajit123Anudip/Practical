package com.java;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListUsingUserDefinedC1 {

	public static void main(String[] args) {
		Bank b=new Bank(12342,"Suvo",5000.45,20);
		Bank b1=new Bank(12347,"priya",5000.34,20);
		Bank b2=new Bank(12349,"pritam",5000.54,20);
		Bank b3=new Bank(12346,"dayna",5000.55,20);
		Bank b4=new Bank(12345,"Subham",5000.32,20);
		Bank b5=new Bank(12344,"Satya",5000.45,30);
ArrayList<Bank> al=new ArrayList<Bank>();
al.add(b);
al.add(b1);
al.add(b2);
al.add(b3);
al.add(b4);
al.add(b5);
Iterator itr= al.iterator();
while(itr.hasNext()) {
	Bank obj=(Bank) itr.next();
	System.out.println(obj.accountNo+" "+obj.customerName+" "+obj.balance+""+obj.customerAge);
}
	}

}
