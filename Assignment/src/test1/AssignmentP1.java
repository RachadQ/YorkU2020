/**
 * 
 */
package test1;

import java.util.Random;



import java.util.ArrayList;
import java.util.List;

/**
 * @author Rachad Quintyne student number: 217883463
 *
 */
public class AssignmentP1 {

	/**
	 * @param args
	 */



	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Player player1 = new Player(1);
		Player player2 = new Player(2);
		Player player3 = new Player(3);
	
	
		out:
		
		// check if player points is over 15
		do
		{
			//roll dices
			player1.rollDice();
			player2.rollDice();
			player3.rollDice();
			
			
			//break out the loop
			if(player1.total >= 15 || player2.total >=15 || player3.total >=15)
			{
				//if tie reset total and go back to loop
				if(player1.total == player2.total||player2.total == player3.total|| player3.total == player1.total)
				{
					player1.total = 0;
					player2.total = 0;
					player3.total = 0;
					continue out;
					
				}
				break;
			}
		}
		while(player1.total <= 15 || player2.total <=15 || player3.total <=15);
		
		//get winners
		Player winner1 = null;
		Player winner2 = null;
		Player winner3 = null;
		
		
	
	
		//check if player1 is first,second or last place
		if(player1.total > player2.total && player1.total > player3.total)
		{
			
			
				//make player 1 winner
			winner1 = player1;
			
			
		}
		else if(player1.total < player2.total && player1.total < player3.total)
		{
			winner3 = player1;
		}
		else 
		{
			winner2 = player1;
		}
		
		//check if player 2 first, second or last
		if(player2.total > player1.total && player2.total > player3.total)
		{
			
			
				//make player 1 winner
			winner1 = player2;
			
			
		}
		else if(player2.total < player1.total && player2.total < player3.total)
		{
			winner3 = player2;
		}
		else
		{
			winner2 = player2;
		}
		
			
		
		//check if player 3 first second or last
		if(player3.total > player1.total && player3.total > player2.total)
		{
					
					
				//make player 1 winner
				winner1 = player3;
					
					
		}
		else if(player3.total < player1.total && player3.total < player2.total)
		{
				winner3 = player3;
		}
		else 
			{
			winner2 = player3;
			}
		
		
			
		
		//Print Winner
		System.out.println("Player " + winner1.playerPos +" wins the first place with the total of " +winner1.total);
		System.out.println("Player " + winner2.playerPos +" wins the second place with the total of " +winner2.total);
		System.out.println("Player " + winner3.playerPos +" wins the third place with the total of " +winner3.total);
		
		
		
	}

}
