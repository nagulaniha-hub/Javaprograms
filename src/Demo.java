//1.defining an interface
interface Drawable{
	int MAX_SIZE=1000;
	void draw();
	void resize(int factor);
	default void describe() {
		System.out.println("Iam a drawable shape");
	}
	static Drawable createDefault() {
		// TODO Auto-generated method stub
		return null;
	}

}
//2.Implementing an interface
class Circle2 implements Drawable{
	@Override 
	public void draw() {
		System.out.println("Drawing a circle");
	}

	@Override
	public void resize(int factor) {
		System.out.println("Resizing circle by "+factor);
	}

}
