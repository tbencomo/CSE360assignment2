package cse360assign2;

/**
 * Author: Thomas Bencomo
 * Pin: 18
 * 
 * The analytics which extends OrderedIntList
 * and provides the statistics of the list.
 *
 */
public class Analytics extends OrderedIntList
{
    /**
     * Calculate the mean value of the integer list.
     * @return a double value as the mean value.
     */ 
    public double mean()
    {
        double sum = 0;
        for (int i = 0; i < c; i++)
        {
            sum = sum + a[i];
        }
        if (c > 0)
        {
            return sum / c;
        }
        return 0;
    }

    /**
     * 
     * @return the median value of the ordered list.
     */
    public int median()
    {
    	if (c > 0) 
    	{
    		return a[c / 2];
    	}
    	return 0;
    }

    /**
     * Calculate the high value in the list.
     * @return the high value in the list
     */ 
    public int high()
    {
        int value = Integer.MIN_VALUE;
        for (int i = 0; i < c; i++)
        {
            if (a[i] > value)
            {
                value = a[i];
            }
        }
        return value;
    }

    /**
     * Calculate the low value in the list.
     * @return the low value in the list
     */ 
    public int low()
    {
        int value = Integer.MAX_VALUE;
        for (int i = 0; i < c; i++)
        {
            if (a[i] < value)
            {
                value = a[i];
            }
        }
        return value;
    }


    /**
     * @return the number of integers in the list
     */ 
    public int numInts()
    {
        return c;
    }
}
