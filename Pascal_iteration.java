import java.util.Scanner;

public class Pascal_iteration {

	public static void main(String[] args) {
        int n;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter no of rows : ");
		n=scan.nextInt();
		pascalprint(n);
	}
	public static void pascalprint(int n)
	{
		int arr[][]=new int[n][n];
		
		for(int i=0;i<n;i++)
		{
			arr[i][0]=1;
		}
		
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
			}
		}
		
		for(int i=0;i<n;i++)
		{
			for (int s=1; s<=n-i; s++)
			System.out.print(" ");
			for(int j=0;j<=i;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
