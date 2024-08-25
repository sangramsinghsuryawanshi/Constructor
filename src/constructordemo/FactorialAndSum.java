package constructordemo;

public class FactorialAndSum 
{
	public FactorialAndSum(int a)
	{
		this.factorial(a);
	}
	public void factorial(int a)
	{
		int fact=1,sum=0,rem=0;
		System.out.print("Given factorial is: ");
		for(int i=1;i<=a;i++)
		{
			fact*=i;
		}
		for(int t=fact;t!=0;t=t/10)
		{
			rem=t%10;
			sum+=rem;
		}
		System.out.print(fact);
		System.out.println("\nSum of digit: "+sum);
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FactorialAndSum f = new FactorialAndSum(5);
	}

}
