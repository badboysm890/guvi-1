
import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
int a,b,c;
Scanner input=new Scanner (System.in);
System.out.println("input the numbers");
a=input.nextInt();
b=input.nextInt();
c=input.nextInt();
if((a>=b) && (a>=c))
{
	System.out.println(+a);
	
}
else if((b<=a)&&(b>=c))
{	System.out.println(+b);
}else{
System.out.println(+c);
}
}
}
