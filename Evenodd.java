import java.io.*;
class evenodd
{
int no;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public void calc()throws IOException
{
System.out.println("enter a no");
no=Integer.parseInt(br.readLine());
if(no%2==0)
System.out.println("even");
else
System.out.println("odd");
}
}
class Evenodd1
{
public static void main(String args[])throws IOException
{
evenodd e1=new evenodd();
e1.calc();
}
}