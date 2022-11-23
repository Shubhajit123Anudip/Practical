package thread.java;

public class Daemonthreadeg extends Thread {
   public void run() {
	   System.out.println("name:"+Thread.currentThread().getName());
	   System.out.println("Daemon :"+Thread.currentThread().isDaemon());
	   if(Thread.currentThread().isDaemon()) {
		   System.out.println("I am daemon thread");
	   }else {
	   System.out.println("I am user thread");}
   }
	public static void main(String[] args) {
		Daemonthreadeg t1=new Daemonthreadeg();
		Daemonthreadeg t2=new Daemonthreadeg();
        t1.start();
        t1.setDaemon(true);//we will throw exception
        t2.start();
	}

}
