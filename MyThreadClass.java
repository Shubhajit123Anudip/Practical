package practical.java;
//with or without using synchronization  
class MyThreadClass {
//void print int(int num){//without synchronized method
	synchronized void print(int num) {//with synchronized method
		for(int i=0;i<=5;i++) {
			System.out.println(num*i);
			try {
				Thread.sleep(500);
				}catch (Exception e) {
					System.out.println(e);
			}
		}
	}
}
	class Thread1 extends Thread{
		MyThreadClass ws;
		
		void Thread2(MyThreadClass ws){
			this.ws=ws;
		}
		public void run() {
			ws.print(50);//50*1 50*2....
			
		}
	}
	class withoutSynchronization{
	public static void main(String[] args) {
		MyThreadClass obj=new MyThreadClass();
		Thread1 t1=new Thread1(obj);
		Thread2 t2=new Thread2(obj);
		t1.start();
		t2.start();
	}

}
