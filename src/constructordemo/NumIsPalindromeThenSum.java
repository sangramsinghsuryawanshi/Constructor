package constructordemo;

import java.util.Scanner;

public class NumIsPalindromeThenSum 
{
	public NumIsPalindromeThenSum(int n)
	{
		int rev=0,rem=0,sum=0;
		for(int temp=n;temp!=0;temp=temp/10)
		{
			rem=temp%10;
			sum+=rem;
			rev=(rev*10)+rem;
		}
		if(rev==n)
		{
			System.out.println("given number is palindrome ");
		}
		else
		{
			System.out.println("given number is not palindrome ");
		}
		if(rev!=n)
		{
			System.out.println("sum of non palindrome digit is: "+sum);
		}
		else
		{
			System.out.println("sum of palindrome digit is: "+sum);
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any positive number: ");
		int n = sc.nextInt();
		NumIsPalindromeThenSum p = new NumIsPalindromeThenSum(n);
	}

}
