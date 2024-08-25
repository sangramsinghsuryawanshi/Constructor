package constructordemo;

public class PrefectNum 
{

	public PrefectNum(int a)
	{
		this.factorial(a);
	}
	public void factorial(int a)
	{
		int fact=1,sum=0,rem=0;
		System.out.print("Given perfect number divisor  is: ");
		for(int i=1;i<a;i++)
		{
			if(a%i==0)
			{
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println("\nSum of digit: "+sum);
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		PrefectNum f = new PrefectNum(6);
	}

}