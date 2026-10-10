abstract class shape{
	String color="red";
	abstract double area();
	void display() {
		System.out.println("color:"+color);
		
	}
}
class Circle extends Shape{
	double radius;
	Circle(double radius)
	{
		this.radius=radius;
	}
	double area() {
		return Math.PI*radius*radius;	
}
public class AbstractClass_Example {

	public static void main(String[] args) {
		Circle c=new Circle(12.50);
		System.out.println("Circle Area: "+c.area());
		c.display();

	}
}
}