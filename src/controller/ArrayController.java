/**
 * Controller for the Array Project.
 */
package controller;

import model.Car;

/**
 * @author CJ Oman
 * @version 1.1 added documentation
 * @date Jan 21, 20149:15:16 AM
 */
public class ArrayController
{
	private int birthdays [][] = new int [5][3];
	private String [][] days = new String [4][4];
	private Car[][] car = new Car[6][4];
	
	/**
	 * Fills the birthday arrays.
	 */
	public void fillTheBirthdays()
	{
		for (int i = 0; i < birthdays.length; i++)
		{
			for (int j = 0; j < birthdays[0].length; j++)
			{
				birthdays[i][j] = (i * birthdays[0].length) + j + 1;
			}
		}
	}
	
	/**
	 * Fills the String Arrays.
	 */
	public void fillTheString()
	{
		for (int i = 0; i <days.length; i++)
		{
			for(int j = 0; j <days[0].length; j++)
			{
				days[4][4] = (i * days[0].length) + j +1 + "";
			}
		}
		
	}
	
	/**
	 * Fills the car arrays.
	 */
	public void fillTheCar()
	{
		//setMyCar(new Car("Subaru", "Impreza WRX STi", 07, 4, true));
		car [0][0] = new Car("Subaru", "Impreza WRX STi", 07, 4, true);
	}
	
	/**
	 * Sets car as myCar.
	 * @param myCar
	 */
	public void setMyCar(Car [][]myCar)
	{
		this.car = myCar;
	}
	
	/**
	 *  Starts the programs.
	 */
	public void start()
	{
		fillTheCar();
	}
}
