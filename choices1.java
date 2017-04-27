import java.io.*;
class limit
{
	int no;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public void calc()throws IOException	
	{
		System.out.println("Enter nos");
		no=Integer.parseInt(br.readLine());
		if(no<=100)
		{
			if(no%7==0 && no%8==0)
			{
				System.out.println("Valid");
			}
		}
		else
		{
			System.out.println("Invalid");
		}
	}
}
class choices1
{
	public static void main(String args[])throws IOException
	{
		limit e1=new limit();
		e1.calc();
	}
}