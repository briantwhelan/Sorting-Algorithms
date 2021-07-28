import java.util.Random;
/*************************************************************************
 *  {@code Quicksort} class.
 *
 *  @version 28/7/21
 *
 *  @author Brian Whelan
 *
 *************************************************************************/
public class Quicksort 
{
    /**
     * Don't let anyone instantiate this class.
     */
    private Quicksort() {}
	
    /**
     * Sorts the specified array in ascending order using quicksort.
     * 
     * @param array the unsorted array
     */
    public static void sort(Comparable[] array)
    {
        if(array != null)
        {  		
            //Shuffles array to avoid worst case performance
            shuffleArray(array);
    		
            //Makes call to recursive quicksort method
            sort(array, 0, array.length - 1);
        }
     }
    
    /**
     * Shuffles the specified array to ensure it is not ordered for quicksort.
     * 
     * @param array the array
     */
    private static void shuffleArray(Comparable[] array)
    {	
    	Random random = new Random();
        for(int i = 0; i < array.length; i++)
        {
            //Swaps every element with another random element
            int indexToSwap = random.nextInt(array.length);
            Comparable temp = array[i];
            array[i] = array[indexToSwap];
            array[indexToSwap] = temp;
        }
    }
    
    /**
     * (Recursively) Uses quicksort to sort the specified array by partitioning array around a pivot.
     * 
     * @param array the unsorted array
     * @param low the start index of the partition
     * @param high the end index of the partition
     */
    private static void sort(Comparable[] array, int low, int high)
    {
        if(low < high)
        {
    	    int pivotPosition = partition(array, low, high);
    		
            //Recursively sorts elements before pivot
            sort(array, low, pivotPosition - 1);
            //Recursively sorts elements after pivot
            sort(array, pivotPosition + 1, high);
    	}
    }
    
    /**
     * Partitions the specified array by placing elements smaller than the pivot to the left of the pivot and elements larger than the pivot to the right.
     * 
     * @param array the unsorted array
     * @param low the start index of partition
     * @param high the end index of partition
     * @return the index of the pivot
     */
    private static int partition(Comparable[] array, int low, int high)
    {
        int i = low;
        int j = high + 1;
        Comparable pivot = array[low];
        while(i < j)
        {
    	    //Finds rightmost element smaller than pivot
    	    while((array[++i].compareTo(pivot) < 0) && (i < high)) {}
    	    //Finds leftmost element larger than pivot
    	    while((pivot.compareTo(array[--j]) < 0) && (j > low)) {}
    		
    	    //Swaps array[i] and array[j] if i < j
    	    if(i < j) 
    	    {    		
	    	    Comparable temp = array[i];
	    	    array[i] = array[j];
	    	    array[j] = temp;
    	    }
        }
        //Swaps pivot (array[low]) with array[j] to finish partitioning
        array[low] = array[j];
        array[j] = pivot;
    	
        //Returns index of pivot
    	return j;
    }
}