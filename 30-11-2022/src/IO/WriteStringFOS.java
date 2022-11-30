package IO;
//write byte to string using FOS
import java.io.FileOutputStream;
public class WriteStringFOS {
public static void main(String[] args) {
		try {
			//write Byte to string
			FileOutputStream f=new FileOutputStream("D:\\test.txt");//destination
			f.write(65);
			f.close();
			System.out.println("Done");
		}catch(Exception e) {
		System.out.println(e);
		}
	}
}
