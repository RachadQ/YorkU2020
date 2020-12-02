/**
 * 
 */
package pt2;
import java.util.Scanner;
/**
 * @author rachad Quintyne 217883463
 *
 */
public class p2Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		final int max = 10;
		int count = 0;
		int [] temp = new int[10];
		while(count < max)
		{
			System.out.println( "please enter column to put queen");
			int tempInt = scan.nextInt(); 
			
				if(tempInt >= 0 && tempInt < 10)
				{
			//populate array
			temp[count] = tempInt;
			
			//increase the amount
			count++;
				}
			
		}
		
		char board[][] = new char[10][10];
		 for(int i = 0 ; i < 10 ;i++)
		 {
			 for(int j = 0 ; j < 10 ;j++)
			 {
				 if(temp[i] != j)
				 {
					 board[i][j]='.';
				 }
				 else
					 board[i][j]='Q';
			
				
			 }
			 System.out.println();
		 }
		
		
			 
	 		
			
	}

}
