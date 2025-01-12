package constructordemo;

public class Constructor 
{
	public Constructor()
	{
		System.out.println("Default constructor");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main method..");
		Constructor c = new Constructor ();
	}

}
