import java.io.*;
class choice
{
	char ch;
	int a,b;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public void calc()throws IOException
	{
	System.out.println("Enter nos");
	a=Integer.parseInt(br.readLine());
	b=Integer.parseInt(br.readLine());
	System.out.println("Enter choice");
	ch=(char)br.read();
		switch(ch)
		{
			case 'a':System.out.println(a+b);
			break;
			default:System.out.println("Invalid choice");
			break;
		}
	}
}
class select
{
	public static void main(String args[])throws IOException
	{
	choice e1=new choice();
	e1.calc();
	}
}
