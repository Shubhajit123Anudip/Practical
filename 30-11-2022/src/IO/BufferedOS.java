package IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOS {

	public static void main(String[] args) {
		try {
			FileOutputStream f=new FileOutputStream("D:\\test.txt");//destination
		    BufferedOutputStream b=new BufferedOutputStream(f);
		    String s="Welcome to Coding World";
		    byte b1[]=s.getBytes();//converting string into byte array
		    f.write(b1);
		    f.close();
		    System.out.println("Done");}
		catch(Exception e) {
	     System.out.println(e);	
		}
	}
}
