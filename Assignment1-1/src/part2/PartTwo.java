/**
 * 
 */
package part2;
//Rachad Quintyne 217883463
import java.util.Scanner;
/**
 * @author rachad
 *
 */
public class PartTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create Scanner
		Scanner scan = new Scanner(System.in);
		//prompt user for input
		System.out.println("Enter greeting message");
		String message = scan.nextLine();
		
		// make space and print message
		System.out.println();
		System.out.println(message);
		
		//make more spaces
		System.out.println();
		System.out.println();
		//make diamond
		System.out.println("  *\n ***\n*****\n ***\n  *");
		System.out.println();
		int number = 0;
		number++;
		++number;
		number++;
		++number;
		number++;
		++number;
		number++;
		//make rectangle
		System.out.println("*********\n*\t*\n*\t*\n*\t*\n*\t" + number + "\t*");
		number++;
		System.out.println("*\t" + number + "\t*" );
		System.out.println("*\t*");
		number+=1;
		number+=2;
		number+=3;
		System.out.println("*\t"+ number + "\t*");
		
		number++;
		++number;
		System.out.println("*\t"+ number + "\t*");
		System.out.println("*\t*\n*\t*\n*\t*\n*********\n");
		
		System.out.println();
		//make diamond line
		System.out.println("    *");
		System.out.println("  *   *");
		System.out.println(" *     *");
		System.out.println("*\t*");
		System.out.println(" *     *");
		System.out.println("  *   *");
		System.out.println("    *");
	
		System.out.println();
		
		
		
		
		
		
		System.out.print("'\\ \'Enjoy\' \\\\\\\\\\");
	}

}
