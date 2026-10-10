class Queue{
	int n;
	boolean flag=false;
	synchronized int get() {
		while(!flag)
			try {
				wait();
				
			}
		catch(Exception e) {
			System.out.println(e);
		}
		flag=false;
		System.out.println("Get :"+n);
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e);
			}
		notify();
		return n;
		
		}
	synchronized void put(int n) {
		while(flag)
			try {
				wait();
			}
		catch(Exception e) {
			System.out.println(e);
		}
		this.n=n;
		flag=true;
		System.out.println("Put:"+n);
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		notify();
		
	}
}
class Producer extends Thread{
	Queue q;
	Producer(Queue q){
		this.q=q;
		start();
		
	}
	public void run() {
		int n=0;
		while(true) {
			q.put(n++);
		}
	}
}
class consumer extends Thread{
	Queue q;
	consumer(Queue q){
		this.q=q;
	start();

	}
	public void run() {
		while(true) {
			q.get();
		}
	}
}
public class PCDemo {
	public static void main(String[] args) {
		Queue q=new Queue();
		new Producer(q);
		new consumer(q);
	}

}
