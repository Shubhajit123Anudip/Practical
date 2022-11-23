package thread.java;
//directly we can use thread class without extends
//with & without set name we can name the thread
public class ThreadEg2 {
public void run() {
	System.out.println("Suvo");
}
	public static void main(String[] args) {
		Thread t=new Thread("Suvo");
		Thread t1=new Thread();
		t.start();
		t1.start();
		t1.setName("Anudip");
		System.out.println("Thread 0:"+t.getName());
		System.out.println("Thread 1:"+t1.getName());
	}

}
