package com.java;
//we can read only(only getter method)
//we can write only(only setter method)
public class Read_WriteOnlyEn 
{
	//private String name="Suvo" ;//private data member
    private String name;
   public void setName(String name) {
    this.name=name;
	  // public String getName(){
	   //return name;
   }
	public static void main(String[] args) {
		Read_WriteOnlyEn obj=new Read_WriteOnlyEn();
		//obj.set_name("Suvo");//we can't change the value of the name
		System.out.println(obj.name);

	}

}
