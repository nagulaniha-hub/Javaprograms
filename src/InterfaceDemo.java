interface Shape{
	void draw();
	default void fill()
	{
		System.out.println("Filling");
	}
}
class Circle implements Shape{
	public void draw()
	{
		System.out.println("Drawing a circle");
	}
}
public class InterfaceDemo {
	public static void main(String[] args) {
		Shape s= new Circle();
		s.draw();
		s.fill();
	}

}
