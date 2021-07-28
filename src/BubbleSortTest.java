import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
/*************************************************************************
 *  {@code BubbleSort} test class.
 *
 *  @version 28/7/21
 *
 *  @author Brian Whelan
 *
 *************************************************************************/
public class BubbleSortTest 
{
    /**
     * Test {@code sort(Comparable[] array)}
     */
    @Test
    public void testSort()
    {
    	Integer[] array = null;
    	BubbleSort.sort(array);
        assertArrayEquals("Testing sort(Comparable[] array) - Sorting a null array", null, array);
        
        array = new Integer[] {};
        BubbleSort.sort(array);
        assertArrayEquals("Testing sort(Comparable[] array) - Sorting an empty array", new Integer[] {}, array);
        
        array = new Integer[] {5, 10, 15, 20};
        BubbleSort.sort(array);
        assertArrayEquals("Testing sort(Comparable[] array) - Sorting a sorted array", new Integer[] {5, 10, 15, 20}, array);
        
        array = new Integer[] {20, 5, 15, 10};
        BubbleSort.sort(array);
        assertArrayEquals("Testing sort(Comparable[] array) - Sorting an unsorted array", new Integer[] {5, 10, 15, 20}, array);
    }
    
    /**
     * Test {@code sortDoubles(double[] array)}
     */
    @Test
    public void testDoubles()
    {
        Double[] array = null;
    	BubbleSort.sort(array);
        assertArrayEquals("Testing sortDoubles(double[] array) - Sorting a null array", null, array);
        
        array = new Double[] {};
        BubbleSort.sort(array);
        assertArrayEquals("Testing sortDoubles(double[] array) - Sorting an empty array", new Double[] {}, array);
        
        array = new Double[] {5.0, 10.0, 15.0, 20.0};
        BubbleSort.sort(array);
        assertArrayEquals("Testing sortDoubles(double[] array) - Sorting a sorted array", new Double[] {5.0, 10.0, 15.0, 20.0}, array);
        
        array = new Double[] {20.0, 5.0, 15.0, 10.0};
        BubbleSort.sort(array);
        assertArrayEquals("Testing sortDoubles(double[] array) - Sorting an unsorted array", new Double[] {5.0, 10.0, 15.0, 20.0}, array);
    }
    
    /**
     * Test {@code sortChars(char[] array)}
     */
    @Test
    public void testChars()
    {
        Character[] array = null;
    	BubbleSort.sort(array);
        assertArrayEquals("Testing sortChars(char[] array) - Sorting a null array", null, array);
        
        array = new Character[] {};
        BubbleSort.sort(array);
        assertArrayEquals("Testing sortChars(char[] array) - Sorting an empty array", new Character[] {}, array);
        
        array = new Character[] {'a', 'b', 'c', 'd', 'e'};
        BubbleSort.sort(array);
        assertArrayEquals("Testing sortChars(char[] array) - Sorting a sorted array", new Character[] {'a', 'b', 'c', 'd', 'e'}, array);
        
        array = new Character[] {'b', 'r', 'i', 'a', 'n'};
        BubbleSort.sort(array);
        assertArrayEquals("Testing sortChars(char[] array) - Sorting an unsorted array", new Character[] {'a', 'b', 'i', 'n', 'r'}, array);
    }

}