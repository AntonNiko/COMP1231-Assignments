//*******************************************************************
// Cylinder.java            
//
// Anton Nikitenko T00622037
// COMP 1231 Assignment 1
// Represents a cylinder shape, with abstract methods and variables 
// inherited from Shape class which compute surface area and volume. 
// toString() method overrided to  provide effective class 
// description when called
//*******************************************************************
public class Cylinder extends Shape 
{
	// Variables representing the radius and height of the cylinder 
	private double radius;
	private double height;

	//-----------------------------------------------------------------------------
	// Constructor used to initialize cube with specific dimensions (radius, height)
	//-----------------------------------------------------------------------------
	public Cylinder (double radius, double height)
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
	// Return the radius of the cylinder object
	//-----------------------------------------------------------------------------
	public double getRadius()
	{
		return this.radius;
	}
	
	//-----------------------------------------------------------------------------
	// Return the height of the cylinder object
	//-----------------------------------------------------------------------------
	public double getHeight()
	{
		return this.height;
	}	
	
	//-----------------------------------------------------------------------------
	// Set the length of the cylinder object
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
	// Set the length of the cylinder object
	//-----------------------------------------------------------------------------
    public void setHeight(double height)
    {
    	// If argument is less than 0, leaves variable unchanged and informs user of error
    	if(height < 0)
    	{
    		System.out.println("Error: height is less than 0, radius unchaged");
    		return;
    	}
    	this.height = height;
    }	   

	//-----------------------------------------------------------------------------
	// Computes the surface area of the cylinder with the dimensions provided
	// with formula ( surfaceArea = 2*pi*radius*height + 2*pi*radius^2 )
	//-----------------------------------------------------------------------------
	public double computeSurfaceArea() 
	{
		this.surfaceArea = 2 * Math.PI * this.radius * this.height  +
				2 * Math.PI * Math.pow(this.radius, 2);
		return this.surfaceArea;
	}

	//-----------------------------------------------------------------------------
	// Computes the volume of the cylinder with the dimensions provided with formula
	// ( volume = pi*radius^2*height)
	//-----------------------------------------------------------------------------
	public double computeVolume() 
	{
		this.volume = Math.PI * Math.pow(radius, 2) * this.height;
		return this.volume;
	}

    //-----------------------------------------------------------------------------
	// Returns a String representation of the object name (Cylinder), and its dimensions 
	//in the following format: Cylinder[radius = 4.0, height = 4.0]
	//-----------------------------------------------------------------------------
	public String toString() 
	{
		return this.getClass().getName()+
				"[radius = "+ this.radius +
				", height = "+ this.height+"]";
	}
}
