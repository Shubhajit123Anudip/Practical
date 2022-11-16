package practicle.java;
class UserDefinedException1 extends Exception {//parent exception class
public UserDefineException1(String str) 
{
	super(str);//call the constructor of parent exception
}}
  public class UserDefinedException {//parent exception class

	public static void main(String[] args) {
		{
			try {
				throw new UserDefinedException1("user define exception")
			}catch(UserDefinedException u) {
				System.out.println("exception mil gaya");
				System.out.println(u.getMessage());
			}
		}
	}

}
