import java.io.*;
import java.util.*;
import java.lang.*;
class Interest
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int p,n,r,s;
public void simpleinterest()throws IOException
{
System.out.println("Enter priciple:");
p=Integer.parseInt(br.readLine());
System.out.println("Enter no of terms:");
n=Integer.parseInt(br.readLine());
System.out.println("Enter rate:");
r=Integer.parseInt(br.readLine());
s=p*n*r/100;
System.out.println(s);
}
}
class SimpleInt
{
public static void main(String args[])throws IOException
{
 Interest si=new  Interest();
si.simpleinterest();
}
}