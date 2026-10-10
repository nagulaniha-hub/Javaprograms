import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size:");
		int s=sc.nextInt();
		int sum=0;
		int Arr[]=new int[s];
		for(int i=0;i<Arr.length;i++)
		{
			System.out.println("Arr["+i+"]:");
			Arr[i]=sc.nextInt();
		}
		for(int c:Arr)
		{
			System.out.println(c+" ");
			sum+=c;
		}
		System.out.println("\n5Sum of array elements:"+sum);

	}

}