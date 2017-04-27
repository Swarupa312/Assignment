import java.io.*;
class copyconst
{
   int n;
   String name1;
 
	public copyconst(int a, String name)
	{
		n=a;
		name1=name;
	}
	public copyconst(copyconst c)// 1) to copy the contents of the former constructor
	{
		n=c.n;
		name1=c.name1;
	}
	public copyconst()
	{
	}
	 
	public void display()
	{
		System.out.println(n);
		System.out.println(name1);
	}
}
class student
{
	public static void main(String args[])
	{
		copyconst c1=new copyconst(10,"ABC");
		copyconst c2=new copyconst(c1);
		copyconst c3=new copyconst();
		c3.n=c1.n;
		c3.name1=c1.name1;
		c1.display();
		c2.display();
		c3.display();
	}
}

