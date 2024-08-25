package constructordemo;

public class ThisKeywordConstructor 
{
	int id,m1,m2;
	public ThisKeywordConstructor(int id,int m1,int m2)
	{
		this.id=id;
		this.m1=m1;
		this.m2=m2;
	}
	public void calMarks()
	{
		int total=m1+m2;
		System.out.println("Id: "+id+" Total marks is: "+total);
	}
	public static void main(String[] args) 
	{
		ThisKeywordConstructor t = new ThisKeywordConstructor(1,99,98);
		ThisKeywordConstructor t1 = new ThisKeywordConstructor(2,90,98);
		t.calMarks();
		t1.calMarks();
		
	}

}
