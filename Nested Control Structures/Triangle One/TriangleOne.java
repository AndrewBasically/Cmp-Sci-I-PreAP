//(c) A+ Computer Science
// www.apluscompsci.com

//Name - Andrew  
//Date - 3/31/2021
//Class - PreAP Cmp Sci I
//Lab  - Nested Loops Triangle Letters

import static java.lang.System.*; 
import java.util.Scanner;

public class TriangleOne
{
   //this lab is setup with a single static method
   //there are no instance variables or additional methods / constructors

	public static String createTriangle( String let, int size)
	{
		String output="";
      for (int i = 1; i <= size; i++)
      {
         for(int j = 1; j <= i; j++)
         {
            output += let + "";
         };
         output += "\n";
      };
		return output;
	}
}