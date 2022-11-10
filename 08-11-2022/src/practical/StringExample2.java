package practical;

public class StringExample2 {
	public void show() {//method 1
		char[] arr= {'j','a','v','a'};//char type array
		String s = new string(arr);
		System.out.println("value is:"+s);
		System.out.println(arr);	
		}
public void myFunction() {//method 2
	String m1="suvo";
	String m2=new string(m1);
	System.out.println(m2);
}
	public static void main(String[] args) {
		StringExample2 s =new StringExample2();
		s.show();
		s.myFunction();

	}

}
