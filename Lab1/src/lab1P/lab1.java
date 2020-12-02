package lab1P;
/**
 * 
 */

/**
 * @author rachad
 *
 */
//
import java.util.Scanner;
public class lab1 {
//Rachad Quintyne student number: 217883463
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1;
		double x2;
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Enter the value of a: ");
		double a = scan.nextDouble();
		
		System.out.print("Enter the value of b: ");
		double b = scan.nextDouble();
		
		System.out.print("Enter the value of c: ");
		double c = scan.nextDouble();
		
		double d = Math.pow(b, 2) - 4*a*c;
		x1 =(-b + Math.sqrt(d))/(2*a);
		
		x2 = (-b - Math.sqrt(d))/(2*a);
		System.out.println("x1 = " + x1  );
		System.out.print("x2 = " + x2 );
		


	}

}
