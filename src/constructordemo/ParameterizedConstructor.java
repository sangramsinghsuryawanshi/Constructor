package constructordemo;

public class ParameterizedConstructor 
{
	public ParameterizedConstructor()
	{
		System.out.println("Default constructor");
	}
	public ParameterizedConstructor(int a)
	{
		System.out.println("Parameterize constructor Value is: "+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method..");
		ParameterizedConstructor p = new ParameterizedConstructor();
		ParameterizedConstructor p1 = new ParameterizedConstructor(10);
	}

}
