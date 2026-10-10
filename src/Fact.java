import java.util.Scanner;
public class Fact {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		long f=1;
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println("Factorial of "+n+" is: "+f);
	}
}