/**
 * 
 */
package model;

/**
 * @author CJ Oman
 * @version 1.1 added documentation
 * @date Jan 21, 20149:14:44 AM
 */
public class Car
{
	private String make;
	private String model;
	private int year;
	private int doors;
	private boolean hasTurbo;
	
	/**
	 * Sets the make of car.
	 * @param make
	 */
	public void setMake(String make)
	{
		this.make = make;
	}
	
	/**
	 * Sets the model for the car.
	 * @param model
	 */
	public void setModel(String model)
	{
		this.model = model;
	}
	
	/**
	 * Sets the year for the car.
	 * @param year
	 */
	public void setYear(int year)
	{
		this.year = year;
	}
	
	/**
	 * Sets the doors for the car.
	 * @param doors
	 */
	public void setDoors(int doors)
	{
		this.doors = doors;
	}
	
	/**
	 * Sets whether the car has turbo or not.
	 * @param hasTurbo
	 */
	public void setHasTurbo(boolean hasTurbo)
	{
		this.hasTurbo = hasTurbo;
	}
	
	/**
	 * Gets the make for car.
	 * @return make
	 */
	public String getMake()
	{
		return make;
	}
	
	/**
	 * Gets the model for the car.
	 * @return model
	 */
	public String getModel()
	{
		return model;
	}
	
	/**
	 * Gets the year for the car.
	 * @return year
	 */
	public int getYear()
	{
		return year;
	}
	
	/**
	 * Gets the doors for the car.
	 * @return Doors
	 */
	public int getDoors()
	{
		return doors;
	}
	
	/**
	 * Gets has turbo or not.
	 * @return turbo
	 */
	public boolean getHasTurbo()
	{
		return hasTurbo;
	}
	
	/**
	 * Sets the default for the car.
	 */
	public Car()
	{
		make = "none";
		model = "none";
		year = 0;
		doors = 0;
		hasTurbo = false;
	}
	
	/**
	 * Sets all variables.
	 * @param make
	 * @param model
	 * @param year
	 * @param doors
	 * @param hasTurbo
	 */
	public Car(String make, String model, int year, int doors, boolean hasTurbo)
	{
		this.make = make;
		this.model = model;
		this.year = year;
		this.doors = doors;
		this.hasTurbo = hasTurbo;
	}
}
