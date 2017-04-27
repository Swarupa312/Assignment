import java.io.*;
class fact
{
int a,f,ans;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public void calc()throws IOException
{
System.out.println("enter a no");
a=Integer.parseInt(br.readLine());
f=1;
for(int i=1;i<=a;i++)
{
f=f*i;
}
System.out.println(f);
}
}
class factorial
{
public static void main(String args[])throws IOException
{
fact f1=new fact();
f1.calc();
}
}