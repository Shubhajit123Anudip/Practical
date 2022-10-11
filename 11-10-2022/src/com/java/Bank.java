package com.java;

public class Bank {
	class ICICI extends Bank{
		void rateOfInterest(int rate) {
			System.out.println("rate of interest of ICICI is:"+rate+"%");
		}
		}
			class SBI extends Bank{
				void rateOfInterest(int rate) {
					System.out.println("rate of interest of SBI is:"+rate+"%");
		}
		
	}
			class AXIS extends Bank{
				void rateOfInterest(int rate) {
					System.out.println("rate of interest of AXIS is:"+rate+"%");
				}
			}
	public static void main(String[] args) {
   Bank b=new Bank();
   SBI S=b.new SBI();
   ICICI I=b.new ICICI();
   AXIS A=b.new AXIS();
   S.rateOfInterest(8);
   I.rateOfInterest(7);
   A.rateOfInterest(9);
   
	}

}
