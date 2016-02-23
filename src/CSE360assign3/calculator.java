package CSE360assign3;

public class calculator 
{
	
	/** store the total value */
	private int total;
	
	/** store the history string */
	private String history;
	
	/**
	 * Default constructor
	 */
	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/**
	 * Get the total value
	 * @return total
	 */
	public int getTotal () 
	{
		return total;
	}
	
	/**
	 * Add the parameter to the total variable
	 * @param value int value
	 */
	public void add (int value) 
	{
		total += value;
		history += " + " + value;
	}
	
	/**
	 * Subtract the parameter from the total variable
	 * @param value int value
	 */
	public void subtract (int value) 
	{
		total -= value;
		history += " - " + value;
	}
	
	/**
	 * Multiply the total by the the parameter
	 * @param value int value
	 */
	public void multiply (int value) {
		total *= value;
		history += " * " + value;
	}
	
	/**
	 * Divide the total by the parameter
	 * @param value int value
	 */
	public void divide (int value)
	{
		if (value == 0)
		    total = 0;
		else
		    total = total / value;
		history += " / " + value;
	}
	
	/**
	 * Get the history string
	 * @return history
	 */
	public String getHistory ()
	{
		return history;
	}
}
