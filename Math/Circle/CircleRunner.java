//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew 
//Date - 12/1/2020
//Class - PreAP Cmp Sci I
//Lab  - Circle

public class CircleRunner
{
	public static void main( String[] args )
   {
		Circle test = new Circle();
      test.setRadius(7.5);
      test.calculateArea();
      test.print();
      
      test.setRadius(10);
      test.calculateArea();
      test.print();
      
      test.setRadius(72.534);
      test.calculateArea();
      test.print();
      
      test.setRadius(55);
      test.calculateArea();
      test.print();
      
      test.setRadius(101);
      test.calculateArea();
      test.print();
      
      test.setRadius(99.952);
      test.calculateArea();
      test.print();
   }
}