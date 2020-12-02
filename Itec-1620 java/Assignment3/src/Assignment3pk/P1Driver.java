/**
 * 
 */
package Assignment3pk;
import java.util.Scanner;
/**
 * @author rachad Quintyne 217883463
 *
 */
public class P1Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		final int max = 6;
		int count= 0;
		Customer[] customer = new Customer[6];
		Scanner scan = new Scanner(System.in);
		System.out.println("For 6 customers enter the nameand in the next line the balance");
		
		
	do
	{
		//prompt user for input
		
		String name = scan.next();
		double balance = scan.nextDouble();
		
		
		// instantiate a customer
		Customer temp = new Customer(name,balance);
		
		//add to the customer array
		customer[count] =  temp;
		
		//increase the count
		count++;
		System.out.println(count);
	}
	while(count != max);
	System.out.println("Search for all customers who have less then 150");
	Customer[] temp = new Customer[6];

	int tempCount = 0;
	for(int i = 0; i < customer.length; i ++)
	{
		
		if(customer[i].GetBalance() < 150)
		{
			
			//populate new array
			temp[tempCount] = customer[i];
			tempCount++;
		}
	}
	
	//print out all names
	for(int j= 0; j < temp.length;j++ )
	{
		
		if(temp[j] != null)
		{
			System.out.println(temp[j].GetName());
		}
	}
	
	//get average balance
	double average=0;
	for(int j= 0; j < customer.length;j++ )
	{
		average += customer[j].GetBalance();
		
	}
	
	average = average/6; 
	System.out.println("The average balance is: " + average);
	
	
	//get highest balance
	Customer[] temp2 = new Customer[1];
	double max1 = 0;
	for(int j= 0; j < customer.length;j++ )
	{
		//come back might need add some stuff
		if(customer[j].GetBalance() > max1)
		{
			//set the new max
			max1 = customer[j].GetBalance();
			//set the riches man dem
			temp2[0] = customer[j];
		}
	
		
	}
	System.out.println("The customer with the highest balance: " + temp2[0].GetName());
	
	//get lowest balanace
	double min = Double.POSITIVE_INFINITY;
	for(int j= 0; j < customer.length;j++ )
	{
		//come back might need add some stuff
		if(customer[j].GetBalance() < min)
		{
			//set the new min
			min = customer[j].GetBalance();
			//set the poorest man dem
			temp2[0] = customer[j];
		}
	
		
		
	}
	
	System.out.println("The customer with the highest balance: " + temp2[0].GetName());
	
	
	for(int j= 0; j < customer.length;j++ )
	{
		customer[j].AddPercentage(0.15);
		
		System.out.println(customer[j].GetName()+ " has "+ "\t" +customer[j].GetBalance());
	}
	}
}
