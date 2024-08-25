package constructordemo;

public class EvenOddThis 
{
	public EvenOddThis()
	{
		this.even();
	}
	public void even()
	{
		System.out.println("even number: ");
		for(int i=1;i<=50;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		System.out.println("Default constructor: ");
		this.odd();
	}
	public void odd()
	{
		System.out.println("odd number: ");
		for(int i=0;i<=50;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
		System.out.println("odd this method: ");
	}
	public EvenOddThis(int a,int b)
	{
		System.out.println("values: "+a+" "+b);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		EvenOddThis e = new EvenOddThis();
	}

}
