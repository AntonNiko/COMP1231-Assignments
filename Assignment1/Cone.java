//*******************************************************************
// Cone.java            
//
// Anton Nikitenko T00622037
// COMP 1231 Assignment 1
// Represents a cone shape, with abstract methods and variables inherited
// from Shape class which compute surface area and volume. toString() method 
// overrided to provide effective class description when called
//*******************************************************************
public class Cone extends Shape 
{
	// Variables representing radius and height of Cone
	private double radius;
	private double height;
	
	//-----------------------------------------------------------------------------
	// Constructor used to initialize cone with specific dimensions (radius, height)
	//-----------------------------------------------------------------------------
	public Cone (double radius, double height)
	{
		// If constructor argument is less than 0 (invalid dimension property), does not set variables
		if(radius < 0 || height < 0) 
		{
			System.out.println("Error: Radius or height is less than 0, no dimensions set");
			return;
		}
		this.radius = radius;
		this.height = height;
	}
	
	//-----------------------------------------------------------------------------
	// Return the radius of the cone object
	//-----------------------------------------------------------------------------
	public double getRadius()
	{
		return this.radius;
	}
	
	//-----------------------------------------------------------------------------
	// Return the height of the cone object
	//-----------------------------------------------------------------------------
	public double getHeight()
	{
		return this.height;
	}
	
	//-----------------------------------------------------------------------------
	// Set the radius of the cone object
	//-----------------------------------------------------------------------------
    public void setRadius(double radius)
    {
    	// If argument is less than 0, leaves variable unchanged and informs user of error
    	if(radius < 0)
    	{
    		System.out.println("Error: radius is less than 0, radius unchaged");
    		return;
    	}
    	this.radius = radius;
    }
    
	//-----------------------------------------------------------------------------
	// Set the height of the cone object
	//-----------------------------------------------------------------------------
    public void setHeight(double height)
    {
    	// If argument is less than 0, leaves variable unchanged and informs user of error
    	if(radius < 0)
    	{
    		System.out.println("Error: height is less than 0, height unchaged");
    		return;
    	}
    	this.height = height;
    }

	//-----------------------------------------------------------------------------
	// Computes the surface area of the cone with the dimensions provided
	// with formula ( surfaceArea = pi*radius*(radius + sqrt(height^2 + radius^2))
	//-----------------------------------------------------------------------------
	public double computeSurfaceArea() 
	{
		this.surfaceArea = Math.PI * this.radius * 
				(this.radius + Math.sqrt(Math.pow(this.height, 2) + Math.pow(this.radius,  2)));
		return this.surfaceArea;
	}

	//-----------------------------------------------------------------------------
	// Computes the volume of the cone with the dimensions provided with formula
	// ( volume = pi*radius^2*height/3)
	//-----------------------------------------------------------------------------
	public double computeVolume() 
	{
		this.volume = Math.PI * Math.pow(this.radius, 2) * this.height / 3.0;
		return this.volume;
	}
	
    //-----------------------------------------------------------------------------
	// Returns a String representation of the object name (Cone), and 
	// its dimensions in the following format:
	// Cone[radius = 4.0, height = 4.0]
	//-----------------------------------------------------------------------------
	public String toString() 
	{
		return this.getClass().getName()+
				"[radius = "+ this.radius +
				", height = "+ this.height+"]";
	}
}
