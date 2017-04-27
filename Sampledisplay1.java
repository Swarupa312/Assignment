import java.io.*;
class Sample
{
int a,b;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

public void add()throws IOException
{
System.out.println("enter nos");
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
int  c=a+b;
System.out.println(c);
}
}
class Sampledisplay
{
public static void main(String args[])throws IOException
{
Sample s=new Sample();
s.add();
}
}