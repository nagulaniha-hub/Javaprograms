class Sample extends Thread{
	public Sample(String s) {
		super(s);
		start();
	}
	public void run()
	{
		for (int i=1;i<=10;i++)
		{
			System.out.println(getName()+" Count: "+i);
			}
	}
}
public class ThreadDemo {
	public static void main(String[] args) {
		Sample s1=new Sample("First");
		Sample s2=new Sample("Second");
		Sample s3=new Sample("Third");
		s1.start();
		s2.start();
		s3.start();
		
	}

}
