//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew 
//Date - 1/11/2021
//Class - PreAP Cmp Sci I
//Lab  - String Name

import static java.lang.System.*;

public class Name
{
	private String name;

	public Name()
	{
      name = "";
	}

	public Name(String s)
	{
      setName(s);
	}

   public void setName(String s)
   {
      name = s;
   }

	public String getFirst()
	{
		return (name.substring(0,name.indexOf(" ")));
	}

	public String getLast()
	{
		return (name.substring(name.indexOf(" ") + 1, name.length()));
	}

 	public String toString()
 	{
 		return name;
	}
}