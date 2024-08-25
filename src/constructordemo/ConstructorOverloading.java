package constructordemo;

public class ConstructorOverloading 
{
	public ConstructorOverloading()
	{
		System.out.println("Defualt constructor...");
	}
	public ConstructorOverloading(int a)
	{
		System.out.println("1 Paramertrized constructor: "+a);
	}
	public ConstructorOverloading(int a,int b)
	{
		System.out.println("2 Paramertrized constructor: "+a+" "+b);
	}
	public ConstructorOverloading(float a,float b)
	{
		System.out.println("3 Paramertrized constructor: "+a+" "+b);
	}
	public ConstructorOverloading(double a,double b)
	{
		System.out.println("4 Paramertrized constructor: "+a+" "+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main mehtod...");
		ConstructorOverloading c = new ConstructorOverloading();
		ConstructorOverloading c1 = new ConstructorOverloading(10);
		ConstructorOverloading c2 = new ConstructorOverloading(20,30);
		ConstructorOverloading c3 = new ConstructorOverloading(1.2f,3.3f);
		ConstructorOverloading c4 = new ConstructorOverloading(5.50d,60.6d);
	}

}
