package thread;
//directly we use thread class without extends
public class ThreadEg2 {

	public static void main(String[] args) {
		Thread t=new Thread("Suvo");
		t.start();
		String s=t.getName();
		System.out.println(s);

	}}
