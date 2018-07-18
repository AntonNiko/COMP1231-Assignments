//*******************************************************************
// Cube.java            
//
// Anton Nikitenko T00622037
// COMP 1231 Assignment 1
// Represents a cube shape, with abstract methods inherited from Shape class
// which compute surface area and volume. toString() method overrided to
// provide effective class description when called
//*******************************************************************
public class Cube extends Shape 
{
	// Variables representing the length of each side of the cube 
	private double length;

	//-----------------------------------------------------------------------------
	// Constructor used to initialize cube with specific dimensions (length)
	//-----------------------------------------------------------------------------
	public Cube (double length)
	{
		// If constructor argument is less than 0 (invalid dimension property), does not set variables
		if(length < 0) 
		{
			System.out.println("Error: Length is less than 0, no dimension set");
			return;
		}
		this.length = length;
	}	
	
	//-----------------------------------------------------------------------------
	// Return the length of the cube object
	//-----------------------------------------------------------------------------
	public double getLength()
	{
		return this.length;
	}
	
	//-----------------------------------------------------------------------------
	// Set the length of the cube object
	//-----------------------------------------------------------------------------
    public void setLength(double length)
    {
    	// If argument is less than 0, leaves variable unchanged and informs user of error
    	if(length < 0)
    	{
    		System.out.println("Error: length is less than 0, radius unchaged");
    		return;
    	}
    	this.length = length;
    }	

	//-----------------------------------------------------------------------------
	// Computes the surface area of the cube with the dimensions provided
	// with formula ( surfaceArea = 6*length^2 )
	//-----------------------------------------------------------------------------
	public double computeSurfaceArea() 
	{
		this.surfaceArea = 6 * Math.pow(this.length, 2);
		return this.surfaceArea;
	}

	//-----------------------------------------------------------------------------
	// Computes the volume of the cube with the dimensions provided with formula
	// ( volume = length^3)
	//-----------------------------------------------------------------------------
	public double computeVolume() 
	{
		this.volume = Math.pow(this.length, 3);
		return this.volume;
	}

    //-----------------------------------------------------------------------------
	// Returns a String representation of the object name (Cube), and 
	// its dimensions in the following format:
	// Cube[length = 4.0]
	//-----------------------------------------------------------------------------
	public String toString() 
	{
		return this.getClass().getName()+
				"[length = "+ this.length + "]";
	}
}
