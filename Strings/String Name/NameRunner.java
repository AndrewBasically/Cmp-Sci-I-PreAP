//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew 
//Date - 1/11/2021
//Class - PreAP Cmp Sci I
//Lab  - String Name

import static java.lang.System.*;

public class NameRunner
{
	public static void main ( String[] args )
	{
		Name person = new Name("Sally Baker");
		System.out.println(person.getFirst());
		System.out.println(person.getLast());
		System.out.println(person + "\n");

		person.setName("John Doe");
		System.out.println(person.getFirst());
		System.out.println(person.getLast());
		System.out.println(person + "\n");

		person.setName("Sammy Lammy");
		System.out.println(person.getFirst());
		System.out.println(person.getLast());
		System.out.println(person + "\n");

		person.setName("Benny Programmer");
		System.out.println(person.getFirst());
		System.out.println(person.getLast());
		System.out.println(person + "\n");

		person.setName("Sandy Painter");
		System.out.println(person.getFirst());
		System.out.println(person.getLast());
		System.out.println(person);
	}
}