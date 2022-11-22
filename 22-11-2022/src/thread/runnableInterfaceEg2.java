package thread;
//Thread (Runnable obj,String name)
public class runnableInterfaceEg2 implements Runnable {
	public void run() {
		System.out.println("Thread running");
	}
	public static void main(String[] args) {
	Runnable ri=new runnableInterfaceEg2();
	Thread t=new Thread(ri,"String Name");
	t.start();
    String s=t.getName();
    System.out.println(s);
	}}
