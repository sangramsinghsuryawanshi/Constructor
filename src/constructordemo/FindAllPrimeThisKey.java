package constructordemo;

import java.util.Scanner;

public class FindAllPrimeThisKey 
{
	public FindAllPrimeThisKey()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int n1 = sc.nextInt();
		int n2= sc.nextInt();
		this.allPrime(n1,n2);
	}
	public void allPrime(int n1,int n2)
	{
		System.out.println("Given prime number between two number: ");
		for(int i=n1;i<=n2;i++)
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
				System.out.println(i+" ");
			}
		}
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FindAllPrimeThisKey f = new FindAllPrimeThisKey();
	}

}
