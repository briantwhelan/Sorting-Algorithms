import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
/*************************************************************************
 *  Bubble Sort test class.
 *
 *  @version 1.0 13/3/21
 *
 *  @author Brian Whelan
 *
 *************************************************************************/
public class BubbleSortTest 
{
	/**
     * Test bubble sort for integers
     */
    @Test
    public void testSortingInts()
    {
        //Test null array
    	int[] array = null;
    	BubbleSort.sortInts(array);
        assertArrayEquals("Testing bubble sort for a null array", null, array);
        
        //Test empty array
        array = new int[] {};
        BubbleSort.sortInts(array);
        assertArrayEquals("Testing bubble sort for an empty array", new int[] {}, array);
        
        //Test sorted array
        array = new int[] {5, 10, 15, 20};
        BubbleSort.sortInts(array);
        assertArrayEquals("Testing bubble sort for a sorted array", new int[] {5, 10, 15, 20}, array);
        
        //Test unsorted array
        array = new int[] {20, 5, 15, 10};
        BubbleSort.sortInts(array);
        assertArrayEquals("Testing bubble sort for an unsorted array", new int[] {5, 10, 15, 20}, array);
    }
    
	/**
     * Test bubble sort for doubles
     */
    @Test
    public void testSortingDoubles()
    {
        //Test null array
    	double[] array = null;
    	BubbleSort.sortDoubles(array);
        assertArrayEquals("Testing bubble sort for a null array", null, array, 0.0);
        
        //Test empty array
        array = new double[] {};
        BubbleSort.sortDoubles(array);
        assertArrayEquals("Testing bubble sort for an empty array", new double[] {}, array, 0.0);
        
        //Test sorted array
        array = new double[] {5.0, 10.0, 15.0, 20.0};
        BubbleSort.sortDoubles(array);
        assertArrayEquals("Testing bubble sort for a sorted array", new double[] {5.0, 10.0, 15.0, 20.0}, array, 0.0);
        
        //Test unsorted array
        array = new double[] {20.0, 5.0, 15.0, 10.0};
        BubbleSort.sortDoubles(array);
        assertArrayEquals("Testing bubble sort for an unsorted array", new double[] {5.0, 10.0, 15.0, 20.0}, array, 0.0);
    }
    
	/**
     * Test bubble sort for characters
     */
    @Test
    public void testSortingCharacters()
    {
        //Test null array
    	char[] array = null;
    	BubbleSort.sortChars(array);
        assertArrayEquals("Testing bubble sort for a null array", null, array);
        
        //Test empty array
        array = new char[] {};
        BubbleSort.sortChars(array);
        assertArrayEquals("Testing bubble sort for an empty array", new char[] {}, array);
        
        //Test sorted array
        array = new char[] {'a', 'b', 'c', 'd', 'e'};
        BubbleSort.sortChars(array);
        assertArrayEquals("Testing bubble sort for a sorted array", new char[] {'a', 'b', 'c', 'd', 'e'}, array);
        
        //Test unsorted array
        array = new char[] {'b', 'r', 'i', 'a', 'n'};
        BubbleSort.sortChars(array);
        assertArrayEquals("Testing bubble sort for an unsorted array", new char[] {'a', 'b', 'i', 'n', 'r'}, array);
    }
}
