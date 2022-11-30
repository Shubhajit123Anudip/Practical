package IO;
import java.io.FileInputStream;
//read single character
class SinglecharFIS {
	public static void main(String[] args) {
		try {
			FileInputStream f=new FileInputStream("E:\\test1.txt");//destination
		int i=0;
		while((i=f.read())!=-1) {
			System.out.println((char)i);
		}
		f.close();
		}catch(Exception e) {
		System.out.println(e);
		}
	}
}
