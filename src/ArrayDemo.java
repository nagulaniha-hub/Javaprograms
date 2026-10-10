import java.util.Scanner;
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size:");
		int s=sc.nextInt();
		int Arr[]=new int[s];
		for(int i=0;i<Arr.length;i++)
		{
			System.out.println("Arr["+i+"]");
			Arr[i]=sc.nextInt();
		}
		for(int c:Arr)
		{
			System.out.println(c+" ");
		}

	}

}
