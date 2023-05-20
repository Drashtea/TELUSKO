import java.util.*;

public class Pascal_hashmaps {

	public static void main(String[] args) {
		int n;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter no of rows : ");
		n=scan.nextInt();
		pascalprint(n);
		
	}
	public static void pascalprint(int n)
	{
		HashMap<String,Integer> memo=new HashMap<>();
		
		for(int i=0;i<n;i++)
		{
			for (int s=1; s<=n-i; s++)
			System.out.print(" ");
			for(int j=0;j<=i;j++)
			{
				int val=pvalue(i,j,memo);
				System.out.print(val+" ");
			}
			System.out.println("");
		}
	}
	public static int pvalue(int r ,int c, HashMap<String,Integer> memo)
	{
		if(c==0||c==r)
		{
			return 1;
		}
		String key=r + "," +c;
		
		
		if(memo.containsKey(key))
		{
			return memo.get(key);
		}
		
		int lval=pvalue(r-1,c-1,memo);
		int rval=pvalue(r-1,c,memo);
		
		int val=lval+rval;
		memo.put(key,val);
		
		return val;
	}

}
