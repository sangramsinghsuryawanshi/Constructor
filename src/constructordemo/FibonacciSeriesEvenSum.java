package constructordemo;

public class FibonacciSeriesEvenSum 
{
	int a,b,sum;
	public FibonacciSeriesEvenSum(int a,int b,int sum)
	{
		int n=15;
		this.a=a;
		this.b=b;
		this.sum=sum;
		int sum1=0;
		System.out.println("Fibonacci series up to given number");
		for(int i=0;i<=n;i++)
		{
			System.out.println(a);
			sum=a+b;
			a=b;
			b=sum;
			if(a%2==0)
			{
				sum1+=a;
				System.out.println("\nEven: "+a);
			}
		}
		System.out.println("Sum of even value from fibonacci series: "+sum1);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FibonacciSeriesEvenSum f = new FibonacciSeriesEvenSum(0,1,0);
		
	}

}
