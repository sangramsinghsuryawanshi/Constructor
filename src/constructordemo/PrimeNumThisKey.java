package constructordemo;

import java.util.Scanner;

public class PrimeNumThisKey 
{
	public PrimeNumThisKey()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter array element :");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		this.prime(a);
	}
	public void prime(int a[])
	{
		System.out.println("The given prime array element is: ");
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			for(int j=1;j<=a[i];j++)
			{
				if(a[i]%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.println(a[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumThisKey p = new PrimeNumThisKey();
	}

}
