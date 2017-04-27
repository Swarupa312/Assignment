import java.io.*;
class divide
{
	int no;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public void calc()throws IOException	
	{
		System.out.println("Enter nos");
		no=Integer.parseInt(br.readLine());
		
		if(no%3==0 && no%5==0)
		{
			if(no%2==0)
			{
				System.out.println("Hello even");
			}
			else if(no%2!=0)
			{
				System.out.println("Hello odd");
			}
			else
			{
				System.out.println("Invalid");	
			}
		}
	}
}
class choices
{
	public static void main(String args[])throws IOException
	{
		divide e1=new divide();
		e1.calc();
	}
}