package practical;
import java.util.Scanner;

public class String {
	
	public void show() { //method
		Scanner s=new Scanner(System.in);
	System.out.println("Enter string");
	 java.lang.String A = s.next();//1st string
	 java.lang.String B = s.next(); //2nd string
	
	System.out.println(A.length()+B.length());//1st string length+(concat)2nd string 1
	System.out.println((A.compareTo(B)>0) ? "Yes" : "No");//compare to 
	System.out.println(A.substring(0,4).toUpperCase()+A.substring(2)+" "
	+B.substring(0,3).toLowerCase()+B.substring(1, 0));
	}

public static void main(String [] args) {
	String t=new String();
	t.show();
}
}
