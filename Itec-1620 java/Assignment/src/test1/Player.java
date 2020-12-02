/**
 * 
 */
package test1;

import java.util.Random;

/**
 * @author rachad Quintyne student number: 217883463
 *
 */
public class Player {

	
		Random rand = new Random(); 
		boolean isTurn = false;
		int playerPos;
		int total;
		int rank;
		
		public Player(int playerPos)
		{
			this.playerPos = playerPos;
			total = 0;
			isTurn = false;
		}
		
		public void rollDice()
		{
			//roll a dice between 1 = 6
			int rand1 = rand.nextInt(6)+1;
			int rand2 = rand.nextInt(6)+1;
			total += rand1 +rand2;
			System.out.println("player " + playerPos +" rolls " +rand1 + " and a " + rand2);
			System.out.println("player " + playerPos + " now has " + total );
			//check if player total is over 15
			if(rand1 == rand2)
			{
				System.out.println("player " + playerPos + " Rolled a double so roll again"  );
				 rand1 = rand.nextInt(6)+1;
				 rand2 = rand.nextInt(6)+1;
				 total += rand1 + rand2;
				 System.out.println("player " + playerPos +" rolls " +rand1 + " and a " + rand2);
				 System.out.println("player " + playerPos + " now has " + total );
			}
			//print out output
			
			
			
		}
		
}
