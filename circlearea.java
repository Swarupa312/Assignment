import java.lang.*;
import java.io.*;
class circle
{
	int r;
	public final int p=3;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public void areacir()throws IOException
	{
	System.out.println("Enter radius:");
	r=Integer.parseInt(br.readLine());
	System.out.println("area is:"+Math.PI*r*r);
	System.out.println(p);
	}
}
class area 
{
	public static void main(String args[])throws IOException
	{
	circle a=new circle();
	a.areacir();
	}
}