import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
/*************************************************************************
 *  {@code BubbleSort} test class.
 *
 *  @version 25/7/21
 *
 *  @author Brian Whelan
 *
 *************************************************************************/
public class BubbleSortTest 
{
    /**
     * Test {@code sortInts(int[] array)}
     */
    @Test
    public void testSortInts()
    {
    	int[] array = null;
    	BubbleSort.sortInts(array);
        assertArrayEquals("Testing sortInts(int[] array) - Sorting a null array", null, array);
        
        array = new int[] {};
        BubbleSort.sortInts(array);
        assertArrayEquals("Testing sortInts(int[] array) - Sorting an empty array", new int[] {}, array);
        
        array = new int[] {5, 10, 15, 20};
        BubbleSort.sortInts(array);
        assertArrayEquals("Testing sortInts(int[] array) - Sorting a sorted array", new int[] {5, 10, 15, 20}, array);
        
        array = new int[] {20, 5, 15, 10};
        BubbleSort.sortInts(array);
        assertArrayEquals("Testing sortInts(int[] array) - Sorting an unsorted array", new int[] {5, 10, 15, 20}, array);
    }
    
    /**
     * Test {@code sortDoubles(double[] array)}
     */
    @Test
    public void testDoubles()
    {
        double[] array = null;
    	BubbleSort.sortDoubles(array);
        assertArrayEquals("Testing sortDoubles(double[] array) - Sorting a null array", null, array, 0.0);
        
        array = new double[] {};
        BubbleSort.sortDoubles(array);
        assertArrayEquals("Testing sortDoubles(double[] array) - Sorting an empty array", new double[] {}, array, 0.0);
        
        array = new double[] {5.0, 10.0, 15.0, 20.0};
        BubbleSort.sortDoubles(array);
        assertArrayEquals("Testing sortDoubles(double[] array) - Sorting a sorted array", new double[] {5.0, 10.0, 15.0, 20.0}, array, 0.0);
        
        array = new double[] {20.0, 5.0, 15.0, 10.0};
        BubbleSort.sortDoubles(array);
        assertArrayEquals("Testing sortDoubles(double[] array) - Sorting an unsorted array", new double[] {5.0, 10.0, 15.0, 20.0}, array, 0.0);
    }
    
    /**
     * Test {@code sortChars(char[] array)}
     */
    @Test
    public void testChars()
    {
        char[] array = null;
    	BubbleSort.sortChars(array);
        assertArrayEquals("Testing sortChars(int[] array) - Sorting a null array", null, array);
        
        array = new char[] {};
        BubbleSort.sortChars(array);
        assertArrayEquals("Testing sortChars(int[] array) - Sorting an empty array", new char[] {}, array);
        
        array = new char[] {'a', 'b', 'c', 'd', 'e'};
        BubbleSort.sortChars(array);
        assertArrayEquals("Testing sortChars(int[] array) - Sorting a sorted array", new char[] {'a', 'b', 'c', 'd', 'e'}, array);
        
        array = new char[] {'b', 'r', 'i', 'a', 'n'};
        BubbleSort.sortChars(array);
        assertArrayEquals("Testing sortChars(int[] array) - Sorting an unsorted array", new char[] {'a', 'b', 'i', 'n', 'r'}, array);
    }
}