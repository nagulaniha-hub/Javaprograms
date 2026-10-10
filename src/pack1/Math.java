package pack1;

public class Math {
	public int a,b;
	public Math(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public void add() {
		System.out.println("Addition:"+(a+b));
	}
	public void mul() {
		System.out.println("Product:"+(a*b));
	}

}
