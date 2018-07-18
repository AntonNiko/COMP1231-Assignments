//*******************************************************************
// Shape.java            
//
// Anton Nikitenko T00622037
// COMP 1231 Assignment 1
// Represents a collection of abstract methods that can be used to calculate
// the dimensions of a specific geometric shape. Methods include 
// computing surface area and volume.
//*******************************************************************
public abstract class Shape 
{
	// All shapes possess volume and surface area property
	protected double surfaceArea;
	protected double volume;
	
	// Abstract methods to compute the surface area and volume of shape, 
	// depending on its geometry
	abstract double computeSurfaceArea();
	abstract double computeVolume();
}
