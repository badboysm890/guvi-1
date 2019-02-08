import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int year;
    	Scanner input = new Scanner(System.in);
    	year = input.nextInt();
        boolean Leap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    Leap = true;
                else
                    Leap = false;
        }
            else
                Leap = true;
        }
        else {
            Leap = false;
        }

        if(Leap==true)
            System.out.println("yes");
        else
            System.out.println("no");
    	}
		}	
		
		
