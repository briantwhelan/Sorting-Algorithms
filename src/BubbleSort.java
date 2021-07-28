/*************************************************************************
 *  {@code BubbleSort} class.
 *
 *  @version 28/7/21
 *
 *  @author Brian Whelan
 *
 *************************************************************************/
public class BubbleSort 
{
    /**
     * Don't let anyone instantiate this class.
     */
    private BubbleSort() {}
    
    /**
     * Sorts the specified array in ascending order using bubble sort.
     * 
     * @param array the unsorted array
     */
    public static void sort(Comparable[] array)
    {
    	if(array != null)
        {
    	    boolean sorted = false;
    	    for(int i = 0; (i < array.length - 1) && (!sorted); i++) 
    	    {
    	    	sorted = true;
    	    	for(int j = 0; j < array.length - i - 1; j++)
    	    	{
    	    	    if(array[j].compareTo(array[j + 1]) > 0) 
    	    	    {
    	    	        //Array is not sorted as swap is needed
    	    	        sorted = false;

    	    	        //Swaps array[j + 1] and array[j] 
    	    	        Comparable temp = array[j]; 
    	    	        array[j] = array[j + 1]; 
    	    	        array[j + 1] = temp; 
    	    	    }
    	    	}
    	    }
    	}
    }
}