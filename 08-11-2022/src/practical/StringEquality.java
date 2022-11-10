package practical;
import java.util.Scanner;
public class StringEquality {

	public static void main(String[] args) {
		java.lang.String str1;
		java.lang.String str2;
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter first string");
		str1=ab.nextLine();
		
		System.out.println("Enter second string");
		str2=ab.nextLine();
		if(str1.equals(str2))
			System.out.print("equal string");
		else
			System.out.print("Unequal string");	}

}
