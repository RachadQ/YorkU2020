/**
Rachad Quintyne 217883463
 * 
 */
package part1;
import java.util.Scanner;
import java.lang.Math;
/**
 * @author rachad
 *
 */
public class partOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//prompt user for x coordinate, y coordinate, slope, and slope-intercept and save it in scanner
		System.out.print("Enter the x coordinate of point A: ");
		//save input into x
		int x = scan.nextInt();
		System.out.print("Enter the y coordinate of point A: ");	
		//save input into y
		int y = scan.nextInt();
		System.out.print("Enter the slope of the line: ");
		//save input into slope
		int slope = scan.nextInt();
		System.out.print("Enter the slope-intercept of the line: ");
		// save input into intercept
		int intercept = scan.nextInt();
		
		//get line equation
		 float le = (float)(slope * x) + intercept;
		//make space
		float sOfp = (float)-1/slope;
		float siOfpl = y - (sOfp * x);
		//get x and y  intersection point
		float x1 =  (siOfpl - intercept) / (slope-sOfp);
		float y1 = (slope * x1) + intercept;
		
		//get power of x and y
		float xPow = (float) Math.pow(x-x1,2);
		float yPow = (float) Math.pow(y-y1,2);
		
		// get distance
		float distance = (float)Math.sqrt(xPow+yPow);
		
		System.out.println();
		System.out.println("the slope of the perpendicular line is: " + sOfp);
		System.out.println("the slope intercept of the perpendicular line is: " + siOfpl);
		
		
		//make space
		System.out.println();
		System.out.println("the corrdinates of the intersection point are x = " + x1 + " and " + y1   );
		
		
		//make space
		System.out.println();
		System.out.println("the distance from the point A to the line is: " + distance + "!!");
		
		
	}

}
