//*******************************************************************
// Sphere.java            
//
// Anton Nikitenko T00622037
// COMP 1231 Assignment 1
// Represents a sphere shape, with abstract methods inherited from Shape class
// which compute surface area and volume. toString() method overrided to
// provide effective class description when called
//*******************************************************************
public class Sphere extends Shape 
{
	// Variables representing the radius of the sphere
	private double radius;

	//-----------------------------------------------------------------------------
	// Constructor used to initialize sphere with specific dimensions (radius)
	//-----------------------------------------------------------------------------
	public Sphere (double radius) 
	{
		// If constructor argument is less than 0 (invalid dimension property), does not set variables
		if(radius < 0) 
		{
			System.out.println("Error: Radius is less than 0, no dimension set");
			return;
		}
		this.radius = radius;
	}
	
	//-----------------------------------------------------------------------------
	// Return the radius of the cylinder object
	//-----------------------------------------------------------------------------
	public double getRadius()
	{
		return this.radius;
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
	// Computes the surface area of the sphere with the dimensions provided
	// with formula ( surfaceArea = 4*pi*radius^2 )
	//-----------------------------------------------------------------------------
	public double computeSurfaceArea() 
	{
		this.surfaceArea = 4 * Math.PI * Math.pow(this.radius, 2);
		return this.surfaceArea;
	}

	//-----------------------------------------------------------------------------
	// Computes the volume of the sphere with the dimensions provided with formula
	// ( volume = (4/3)*pi*radius^3)
	//-----------------------------------------------------------------------------
	public double computeVolume() 
	{
		this.volume = (4.0/3.0) * Math.PI * Math.pow(this.radius, 3);
		return this.volume;
	}

    //-----------------------------------------------------------------------------
	// Returns a String representation of the object name (Sphere), and its dimensions 
	// in the following format: Sphere[radius = 4.0]
	//-----------------------------------------------------------------------------
	public String toString() 
	{
		return this.getClass().getName()+
				"[radius = "+ this.radius + "]";
	}
}
