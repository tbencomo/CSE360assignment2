
package cse360assign2;

/**
 * Author: Thomas Bencomo
 * Pin: 18
 * 
 * The ordered int list.
 *
 */
public class OrderedIntList
{
	
	/** Private members declaration */
	
	protected int[] a;  // Array
	protected int c;    // Counter
   
	
	/** Constructor with no parameters */
	
	OrderedIntList () 
	{
		a = new int[10];  // Array initialization
	}
	
	/** Method to insert int in ascending order in the array */
	
	public void insert (int v) 
	{
		if (c == a.length) grow();
		if (c == 0)
		{
			a[0] = v;
			c = c + 1;
			
		} 
		
		else
		{
			int j = c - 1;
			// Iterating over array to find suitable position
			while (j >= 0 && a[j] > v) 
			{
				a[j + 1] = a[j];
				j = j - 1;
			}
			a[j + 1] = v;
			c = c + 1;    
		}
			
	}
	
	private void grow()
	{
		int []t = new int[c * 2];
		for (int index = 0; index < c; index ++ )
			
			t[index] = a[index];
		    a = t;
	}
	
	/** print () Printing elements of array in per line 5 elements separated by tab */
	public void print () 
	{
		for (int index = 0; index < c; index++)  // Iterating over array to print elements
		{
			if (index % 5 == 0) 
				
				System.out.println();
			    System.out.print(a[index] + "\t");
		}
		
		System.out.println();
	}
}