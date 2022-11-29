package practical.java;

public class Deadlock {

	public static void main(String[] args) {
		final String Source1="Suvo";
		final String Source2="Subham";
		Thread t1=new Thread() {
			public void run() {
				synchronized(Source1) {
					System.out.println("t1 lock Source1:");
					try {
						Thread.sleep(200);
					}catch(Exception e) {
					}
					synchronized(Source2) {
				System.out.println("t1 lock Source2:");
					}
				}
			}
			};
		Thread t2=new Thread() {
			public void run() {
				synchronized(Source2) {
			    System.out.println("t1 lock source2:");
			    try {
			    	Thread.sleep(200);
			    }catch(Exception e) {
			     }
			    synchronized(Source2) {
			    System.out.println("t2 lock Source1:");
			    
				}
			}
		}

	};
t1.start();
t2.start();
}}
