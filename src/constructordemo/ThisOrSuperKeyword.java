package constructordemo;

class consturtor1
{
	int id,salary;
	String name="sangram";
	public consturtor1(int id,int salary,String name)
	{
		this.id=id;
		this.salary=salary;
		this.name=name;
		System.out.println("Class consturtor1 executed...");
	}
}
class constructor2 extends consturtor1
{
	int bonus;
	constructor2(int id,int salary,String name,int bonus)
	{
		super(id,salary,name);
		this.bonus=bonus;
		System.out.println("Class consturtor2 executed...");
	}
	void constructor21()
	{
		System.out.println(id);
		System.out.println(salary);
		System.out.println(name);
		System.out.println(bonus);
		System.out.println("Class consturtor2 method constructor21 executed...");
	}
}
public class ThisOrSuperKeyword 
{

	public static void main(String[] args)
	{
		constructor2 c = new constructor2(1,90000,"sangram",50000);
		c.constructor21();
		System.out.println("Main method..");
	}

}
