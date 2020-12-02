package part3;

import java.util.Scanner;

//Rachad Quintyne 217883463
public class PartThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
		
		//prompt user for x coordinate, y coordinate, slope, and slope-intercept and save it in scanner
		System.out.print("Enter the radius of the sphere: ");
		//save input into x
		int radius = scan.nextInt();
		
		//calculate area of sphere
		double area = 4*Math.PI*Math.pow(radius, 2);
		//calculate the volume of the sphere
		float fourBy3 = (float)4/3;
		double volume = (fourBy3*Math.PI)*Math.pow(radius, 3);
		
		// print out area and volume
		System.out.println("The area of the sphere is: " +  String.format("%.2f", area));
		System.out.print("The volume of the sphere is: " + String.format("%.2f", volume));
		
		
	}

}
