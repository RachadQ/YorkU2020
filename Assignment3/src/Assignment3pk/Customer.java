/**
 * 
 */
package Assignment3pk;

/**
 * @author rachad Quintyne 217883463

 *
 */
public class Customer {

	
	private String name;
	private double  balance;
	
	public Customer(String name,double balance)
	{
		this.name= name;
		this.balance = balance;
	}
	
	public String ToString()
	{
		String tostring;
		tostring = name + " " + balance;
		
		return tostring;
	}
	
	public String GetName()
	{
		return name;
	}
	
	public double GetBalance()
	{
		return balance;
	}
	
	public void SeNames(String name)
	{
		this.name = name;
		
	}
	
	public void SetDouble(double balance)
	{
		this.balance = balance;
	}
	public void AddPercentage(double percentage)
	{
		//add percentage to the balance
		double temp = balance * (1 * percentage);
		balance += temp;
	}
}
