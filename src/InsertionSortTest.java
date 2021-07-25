import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
/*************************************************************************
 *  {@code InsertionSort} test class.
 *
 *  @version 25/7/21
 *
 *  @author Brian Whelan
 *
 *************************************************************************/
public class InsertionSortTest 
{
    /**
     * Test {@code sortInts(int[] array)}
     */
    @Test
    public void testSortInts()
    {
    	int[] array = null;
    	InsertionSort.sortInts(array);
        assertArrayEquals("Testing sortInts(int[] array) - Sorting a null array", null, array);
        
        array = new int[] {};
        InsertionSort.sortInts(array);
        assertArrayEquals("Testing sortInts(int[] array) - Sorting an empty array", new int[] {}, array);
        
        array = new int[] {5, 10, 15, 20};
        InsertionSort.sortInts(array);
        assertArrayEquals("Testing sortInts(int[] array) - Sorting a sorted array", new int[] {5, 10, 15, 20}, array);
        
        array = new int[] {20, 5, 15, 10};
        InsertionSort.sortInts(array);
        assertArrayEquals("Testing sortInts(int[] array) - Sorting an unsorted array", new int[] {5, 10, 15, 20}, array);
    }
    
    /**
     * Test {@code sortDoubles(double[] array)}
     */
    @Test
    public void testDoubles()
    {
        double[] array = null;
        InsertionSort.sortDoubles(array);
        assertArrayEquals("Testing sortDoubles(double[] array) - Sorting a null array", null, array, 0.0);
        
        array = new double[] {};
        InsertionSort.sortDoubles(array);
        assertArrayEquals("Testing sortDoubles(double[] array) - Sorting an empty array", new double[] {}, array, 0.0);
        
        array = new double[] {5.0, 10.0, 15.0, 20.0};
        InsertionSort.sortDoubles(array);
        assertArrayEquals("Testing sortDoubles(double[] array) - Sorting a sorted array", new double[] {5.0, 10.0, 15.0, 20.0}, array, 0.0);
        
        array = new double[] {20.0, 5.0, 15.0, 10.0};
        InsertionSort.sortDoubles(array);
        assertArrayEquals("Testing sortDoubles(double[] array) - Sorting an unsorted array", new double[] {5.0, 10.0, 15.0, 20.0}, array, 0.0);
    }
    
    /**
     * Test {@code sortChars(char[] array)}
     */
    @Test
    public void testChars()
    {
        char[] array = null;
        InsertionSort.sortChars(array);
        assertArrayEquals("Testing sortChars(char[] array) - Sorting a null array", null, array);
        
        array = new char[] {};
        InsertionSort.sortChars(array);
        assertArrayEquals("Testing sortChars(char[] array) - Sorting an empty array", new char[] {}, array);
        
        array = new char[] {'a', 'b', 'c', 'd', 'e'};
        InsertionSort.sortChars(array);
        assertArrayEquals("Testing sortChars(char[] array) - Sorting a sorted array", new char[] {'a', 'b', 'c', 'd', 'e'}, array);
        
        array = new char[] {'b', 'r', 'i', 'a', 'n'};
        InsertionSort.sortChars(array);
        assertArrayEquals("Testing sortChars(char[] array) - Sorting an unsorted array", new char[] {'a', 'b', 'i', 'n', 'r'}, array);
    }
}