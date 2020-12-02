/**
 * 
 */
package test2;

/**
 * @author rachad Quintyne student number: 217883463
 *
 */
public class Circle {

	private double radius;
	private String colour;
	private double area;
	
	public Circle()
	{
		radius = 2.0;
		colour = "Green";
	}
	
	
	public Circle(double _radius, String _colour)
	{
		
		this.colour = _colour;
		this.radius = _radius;
	}
	//get radius
	public Double GetRadius()
	{
		return radius;
	}
	//get colour
	public String GetColour()
	{
		
		return colour;
	}
	
	//set radius
	public void SetRadius(double _radius)
	{
		this.radius = _radius;
		
	}
	
	//set colour
	public void SetColour(String _colour)
	{
		this.colour = _colour;
	}
	
	//Calculate Area
	public double CalculateArea()
	{
		area = Math.PI  * Math.pow(radius, 2);
		return area;
	}
	
	public Double GetPerimeter()
	{
		
		double perimeter  = 2 * Math.PI * radius;
		return perimeter;
		
		
	}
}



