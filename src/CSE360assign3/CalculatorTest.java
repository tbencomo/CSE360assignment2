package CSE360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest 
{

	@Test
	    public void testCalculator()
	    {
	        assertNotNull(new Calculator());
	    }
	
	    @Test
	    public void testGetTotal()
	    {
	        Calculator cal = new Calculator();
	        assertEquals(cal.getTotal(), 0);
	        cal.add(5);
	        assertEquals(cal.getTotal(), 5);
	    }
	
	    @Test
	    public void testAdd()
	    {
	        Calculator cal = new Calculator();
	        cal.add(5);
	        assertEquals(cal.getTotal(), 5);
	        cal.add(10);
	        assertEquals(cal.getTotal(), 15);
	        cal.add(-3);
	        assertEquals(cal.getTotal(), 12);
	    }
	
	    @Test
	    public void testSubtract()
	    {
	        Calculator cal = new Calculator();
	        cal.subtract(5);
	        assertEquals(cal.getTotal(), -5);
	        cal.subtract(10);
	        assertEquals(cal.getTotal(), -15);
	    }
	
	    @Test
	    public void testMultiply()
	    {
	        Calculator cal = new Calculator();
	        cal.add(1);
	        cal.multiply(10);
	        assertEquals(cal.getTotal(), 10);
	        cal.multiply(3);
	        assertEquals(cal.getTotal(), 30);
	    }
	
	    @Test
	    public void testDivide()
	    {
	        Calculator cal = new Calculator();
	        cal.add(10);
	        cal.divide(0);
	        assertEquals(cal.getTotal(), 0);
	        cal.add(10);
	        cal.divide(2);
	        assertEquals(cal.getTotal(), 5);
	        cal.divide(3);
	        assertEquals(cal.getTotal(), 1);
	    }
	
	    @Test
	    public void testGetHistory()
	    {
	        //fail("Not yet implemented");
	        Calculator cal = new Calculator();
	        cal.add (4);
	        assertEquals(cal.getHistory(), "0 + 4");
	        cal.subtract (2);
	        cal.multiply (2);
	        cal.add(5);
	        assertEquals(cal.getHistory(), "0 + 4 - 2 * 2 + 5");        
	    }
	
	}
	
	
