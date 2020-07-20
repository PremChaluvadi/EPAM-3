package mavendesignprinciples;

public class Operations 
{
	static int a;
	static int b;
	public void setData(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void add()
	{
		int c=a+b;
		System.out.println("Addition of "+a+" and "+b+" is "+c);
	}
	public void subtract()
	{
		int c=a-b;
		System.out.println("Subtraction of "+b+" from "+a+" is "+c);
	}
	public void multiply()
	{
		int c=a*b;
		System.out.println("Multiplication of "+a+" and "+b+" is "+c);
	}
	public void divide()
	{
		if(b==0)
		{
			System.out.println("Denominator is zero.Enter a valid value.");
		}
		else
		{
			double c=(1.0*a)/b;
			System.out.println("Addition of "+a+" and "+b+" is "+c);
		}
	}
}