import java.io.*;
import java.lang.*;
class choice
{
	char ch;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public void calc()throws IOException
	{
	System.out.println("Enter character");
	ch=(char)br.read();
	if(Character.isLetter(ch))
	System.out.println("character");
	else if(Character.isDigit(ch))
	System.out.println("Digit");
	else
	System.out.println("Symbol");
	}
}
class selectchar
{
	public static void main(String args[])throws IOException
	{
	choice e1=new choice();
	e1.calc();
	}
}
