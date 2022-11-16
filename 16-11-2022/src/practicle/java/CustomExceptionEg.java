package practicle.java;

public class CustomExceptionEg {
   public void checkage() throws Invalidageexception{
	   if(age<=18||age>=25) {
		   throw new Invalidageexception("Invalid age for enrolling into java course");
	   }else
		   System.out.println("proper age for enrolling in java course");
	   }
	public static void main(String[] args)throws Invalidageexception {
		CustomExceptionEg obj=new CustomExceptionEg();
		obj.checkage(17);

	}

}
