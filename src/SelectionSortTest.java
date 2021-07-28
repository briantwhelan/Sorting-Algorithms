import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
/*************************************************************************
 *  {@code SelectionSort} test class.
 *
 *  @version 28/7/21
 *
 *  @author Brian Whelan
 *
 *************************************************************************/
public class SelectionSortTest 
{
    /**
     * Test {@code sort(Comparable[] array)}
     */
    @Test
    public void testSort()
    {
    	Integer[] array = null;
    	SelectionSort.sort(array);
        assertArrayEquals("Testing sort(Comparable[] array) - Sorting a null array", null, array);
        
        array = new Integer[] {};
        SelectionSort.sort(array);
        assertArrayEquals("Testing sort(Comparable[] array) - Sorting an empty array", new Integer[] {}, array);
        
        array = new Integer[] {5, 10, 15, 20};
        SelectionSort.sort(array);
        assertArrayEquals("Testing sort(Comparable[] array) - Sorting a sorted array", new Integer[] {5, 10, 15, 20}, array);
        
        array = new Integer[] {20, 5, 15, 10};
        SelectionSort.sort(array);
        assertArrayEquals("Testing sort(Comparable[] array) - Sorting an unsorted array", new Integer[] {5, 10, 15, 20}, array);
    }
}