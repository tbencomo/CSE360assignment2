package cse360assign2;

public class TestAnalytics 
{

	/**
	 * Author: THomas Bencomo
	 * Pin: 18
	 * 
	 * The main program that tests the OrderedIntList and Analytics class.
	 */
	public static void main(String[] args) 
	{
		Analytics an = new Analytics();

		// insert 21 to 1 in reverse order into the array
		// it should be stored as 1 to 21 internally.
		for (int i = 21; i > 0; i--) 
		{
			an.insert(i);
		}
		
		an.print();
		
		// print statistics
		System.out.println("Mean:   " + an.mean());
		System.out.println("Median: " + an.median());
		System.out.println("High:   " + an.high());
		System.out.println("Low:    " + an.low());
		System.out.println("Number of Ints:    " + an.numInts());
		
	}
}
