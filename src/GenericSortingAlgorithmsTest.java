import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
/*************************************************************************
 *  {@code GenericSortingAlgorithms} test class.
 *
 *  @version 25/7/21
 *
 *  @author Brian Whelan
 *
 *************************************************************************/
public class GenericSortingAlgorithmsTest 
{
    /**
     * Test {@code GenericSortingAlgorithms()} 
     */
    @Test
    public void testConstructor1()
    {  	
    	new GenericSortingAlgorithms<Integer>();
    }
    
    /**
     * Test {@code bubbleSort(T[] array)}
     */
    @Test
    public void testBubbleSort()
    {
    	GenericSortingAlgorithms<Integer> sortingAlgorithms = new GenericSortingAlgorithms<Integer>();
    	
    	Integer[] array = null;
    	sortingAlgorithms.bubbleSort(array);
        assertArrayEquals("Testing bubbleSort(T[] array) - Sorting a null array", null, array);
        
        array = new Integer[] {};
        sortingAlgorithms.bubbleSort(array);
        assertArrayEquals("Testing bubbleSort(T[] array) - Sorting an empty array", new Integer[] {}, array);
        
        array = new Integer[] {5, 10, 15, 20};
        sortingAlgorithms.bubbleSort(array);
        assertArrayEquals("Testing bubbleSort(T[] array) - Sorting a sorted array", new Integer[] {5, 10, 15, 20}, array);
        
        array = new Integer[] {20, 5, 15, 10};
        sortingAlgorithms.bubbleSort(array);
        assertArrayEquals("Testing bubbleSort(T[] array) - Sorting an unsorted array", new Integer[] {5, 10, 15, 20}, array);
    }
    
    /**
     * Test {@code insertionSort(T[] array)}
     */
    @Test
    public void testInsertionSort()
    {
    	GenericSortingAlgorithms<Integer> sortingAlgorithms = new GenericSortingAlgorithms<Integer>();
    	
    	Integer[] array = null;
    	sortingAlgorithms.insertionSort(array);
        assertArrayEquals("Testing insertionSort(T[] array) - Sorting a null array", null, array);
        
        array = new Integer[] {};
        sortingAlgorithms.insertionSort(array);
        assertArrayEquals("Testing insertionSort(T[] array) - Sorting an empty array", new Integer[] {}, array);
        
        array = new Integer[] {5, 10, 15, 20};
        sortingAlgorithms.insertionSort(array);
        assertArrayEquals("Testing insertionSort(T[] array) - Sorting a sorted array", new Integer[] {5, 10, 15, 20}, array);
        
        array = new Integer[] {20, 5, 15, 10};
        sortingAlgorithms.insertionSort(array);
        assertArrayEquals("Testing insertionSort(T[] array) - Sorting an unsorted array", new Integer[] {5, 10, 15, 20}, array);
    }
    
    /**
     * Test {@code mergeSort(T[] array)}
     */
    @Test
    public void testMergeSort()
    {
    	GenericSortingAlgorithms<Integer> sortingAlgorithms = new GenericSortingAlgorithms<Integer>();
    	
    	Integer[] array = null;
    	sortingAlgorithms.mergeSort(array);
        assertArrayEquals("Testing mergeSort(T[] array) - Sorting a null array", null, array);
        
        array = new Integer[] {};
        sortingAlgorithms.mergeSort(array);
        assertArrayEquals("Testing mergeSort(T[] array) - Sorting an empty array", new Integer[] {}, array);
        
        array = new Integer[] {5, 10, 15, 20};
        sortingAlgorithms.mergeSort(array);
        assertArrayEquals("Testing mergeSort(T[] array) - Sorting a sorted array", new Integer[] {5, 10, 15, 20}, array);
        
        array = new Integer[] {20, 5, 15, 10};
        sortingAlgorithms.mergeSort(array);
        assertArrayEquals("Testing mergeSort(T[] array) - Sorting an unsorted array", new Integer[] {5, 10, 15, 20}, array);
    }
    
    /**
     * Test {@code quicksort(T[] array)}
     */
    @Test
    public void testQuicksort()
    {
    	GenericSortingAlgorithms<Integer> sortingAlgorithms = new GenericSortingAlgorithms<Integer>();
    	
    	Integer[] array = null;
    	sortingAlgorithms.quicksort(array);
        assertArrayEquals("Testing quicksort(T[] array) - Sorting a null array", null, array);
        
        array = new Integer[] {};
        sortingAlgorithms.quicksort(array);
        assertArrayEquals("Testing quicksort(T[] array) - Sorting an empty array", new Integer[] {}, array);
        
        array = new Integer[] {5, 10, 15, 20};
        sortingAlgorithms.quicksort(array);
        assertArrayEquals("Testing quicksort(T[] array) - Sorting a sorted array", new Integer[] {5, 10, 15, 20}, array);
        
        array = new Integer[] {20, 5, 15, 10};
        sortingAlgorithms.quicksort(array);
        assertArrayEquals("Testing quicksort(T[] array) - Sorting an unsorted array", new Integer[] {5, 10, 15, 20}, array);
    }
    
    /**
     * Test {@code selectionSort(T[] array)}
     */
    @Test
    public void testSelectionSort()
    {
    	GenericSortingAlgorithms<Integer> sortingAlgorithms = new GenericSortingAlgorithms<Integer>();
    	
    	Integer[] array = null;
    	sortingAlgorithms.selectionSort(array);
        assertArrayEquals("Testing selectionSort(T[] array) - Sorting a null array", null, array);
        
        array = new Integer[] {};
        sortingAlgorithms.selectionSort(array);
        assertArrayEquals("Testing selectionSort(T[] array) - Sorting an empty array", new Integer[] {}, array);
        
        array = new Integer[] {5, 10, 15, 20};
        sortingAlgorithms.selectionSort(array);
        assertArrayEquals("Testing selectionSort(T[] array) - Sorting a sorted array", new Integer[] {5, 10, 15, 20}, array);
        
        array = new Integer[] {20, 5, 15, 10};
        sortingAlgorithms.selectionSort(array);
        assertArrayEquals("Testing selectionSort(T[] array) - Sorting an unsorted array", new Integer[] {5, 10, 15, 20}, array);
    }
    
    /**
     * Test {@code shellSort(T[] array)}
     */
    @Test
    public void testShellSort()
    {
    	GenericSortingAlgorithms<Integer> sortingAlgorithms = new GenericSortingAlgorithms<Integer>();
    	
    	Integer[] array = null;
    	sortingAlgorithms.shellSort(array);
        assertArrayEquals("Testing shellSort(T[] array) - Sorting a null array", null, array);
        
        array = new Integer[] {};
        sortingAlgorithms.shellSort(array);
        assertArrayEquals("Testing shellSort(T[] array) - Sorting an empty array", new Integer[] {}, array);
        
        array = new Integer[] {5, 10, 15, 20};
        sortingAlgorithms.shellSort(array);
        assertArrayEquals("Testing shellSort(T[] array) - Sorting a sorted array", new Integer[] {5, 10, 15, 20}, array);
        
        array = new Integer[] {20, 5, 15, 10};
        sortingAlgorithms.shellSort(array);
        assertArrayEquals("Testing shellSort(T[] array) - Sorting an unsorted array", new Integer[] {5, 10, 15, 20}, array);
    }
}