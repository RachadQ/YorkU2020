package Assignment2p1;


/**
 * @author Rachad Quintyne student number: 217883463
 *
 */

import java.util.Random;


public class part1 {

	public class player
	{
		Random rand = new Random(); 
		boolean isTurn = false;
		int playerPos;
		int total;
		
		public player(int playerPos)
		{
			this.playerPos = playerPos;
			total = 0;
			isTurn = false;
		}
		
		public void rollDice()
		{
			//roll a dice between 1 = 6
			int rand1 = rand.nextInt(5)+1;
			//check if player total is over 15
			if(total < 15)
			{
				
			}
			
			System.out.println(rand1);
		}
		
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		player player1 = new player(1);
		player1.rollDice();
		
		
		
	}


	

}
