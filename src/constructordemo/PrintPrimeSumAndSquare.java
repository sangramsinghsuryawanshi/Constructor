package constructordemo;

import java.util.Scanner;

public class PrintPrimeSumAndSquare 
{
	public PrintPrimeSumAndSquare(int n)
	{
		int sum=0;
		System.out.print("\nSquare of Prime number is: ");
		for(int i=1;i<=n;i++)
		{
			int c=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				int fact=i*i;
				System.out.print(fact+" ");
				sum+=fact;
			}
		}
		System.out.print("\nSum of all square prime number is: "+sum);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = sc.nextInt();
		PrintPrimeSumAndSquare p = new PrintPrimeSumAndSquare(n);
	}

}
