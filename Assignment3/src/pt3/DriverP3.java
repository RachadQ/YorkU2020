/**
 * 
 */
package pt3;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author rachad Quintyne 217883463
 *
 */
public class DriverP3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		while(counter == 0)
		{
		int[] array = new int[8];
		int count = 0;
		Scanner scan = new Scanner(System.in);
		
		//prompt user for length
		System.out.println( "The array length is: " + array.length) ;
		System.out.println();
		int number = 0;
		
		// while count not 8 keep looping
		while(count != array.length)
		{
			
			System.out.println( "please enter value for the array:");
			
			number = scan.nextInt();
			//while number is negitave prompt user for a postive number
		while(number < 0)
		{
			System.out.println( "please enter a postive value");
			number = scan.nextInt();
		}
		//add the number to the array
		array[count] = number;
		//increment count
		count++;
		}
		 System.out.println();
		System.out.println( "Before swapping the min max the array is") ;
		for(int i : array)
		{
			System.out.print( i + " ");
		}
		
		int maxValue = array[0]; 
		int location = 0;
	    for(int i=1;i < array.length;i++){ 
	      if(array[i] > maxValue){ 
	         maxValue = array[i]; 
	         location = i;
	      }
	    }
	    System.out.println();
	    System.out.println();
	      System.out.println("The max is " + maxValue + " and its location is "+ location);
		
	      
	      int minValue = array[0];
	      int location2 = 0;
	      for(int i=1;i<array.length;i++){ 
	        if(array[i] < minValue){ 
	          minValue = array[i]; 
	          location2 = i;
	        } 
	      } 

	      
	      
	      System.out.println("The min is " + minValue + " and its location is "+ location2);
	      System.out.println();
	    //swap location
	      int tempish = array[location];
	      array[location] = array[location2];
	      array[location2] = tempish;
	      
	      System.out.println("after Swappingthe min max, the array is");
	      for(int i : array)
			{
				System.out.print( i + " ");
			}
	      System.out.println();
	      System.out.println();
		Arrays.sort(array);
		System.out.print("The array sorted in Accending Order: ");
		for(int i : array)
		{
			System.out.print( i + " ");
		}
		 System.out.println();
		 System.out.println();
		//get median
		double median;
		if (array.length % 2 == 0)
		    median = ((double)array[array.length/2] + (double)array[array.length/2 - 1])/2;
		else
		    median = (double) array[array.length/2];
		
		System.out.print("The median is " + median);
		counter++;
	}
	
	

	
	while(counter == 1 )
	{
	int[] array = new int[7];
	int count = 0;
	Scanner scan = new Scanner(System.in);
	System.out.println();
	System.out.println();
	//prompt user for length
	System.out.println( "The array length is: " + array.length) ;
	System.out.println();
	int number = 0;
	
	// while count not 8 keep looping
	while(count != array.length)
	{
		
		System.out.println( "please enter value for the array:");
		
		number = scan.nextInt();
		//while number is negitave prompt user for a postive number
	while(number < 0)
	{
		System.out.println( "please enter a postive value");
		number = scan.nextInt();
	}
	//add the number to the array
	array[count] = number;
	//increment count
	count++;
	}
	 System.out.println();
	System.out.println( "Before swapping the min max the array is") ;
	for(int i : array)
	{
		System.out.print( i + " ");
	}
	
	int maxValue = array[0]; 
	int location = 0;
    for(int i=1;i < array.length;i++){ 
      if(array[i] > maxValue){ 
         maxValue = array[i]; 
         location = i;
      }
    }
    
    System.out.println();
    System.out.println();
      System.out.println("The max is " + maxValue + " and its location is "+ location);
     
      
      int minValue = array[0];
      int location2 = 0;
      for(int i=1;i<array.length;i++){ 
        if(array[i] < minValue){ 
          minValue = array[i]; 
          location2 = i;
        } 
      } 

      System.out.println("The min is " + minValue + " and its location is "+ location2);
      System.out.println();
    //swap location
      int tempish = array[location];
      array[location] = array[location2];
      array[location2] = tempish;
    
      System.out.println("after Swapping the min max, the array is");
      for(int i : array)
		{
			System.out.print( i + " ");
		}
      System.out.println();

      
      System.out.println();
	Arrays.sort(array);
	System.out.print("The array sorted in Accending Order: ");
	for(int i : array)
	{
		System.out.print( i + " ");
	}
	 System.out.println();
	 System.out.println();
	//get median
	double median;
	if (array.length % 2 == 0)
	    median = ((double)array[array.length/2] + (double)array[array.length/2 - 1])/2;
	else
	    median = (double) array[array.length/2];
	
	System.out.print("The median is " + median);
	counter++;
}
}
}
