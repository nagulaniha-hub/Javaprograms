class A{
	static int n=0;
	{
		n++;
	}
	static int getInstances() {
		return n;
		
	}
}
public class Instancecount {
	public static void main(String[] args) {
		new A();
		new A();
		new A();
		new A();
		new A();
		new A();
		new A();
		new A();
		new A();
		new A();
		new A();
		new A();
		new A();
		new A();
		new A();
		new A();
		new A();
		new A();
		System.out.println("No of Instances: "+A.getInstances());
		
	}

}
