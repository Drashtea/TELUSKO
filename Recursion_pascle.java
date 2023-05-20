import java.util.*;

public class Recursion_pascle {

	public static void main(String[] args) {
		
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		n=s.nextInt();
		Recursion(n);
		
	}
	public static void Recursion(int n)
	{
		for(int i=0;i<n;i++)
		{
		 for (int s=1; s<=n-i; s++)
		System.out.print(" ");
			for(int j=0;j<=i;j++)
			{
			System.out.print(pascal(i,j)+" ");
			}
			System.out.println("");
		}
	}
	public static int pascal(int i,int j)
	{
		if(j==0)
		{
			return 1;
		}
		else if(j==i)
		{
			return 1;
		}
		else
		{
			return pascal(i-1,j-1)+pascal(i-1,j);
		}

	}
	
}
