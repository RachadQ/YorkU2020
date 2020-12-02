/**
 * 
 */
package test2;

/**
 * @author rachad Quintyne student number: 217883463
 *
 */
import java.util.Scanner;
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//create default constructor
		Circle c1 = new Circle();
		System.out.println("The first circle is " + c1.GetColour() +" and has radius of " + c1.GetRadius() +" area of "+ String.format("%.4f", c1.CalculateArea()) + " and perimeter of " + String.format("%.4f", c1.GetPerimeter() ) );
		System.out.println();
		//prompt user for colour,radius and
		System.out.println("Please enter the radius for the second circle:");
		double nr= scan.nextDouble();
		while(nr <=0 )
		{
			System.out.println("Please enter a postive value for the radius for the second circle:");
			//assign the new radius
			nr = scan.nextDouble();
			
		}
		
		
		System.out.println("Please enter color for the second circle:");
		String colour = scan.next();
		
		Circle c2 = new Circle(nr,colour);
		
		
		System.out.println("The Second circle is " + c2.GetColour() +" and has radius of " + c2.GetRadius() +", area of "+ String.format("%.4f", c2.CalculateArea()) + " and perimeter of " + String.format("%.4f", c2.GetPerimeter() ) );
		
		System.out.println();
		
		System.out.println("Please enter the new radius for the second circle:");
		double nr2 = scan.nextDouble();
		
		while(nr2 <=0 )
		{
			System.out.println("Please enter a postive value for the new radius for the second circle:");
			//assign the new radius
			nr2 = scan.nextDouble();
		}
		c2.SetRadius(nr2);
		System.out.println("The radius of the " + c2.GetColour() +" became " + c2.GetRadius() +", it's area now is "+ String.format("%.4f", c2.CalculateArea()) + " and it's perimeter is now " + String.format("%.4f", c2.GetPerimeter() ) );
		scan.close();
	}

}
