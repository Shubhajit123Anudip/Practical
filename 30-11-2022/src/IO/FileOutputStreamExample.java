package IO;
import java.io.FileOutputStream;
public class FileOutputStreamExample {
	public static void main(String[] args) {
		try {
			FileOutputStream f=new FileOutputStream("D:\\text.txt");//destination
			String s="Welcome to Shubhajit";
			byte b[]=s.getBytes();//converting string into byte array
			f.write(b);
			f.close();
			System.out.println("Done");
		}catch(Exception e) {
	 System.out.println(e);
	}
	}
}
