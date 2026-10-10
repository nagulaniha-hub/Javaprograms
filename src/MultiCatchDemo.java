
public class MultiCatchDemo {

	public static void main(String[] args) 
	{
		try
		{
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
			int res = n1 / n2;
			System.out.println("Result = "+res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero not allowed");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println("Require two numbers");
		}
		catch(NumberFormatException e)
		{
			System.err.println("Enter only numbers");
		}
		catch(RuntimeException e)
		{
			System.err.println("Runtime Exception");
		}
		
		

	}

}
