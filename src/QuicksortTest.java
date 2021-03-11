import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
/*************************************************************************
 *  Quicksort test class.
 *
 *  @version 1.0 11/3/21
 *
 *  @author Brian Whelan
 *
 *************************************************************************/
public class QuicksortTest 
{
	/**
     * Test quicksort for integers
     */
    @Test
    public void testSortingInts()
    {
        //Test null array
    	int[] array = null;
    	Quicksort.sortInts(array);
        assertArrayEquals("Testing quicksort for a null array", null, array);
        
        //Test empty array
        array = new int[] {};
        Quicksort.sortInts(array);
        assertArrayEquals("Testing quicksort for an empty array", new int[] {}, array);
        
        //Test sorted array
        array = new int[] {5, 10, 15, 20};
        Quicksort.sortInts(array);
        assertArrayEquals("Testing quicksort for a sorted array", new int[] {5, 10, 15, 20}, array);
        
        //Test unsorted array
        array = new int[] {20, 5, 15, 10};
        Quicksort.sortInts(array);
        assertArrayEquals("Testing quicksort for an unsorted array", new int[] {5, 10, 15, 20}, array);
      
        //Test another unsorted array
        array = new int[] {5, 15, 10, 20};
        Quicksort.sortInts(array);
        assertArrayEquals("Testing quicksort for an unsorted array", new int[] {5, 10, 15, 20}, array);
    }
    
	/**
     * Test quicksort for doubles
     */
    @Test
    public void testSortingDoubles()
    {
        //Test null array
    	double[] array = null;
    	Quicksort.sortDoubles(array);
        assertArrayEquals("Testing quicksort for a null array", null, array, 0.0);
        
        //Test empty array
        array = new double[] {};
        Quicksort.sortDoubles(array);
        assertArrayEquals("Testing quicksort for an empty array", new double[] {}, array, 0.0);
        
        //Test sorted array
        array = new double[] {5.0, 10.0, 15.0, 20.0};
        Quicksort.sortDoubles(array);
        assertArrayEquals("Testing quicksort for a sorted array", new double[] {5.0, 10.0, 15.0, 20.0}, array, 0.0);
        
        //Test unsorted array
        array = new double[] {20.0, 5.0, 15.0, 10.0};
        Quicksort.sortDoubles(array);
        assertArrayEquals("Testing quicksort for an unsorted array", new double[] {5.0, 10.0, 15.0, 20.0}, array, 0.0);      
      //Test another unsorted array
        array = new double[] {5.0, 15.0, 10.0, 20.0};
        Quicksort.sortDoubles(array);
        assertArrayEquals("Testing quicksort for an unsorted array", new double[] {5.0, 10.0, 15.0, 20.0}, array, 0.0);
    }
    
	/**
     * Test quicksort for characters
     */
    @Test
    public void testSortingCharacters()
    {
        //Test null array
    	char[] array = null;
    	Quicksort.sortChars(array);
        assertArrayEquals("Testing quicksort for a null array", null, array);
        
        //Test empty array
        array = new char[] {};
        Quicksort.sortChars(array);
        assertArrayEquals("Testing quicksort for an empty array", new char[] {}, array);
        
        //Test sorted array
        array = new char[] {'a', 'b', 'c', 'd', 'e'};
        Quicksort.sortChars(array);
        assertArrayEquals("Testing quicksort for a sorted array", new char[] {'a', 'b', 'c', 'd', 'e'}, array);
        
        //Test unsorted array
        array = new char[] {'b', 'r', 'i', 'a', 'n'};
        Quicksort.sortChars(array);
        assertArrayEquals("Testing quicksort for an unsorted array", new char[] {'a', 'b', 'i', 'n', 'r'}, array);
    }
}