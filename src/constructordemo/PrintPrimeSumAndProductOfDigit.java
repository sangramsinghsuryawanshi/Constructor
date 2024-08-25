package constructordemo;

import java.util.Scanner;

public class PrintPrimeSumAndProductOfDigit 
{
	public PrintPrimeSumAndProductOfDigit(int n,int n1)
	{
		int sum=0;
		System.out.println("Square of Prime number is: ");
		for(int i=n;i<=n1;i++)
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
				sum+=i;
				System.out.print(i+" ");
				int rev=0,rem=0,p=1;
				for(int temp=i;temp!=0;temp=temp/10)
				{
					rem=temp%10;
					p*=rem;
				}
				System.out.println(" <--Product: "+p);
			}
		}
		System.out.print("\nSum of all square prime number is: "+sum);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two number: ");
		int n = sc.nextInt();
		int n1 = sc.nextInt();
		PrintPrimeSumAndProductOfDigit p = new PrintPrimeSumAndProductOfDigit(n,n1);
	}

}

	