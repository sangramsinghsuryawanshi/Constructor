package constructordemo;

import java.util.Scanner;

public class GreatestCommonDivisorOfTwoNum 
{
	public GreatestCommonDivisorOfTwoNum(int n,int n1)
	{
		int i=1,j=1;int x=0,y=0;
		System.out.print("Divisor of "+n+" is: ");
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
				x++;
			}
		}
		int[] a=new int[x];x=0;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
			a[x++]=i;	
			}
		}
		System.out.print("\nDivisor of "+n1+" is: ");
		for(j=1;j<=n1;j++)
		{
			if(n1%j==0)
			{
				System.out.print(j+" ");
				y++;
			}
		}
		int[] b=new int[y];y=0;
		for(j=1;j<=n1;j++)
		{
			if(n1%j==0)
			{
				b[y++]=j;
			}
		}
		int max=0;
		System.out.print("\nGratest Common diviosr is: ");
		for(int k=0;k<a.length;k++)
		{
			for(int y1=0;y1<b.length;y1++)
			{
				if(a[k]==b[y1])
				{
					if(a[k]>max)
					{
						max=a[k];
					}
				}
			}
		}
		System.out.print(max);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two number: ");
		int n = sc.nextInt();
		int n1 = sc.nextInt();
		GreatestCommonDivisorOfTwoNum g = new GreatestCommonDivisorOfTwoNum(n,n1);
	}

}
