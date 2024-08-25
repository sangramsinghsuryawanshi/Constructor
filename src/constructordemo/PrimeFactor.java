package constructordemo;

import java.util.Scanner;

public class PrimeFactor 
{
	public PrimeFactor(int n)
	{
		int max=0;
		int sum=0,rem=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				//System.out.println(i);
				int c=0;
				for(int j=1;j<=i;j++)
				{
					if(i%j==0)
					{
						//System.out.println(j);
						c++;
					}
				}
				if(c==2)
				{
					if(i>max)
					{
						max=i;
					}
				}
			}
		}
		System.out.println("largest prime factor is: "+max);
		for(int temp=max;temp!=0;temp=temp/10)
		{
			rem=temp%10;
			sum+=rem;
		}
		System.out.println("Largest prime factor sum of digit is: "+sum);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any positive number: ");
		int n = sc.nextInt();
		PrimeFactor p = new PrimeFactor(n);
	}

}
