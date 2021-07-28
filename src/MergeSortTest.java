import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
/*************************************************************************
 *  {@code MergeSort} test class.
 *
 *  @version 28/7/21
 *
 *  @author Brian Whelan
 *
 *************************************************************************/
public class MergeSortTest 
{
    /**
     * Test {@code sort(Comparable[] array)}
     */
    @Test
    public void testSort()
    {
    	Integer[] array = null;
    	MergeSort.sort(array);
        assertArrayEquals("Testing sort(Comparable[] array) - Sorting a null array", null, array);
        
        array = new Integer[] {};
        MergeSort.sort(array);
        assertArrayEquals("Testing sort(Comparable[] array) - Sorting an empty array", new Integer[] {}, array);
        
        array = new Integer[] {5, 10, 15, 20};
        MergeSort.sort(array);
        assertArrayEquals("Testing sort(Comparable[] array) - Sorting a sorted array", new Integer[] {5, 10, 15, 20}, array);
        
        array = new Integer[] {20, 5, 15, 10};
        MergeSort.sort(array);
        assertArrayEquals("Testing sort(Comparable[] array) - Sorting an unsorted array", new Integer[] {5, 10, 15, 20}, array);
    }
}