/*************************************************************************
 *  {@code InsertionSort} class.
 *
 *  @version 28/7/21
 *
 *  @author Brian Whelan
 *
 *************************************************************************/
public class InsertionSort 
{
    /**
     * Don't let anyone instantiate this class.
     */
    private InsertionSort() {}
	
    /**
     * Sorts the specified array in ascending order using insertion sort.
     * 
     * @param array the unsorted array
     */
    public static void sort(Comparable[] array)
    {
    	if(array != null)
    	{ 		
    	    //Inserts each element into correct position of sorted part of array
    	    for(int i = 1; i < array.length; i++)
    	    {   	
    	        //Swaps until j reaches start of array or previous element is smaller
    	        int j = i;
    	        Comparable index = array[i];
    	        while((j > 0) && (array[j - 1].compareTo(index) > 0))
    	        {
    	            array[j] = array[j - 1];
    	            j--;
    	        }
    	        array[j] = index;
            }
    	}
    }
}