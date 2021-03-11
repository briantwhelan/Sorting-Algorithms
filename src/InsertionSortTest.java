import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
/*************************************************************************
 *  Insertion Sort test class.
 *
 *  @version 1.0 11/3/21
 *
 *  @author Brian Whelan
 *
 *************************************************************************/
public class InsertionSortTest 
{
	/**
     * Test insertion sort for integers
     */
    @Test
    public void testSortingInts()
    {
        //Test null array
    	int[] array = null;
    	InsertionSort.sortInts(array);
        assertArrayEquals("Testing insertion sort for a null array", null, array);
        
        //Test empty array
        array = new int[] {};
        InsertionSort.sortInts(array);
        assertArrayEquals("Testing insertion sort for an empty array", new int[] {}, array);
        
        //Test sorted array
        array = new int[] {5, 10, 15, 20};
        InsertionSort.sortInts(array);
        assertArrayEquals("Testing insertion sort for a sorted array", new int[] {5, 10, 15, 20}, array);
        
        //Test unsorted array
        array = new int[] {20, 5, 15, 10};
        InsertionSort.sortInts(array);
        assertArrayEquals("Testing insertion sort for an unsorted array", new int[] {5, 10, 15, 20}, array);
    }
    
	/**
     * Test insertion sort for doubles
     */
    @Test
    public void testSortingDoubles()
    {
        //Test null array
    	double[] array = null;
    	InsertionSort.sortDoubles(array);
        assertArrayEquals("Testing insertion sort for a null array", null, array, 0.0);
        
        //Test empty array
        array = new double[] {};
        InsertionSort.sortDoubles(array);
        assertArrayEquals("Testing insertion sort for an empty array", new double[] {}, array, 0.0);
        
        //Test sorted array
        array = new double[] {5.0, 10.0, 15.0, 20.0};
        InsertionSort.sortDoubles(array);
        assertArrayEquals("Testing insertion sort for a sorted array", new double[] {5.0, 10.0, 15.0, 20.0}, array, 0.0);
        
        //Test unsorted array
        array = new double[] {20.0, 5.0, 15.0, 10.0};
        InsertionSort.sortDoubles(array);
        assertArrayEquals("Testing insertion sort for an unsorted array", new double[] {5.0, 10.0, 15.0, 20.0}, array, 0.0);
    }
    
	/**
     * Test insertion sort for characters
     */
    @Test
    public void testSortingCharacters()
    {
        //Test null array
    	char[] array = null;
    	InsertionSort.sortChars(array);
        assertArrayEquals("Testing insertion sort for a null array", null, array);
        
        //Test empty array
        array = new char[] {};
        InsertionSort.sortChars(array);
        assertArrayEquals("Testing insertion sort for an empty array", new char[] {}, array);
        
        //Test sorted array
        array = new char[] {'a', 'b', 'c', 'd', 'e'};
        InsertionSort.sortChars(array);
        assertArrayEquals("Testing insertion sort for a sorted array", new char[] {'a', 'b', 'c', 'd', 'e'}, array);
        
        //Test unsorted array
        array = new char[] {'b', 'r', 'i', 'a', 'n'};
        InsertionSort.sortChars(array);
        assertArrayEquals("Testing insertion sort for an unsorted array", new char[] {'a', 'b', 'i', 'n', 'r'}, array);
    }
}