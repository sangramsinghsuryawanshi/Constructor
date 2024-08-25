package constructordemo;

import java.util.Scanner;

public class PrimeNumStoreInAnotherArr 
{
	public PrimeNumStoreInAnotherArr(int a[])
	{
		int c=0;
		System.out.println("Given array element is :");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
			c++;
		}
		this.anotherArr(c,a);
	}
	public void anotherArr(int c,int[] a)
	{
		int ind=0;
		int b[] = new int[c];
		for(int i=0;i<a.length;i++)
		{
			b[ind++]=a[i];
		}
		System.out.println("Given 2 reverse array element is :");
		for(int i=b.length-1;i>=0;i--)
		{
			System.out.println(b[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter array element :");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		PrimeNumStoreInAnotherArr p = new PrimeNumStoreInAnotherArr(a);
	}

}
