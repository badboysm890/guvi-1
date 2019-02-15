import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner input=new Scanner(System.in);
	int num; int expo;
	num=input.nextInt();
	expo=input.nextInt();
	long res = 1;

        while (expo != 0)
        {
            res *=num ;
            --expo;
        }

        System.out.println( + res);
    }
	
}
