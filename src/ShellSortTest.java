import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
/*************************************************************************
 *  Shell Sort test class.
 *
 *  @version 1.0 13/3/21
 *
 *  @author Brian Whelan
 *
 *************************************************************************/
public class ShellSortTest 
{
	/**
     * Test shell sort for integers
     */
    @Test
    public void testSortingInts()
    {
        //Test null array
    	int[] array = null;
    	ShellSort.sortInts(array);
        assertArrayEquals("Testing shell sort for a null array", null, array);
        
        //Test empty array
        array = new int[] {};
        ShellSort.sortInts(array);
        assertArrayEquals("Testing shell sort for an empty array", new int[] {}, array);
        
        //Test sorted array
        array = new int[] {5, 10, 15, 20};
        ShellSort.sortInts(array);
        assertArrayEquals("Testing shell sort for a sorted array", new int[] {5, 10, 15, 20}, array);
        
        //Test unsorted array
        array = new int[] {20, 5, 15, 10};
        ShellSort.sortInts(array);
        assertArrayEquals("Testing shell sort for an unsorted array", new int[] {5, 10, 15, 20}, array);
    }
    
	/**
     * Test shell sort for doubles
     */
    @Test
    public void testSortingDoubles()
    {
        //Test null array
    	double[] array = null;
    	ShellSort.sortDoubles(array);
        assertArrayEquals("Testing shell sort for a null array", null, array, 0.0);
        
        //Test empty array
        array = new double[] {};
        ShellSort.sortDoubles(array);
        assertArrayEquals("Testing shell sort for an empty array", new double[] {}, array, 0.0);
        
        //Test sorted array
        array = new double[] {5.0, 10.0, 15.0, 20.0};
        ShellSort.sortDoubles(array);
        assertArrayEquals("Testing shell sort for a sorted array", new double[] {5.0, 10.0, 15.0, 20.0}, array, 0.0);
        
        //Test unsorted array
        array = new double[] {20.0, 5.0, 15.0, 10.0};
        ShellSort.sortDoubles(array);
        assertArrayEquals("Testing shell sort for an unsorted array", new double[] {5.0, 10.0, 15.0, 20.0}, array, 0.0);
    }
    
	/**
     * Test shell sort for characters
     */
    @Test
    public void testSortingCharacters()
    {
        //Test null array
    	char[] array = null;
    	ShellSort.sortChars(array);
        assertArrayEquals("Testing shell sort for a null array", null, array);
        
        //Test empty array
        array = new char[] {};
        ShellSort.sortChars(array);
        assertArrayEquals("Testing shell sort for an empty array", new char[] {}, array);
        
        //Test sorted array
        array = new char[] {'a', 'b', 'c', 'd', 'e'};
        ShellSort.sortChars(array);
        assertArrayEquals("Testing shell sort for a sorted array", new char[] {'a', 'b', 'c', 'd', 'e'}, array);
        
        //Test unsorted array
        array = new char[] {'b', 'r', 'i', 'a', 'n'};
        ShellSort.sortChars(array);
        assertArrayEquals("Testing shell sort for an unsorted array", new char[] {'a', 'b', 'i', 'n', 'r'}, array);
    }
}
