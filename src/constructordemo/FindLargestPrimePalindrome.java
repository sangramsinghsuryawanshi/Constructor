package constructordemo;

import java.util.Scanner;

public class FindLargestPrimePalindrome 
{
	public FindLargestPrimePalindrome(int a,int b)
	{
		int max=0,smax=0;
		System.out.println("Prime palindrome number is: ");
		for(int i=a;i<=b;i++)
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
				//System.out.println(i+" ");
				int rev=0,rem=0;
				for(int temp=i;temp!=0;temp=temp/10)
				{
					rem=temp%10;
					rev=(rev*10)+rem;
				}
				if(rev==i)
				{
					if(rev>max)
					{
						max=rev;
						System.out.print(max+" ");
						if(smax<max)
						{
							smax=max;
						}
					}
				}
			}
		}
		System.out.println(smax);
		int rev=0,rem=0,p=1;
		for(int temp=smax;temp!=0;temp=temp/10)
		{
			rem=temp%10;
			p*=rem;
		}
		System.out.println("Prime palindrome max number digit product is: "+p);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two values :");
		int a = sc.nextInt();
		int b= sc.nextInt();
		FindLargestPrimePalindrome f = new FindLargestPrimePalindrome(a,b);
	}

}
