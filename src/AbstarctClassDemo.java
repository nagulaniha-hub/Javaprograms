interface Shape{
	abstract double area();
}
 class Rectangle implements Shape{
	double l,b;
	Rectangle(double l,double b){
		this.l=1;
		this.b=b;
		
	}
	public double area() {
		return l*b;
	}
class Circle implements Shape{
	double r;
	Circle(double r){
		this.r=r;
		
	}
	public double area() {
		return Math.PI*r*r;
	}
}

public class AbstractClassDemo {
	public static void main(String[] args) {
		Shape s;
		s=new Rectangle(12,5);
		System.out.println("Area of Rectangle: "+s.area());
		s=new Circle(12.5);
		System.out.println("Area of Circle: "+s.area());
	}
 }
 }
 
