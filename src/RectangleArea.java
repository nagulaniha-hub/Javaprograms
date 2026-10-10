import java.util.Scanner;
class Rectangle{
	double length,breadth;
	Rectangle(double length,double breadth){
		this.length=length;
		this.breadth=breadth;
	}
	double area() {
		return length *breadth;
		
	}
}
public class RectangleArea {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length & breadth : ");
		double l=sc.nextDouble();
		double b=sc.nextDouble();
		Rectangle r=new Rectangle(l,b);
		System.out.println("Area of Rectangle: "+r.area());
		sc.close();
	}

}
