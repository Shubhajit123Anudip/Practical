package thread;

public class ThreadExample2 extends Thread {
	@Override
	public void run() {
		for (int i=0;i<5;i++) {
	try{
	Thread.sleep(800);
	}catch(InterruptedException e) {
		System.out.println(e);
	}
	System.out.println(i);
	}}
public static void main(String[] args) {
		ThreadExample2 t=new ThreadExample2();
		ThreadExample2 t1=new ThreadExample2();
		ThreadExample2 t2=new ThreadExample2();
        /*t.start();
        t1.run();
        t2.run();
	}}*/
 t.start();
 try {
	 t.join();
 }catch(InterruptedException e) {
	 System.out.println(e);}
 t1.start();
 try {
	 t1.join();
 }catch(InterruptedException e) {
	 System.out.println(e);
}
 t2.start();
 }}