/*************************************************************************
 *  {@code MergeSort} class.
 *
 *  @version 28/7/21
 *
 *  @author Brian Whelan
 *
 *************************************************************************/
public class MergeSort 
{
    /**
     * Don't let anyone instantiate this class.
     */
    private MergeSort() {}
	
    /**
     * Sorts the specified array in ascending order using merge sort.
     * 
     * @param array the unsorted array
     */
    public static void sort(Comparable[] array)
    {
       	if(array != null)
    	{   		
    	    //Creates auxiliary array to aid sorting
       		Comparable[] aux = new Comparable[array.length];
	    	
            //Top-Down Merge Sort (recursive)
            //sort(array, aux, 0, array.length - 1);
	    	
            //Bottom-Up Merge Sort (iterative)
            sort(array, aux);
    	}
    }
    
    /**
     * (Recursively) Uses top-down merge sort to sort the specified array.
     *
     * @param array the unsorted array
     * @param aux the auxiliary array used to aid sorting
     * @param low the start index of {@code array}
     * @param high the end index of {@code array}
     */
    private static void sort(Comparable[] array, Comparable[] aux, int low, int high)
    {
    	boolean sorted = false;
    	if((low < high) && !sorted) 
    	{
    	    //Finds middle point
    	    int mid = low + (high - low) / 2;
	    	
    	    //Sorts first half
    	    sort(array, aux, low, mid);
	    	
    	    //Sorts second half
    	    sort(array, aux, mid + 1, high);
	    	
    	    //Stops if already sorted
    	    if(array[mid].compareTo(array[mid + 1]) < 0)
            {
    	        sorted = true;
            }
            else
            {
                //Merges the two sorted halves
                merge(array, aux, low, mid, high);
            }
    	}
    }
    
    /**
     * (Iteratively) Uses bottom-up merge sort to sort the specified array.
     *
     * @param array the unsorted array
     * @param aux the auxiliary array used to aid sorting
     */
    private static void sort(Comparable[] array, Comparable[] aux)
    {
    	//Passes through array and merges subarrays of size 1, 2, 4, ...
    	for(int size = 1; size < array.length; size = size + size)
    	{
    	    for(int low = 0; low < array.length - size; low += size + size)
            {
    	        merge(array, aux, low, low + size - 1, Math.min(low + size + size - 1, array.length - 1));
    	    }
    	}
    }
    
    /**
     * Merges the two specified sorted subarrays into a larger sorted array.
     *
     * @param array the unsorted array containing two sorted subarrays
     * @param aux the auxiliary array to aid sorting
     * @param low the start index of the first subarray
     * @param mid the end index of the first subarray (mid + 1 is the start index of the second subarray)
     * @param high the end index of the second subarray
     */
    private static void merge(Comparable[] array, Comparable[] aux, int low, int mid, int high)
    {
    	//Copys elements from original array into auxiliary array
    	for(int k = low; k <= high; k++)
    	{
    	    aux[k] = array[k];
    	}
    	
    	//Merges copied elements back into original array in sorted order
    	int i = low;
    	int j = mid + 1;
    	for(int k = low; k <= high; k++)
    	{
    	    if      (i > mid)                        array[k] = aux[j++];
    	    else if (j > high)                       array[k] = aux[i++];
    	    else if (aux[j].compareTo(aux[i]) < 0)   array[k] = aux[j++];
    	    else                                     array[k] = aux[i++];
    	}	
    }
}