package thread;

class ThreadExample extends Thread {
public void run() {
	System.out.println("I am thread....thread is running");
}
	public static void main(String[] args) {
		ThreadExample t=new ThreadExample();
		t.start();
		t.setName("Suvo");
        String s=t.getName();
        System.out.println(s);
	}

}
