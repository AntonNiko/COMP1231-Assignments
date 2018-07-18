//*******************************************************************
// Driver.java            
//
// Anton Nikitenko T00622037
// COMP 1231 Assignment 1
// Demonstrates the functionality of the Shape class and its children
// (specific shapes including Cone, Cube, Cylinder, Sphere) classes by
// initializing objects and demonstrating that the methods
// to compute surface area and volume work with a wide range of values.
//*******************************************************************
public class Driver 
{
	public static void main(String[] args) 
	{
		// Arrays store test values for each shape
		double[][] coneTestValues = {{2.0, 4.0}, {0.01, 9.0}, {2.0, 3.111},
				                     {1.55, 9.67}, {5.0, 10.0}, {2.5, 2.5}, 
				                     {4.444, 0}, {0, 5.0}, {-4.2, 1.8}};
		double[] cubeTestValues = {2.5, 156, 0, 5.0, 3.0, 0.001, 100.0, 34.65, 12.12};
		double[][] cylTestValues = {{2, 4},{10.0, 5}, {2.0, 44}, {5.0, 4.8}, {10.0, 99}, 
				                     {45, 10}, {4.5, 10}, {-5, 2.4}, {10, 10}};
		double[] sphereTestValues = {4.0, 2.0, 1.8, 0, -0.01, 12.69, 8.88, 13, 11.1};
		
		// Iterate through test values for cone object and output calculations
		Cone coneObj = new Cone(0.0, 0.0);
		for(double[] coneTestValue: coneTestValues)
		{
			coneObj.setRadius(coneTestValue[0]);
			coneObj.setHeight(coneTestValue[1]);
			// Output cone dimensions
			System.out.print(coneObj +"\t");
			// Output cone volume and surface area
			System.out.println("Surface area: "+ String.format("%.4g",coneObj.computeSurfaceArea()) + 
					           " Volume: " + String.format("%.4g", coneObj.computeVolume()));	
		}
		System.out.println();
		
		// Iterate through test values for cube object and output calculations
		Cube cubeObj = new Cube(0.0);
		for(double cubeTestValue: cubeTestValues)
		{
			cubeObj.setLength(cubeTestValue);
			// Output cube dimensionss
			System.out.print(cubeObj +"\t");
			// Output cube volume and surface area
			System.out.println("Surface area: "+ String.format("%.4g", cubeObj.computeSurfaceArea())  + 
					           " Volume: " + String.format("%.4g", cubeObj.computeVolume()));
		}
		System.out.println();
		
		// Iterate through test values for cylinder object and output calculations
		Cylinder cylObj = new Cylinder(0.0, 0.0);
		for(double[] cylTestValue: cylTestValues)
		{
			cylObj.setRadius(cylTestValue[0]);
			cylObj.setHeight(cylTestValue[1]);
			// Output cylinder dimensions
			System.out.print(cylObj +"\t");
			// Output cylinder volume and surface area
			System.out.println("Surface area: "+ String.format("%.4g", cylObj.computeSurfaceArea()) + 
					           " Volume: " + String.format("%.4g", cylObj.computeVolume()));	
		}
		System.out.println();
		
		// Iterate through test values for sphere object and output calculations
		Sphere sphereObj = new Sphere(0.0);
		for(double sphereTestValue: sphereTestValues)
		{
			sphereObj.setRadius(sphereTestValue);
			// Output cylinder dimensions
			System.out.print(sphereObj +"\t");
			// Output cylinder volume and surface area
			System.out.println("Surface area: "+ String.format("%.4g", sphereObj.computeSurfaceArea()) + 
					           " Volume: " + String.format("%.4g", sphereObj.computeVolume()));	
		}
		System.out.println();
	}
}
