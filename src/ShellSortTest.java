import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
/*************************************************************************
 *  {@code ShellSort} test class.
 *
 *  @version 28/7/21
 *
 *  @author Brian Whelan
 *
 *************************************************************************/
public class ShellSortTest 
{
    /**
     * Test {@code sort(Comparable[] array)}
     */
    @Test
    public void testSort()
    {
    	Integer[] array = null;
    	ShellSort.sort(array);
        assertArrayEquals("Testing sort(Comparable[] array) - Sorting a null array", null, array);
        
        array = new Integer[] {};
        ShellSort.sort(array);
        assertArrayEquals("Testing sort(Comparable[] array) - Sorting an empty array", new Integer[] {}, array);
        
        array = new Integer[] {5, 10, 15, 20};
        ShellSort.sort(array);
        assertArrayEquals("Testing sort(Comparable[] array) - Sorting a sorted array", new Integer[] {5, 10, 15, 20}, array);
        
        array = new Integer[] {20, 5, 15, 10};
        ShellSort.sort(array);
        assertArrayEquals("Testing sort(Comparable[] array) - Sorting an unsorted array", new Integer[] {5, 10, 15, 20}, array);
    }
}