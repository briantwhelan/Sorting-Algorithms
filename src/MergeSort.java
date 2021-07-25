/*************************************************************************
 *  {@code MergeSort} class.
 *
 *  @version 25/7/21
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
     * Sorts the specified array of integers in ascending order using merge sort.
     * 
     * @param array the unsorted array of integers
     */
    public static void sortInts(int[] array)
    {
       	if(array != null)
    	{   		
    	    //Creates auxiliary array to aid sorting
            int[] aux = new int[array.length];
	    	
            //Top-Down Merge Sort (recursive)
            //sortInts(array, aux, 0, array.length - 1);
	    	
            //Bottom-Up Merge Sort (iterative)
            sortInts(array, aux);
    	}
    }
    
    /**
     * (Recursively) Uses top-down merge sort to sort the specified array of integers.
     *
     * @param array the unsorted array of integers
     * @param aux the auxiliary array used to aid sorting
     * @param low the start index of {@code array}
     * @param high the end index of {@code array}
     */
    private static void sortInts(int array[], int aux[], int low, int high)
    {
    	boolean sorted = false;
    	if((low < high) && !sorted) 
    	{
    	    //Find middle point
    	    int mid = low + (high - low) / 2;
	    	
    	    //Sort first half
    	    sortInts(array, aux, low, mid);
	    	
    	    //Sort second half
    	    sortInts(array, aux, mid + 1, high);
	    	
    	    //Stop if already sorted
    	    if(array[mid] < array[mid + 1])
            {
    	        sorted = true;
            }
            else
            {
                //Merge the two sorted halves
                merge(array, aux, low, mid, high);
            }
    	}
    }
    
    /**
     * (Iteratively) Uses bottom-up merge sort to sort the specified array of integers.
     *
     * @param array the unsorted array of integers
     * @param aux the auxiliary array used to aid sorting
     */
    private static void sortInts(int[] array, int[] aux)
    {
    	//Pass through array and merge subarrays of size 1, 2, 4, ...
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
     * @param array the unsorted array of integers containing two sorted subarrays
     * @param aux the auxiliary array to aid sorting
     * @param low the start index of the first subarray
     * @param mid the end index of the first subarray (mid + 1 is the start index of the second subarray)
     * @param high the end index of the second subarray
     */
    private static void merge(int array[], int aux[], int low, int mid, int high)
    {
    	//Copy elements from original array into auxiliary array
    	for(int k = low; k <= high; k++)
    	{
    	    aux[k] = array[k];
    	}
    	
    	//Merge copied elements back into original array in sorted order
    	int i = low;
    	int j = mid + 1;
    	for(int k = low; k <= high; k++)
    	{
    	    if      (i > mid)           array[k] = aux[j++];
    	    else if (j > high)          array[k] = aux[i++];
    	    else if (aux[j] < aux[i])   array[k] = aux[j++];
    	    else                        array[k] = aux[i++];
    	}	
    }
    
    /**
     * Sorts the specified array of doubles in ascending order using bubble sort.
     * 
     * @param array the unsorted array of doubles
     */
    public static void sortDoubles(double[] array)
    {
       	if(array != null)
    	{   		
    	    //Creates auxiliary array to aid sorting
            double[] aux = new double[array.length];
	    	
            //Top-Down Merge Sort (recursive)
            //sortInts(array, aux, 0, array.length - 1);
	    	
            //Bottom-Up Merge Sort (iterative)
            sortDoubles(array, aux);
    	}
    }
    
    /**
     * (Recursively) Uses top-down merge sort to sort the specified array of doubles.
     *
     * @param array the unsorted array of doubles
     * @param aux the auxiliary array used to aid sorting
     * @param low the start index of {@code array}
     * @param high the end index of {@code array}
     */
    private static void sortDoubles(double array[], double aux[], int low, int high)
    {
    	boolean sorted = false;
    	if((low < high) && !sorted) 
    	{
    	    //Find middle point
    	    int mid = low + (high - low) / 2;
	    	
    	    //Sort first half
    	    sortDoubles(array, aux, low, mid);
	    	
    	    //Sort second half
    	    sortDoubles(array, aux, mid + 1, high);
	    	
    	    //Stop if already sorted
    	    if(array[mid] < array[mid + 1])
            {
    	        sorted = true;
            }
            else
            {
                //Merge the two sorted halves
                merge(array, aux, low, mid, high);
            }
    	}
    }
    
    /**
     * (Iteratively) Uses bottom-up merge sort to sort the specified array of doubles.
     *
     * @param array the unsorted array of doubles
     * @param aux the auxiliary array used to aid sorting
     */
    private static void sortDoubles(double[] array, double[] aux)
    {
    	//Pass through array and merge subarrays of size 1, 2, 4, ...
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
     * @param array the unsorted array of doubles containing two sorted subarrays
     * @param aux the auxiliary array to aid sorting
     * @param low the start index of the first subarray
     * @param mid the end index of the first subarray (mid + 1 is the start index of the second subarray)
     * @param high the end index of the second subarray
     */
    private static void merge(double array[], double aux[], int low, int mid, int high)
    {
    	//Copy elements from original array into auxiliary array
    	for(int k = low; k <= high; k++)
    	{
    	    aux[k] = array[k];
    	}
    	
    	//Merge copied elements back into original array in sorted order
    	int i = low;
    	int j = mid + 1;
    	for(int k = low; k <= high; k++)
    	{
    	    if      (i > mid)           array[k] = aux[j++];
    	    else if (j > high)          array[k] = aux[i++];
    	    else if (aux[j] < aux[i])   array[k] = aux[j++];
    	    else                        array[k] = aux[i++];
    	}	
    }
    
    /**
     * Sorts the specified array of characters in ascending order using bubble sort.
     * 
     * @param array the unsorted array of characters
     */
    public static void sortChars(char[] array)
    {
       	if(array != null)
    	{   		
    	    //Creates auxiliary array to aid sorting
            char[] aux = new char[array.length];
	    	
            //Top-Down Merge Sort (recursive)
            //sortInts(array, aux, 0, array.length - 1);
	    	
            //Bottom-Up Merge Sort (iterative)
            sortChars(array, aux);
    	}
    }
    
    /**
     * (Recursively) Uses top-down merge sort to sort the specified array of characters.
     *
     * @param array the unsorted array of characters
     * @param aux the auxiliary array used to aid sorting
     * @param low the start index of {@code array}
     * @param high the end index of {@code array}
     */
    private static void sortChars(char array[], char aux[], int low, int high)
    {
    	boolean sorted = false;
    	if((low < high) && !sorted) 
    	{
    	    //Find middle point
    	    int mid = low + (high - low) / 2;
	    	
    	    //Sort first half
    	    sortChars(array, aux, low, mid);
	    	
    	    //Sort second half
    	    sortChars(array, aux, mid + 1, high);
	    	
    	    //Stop if already sorted
    	    if(array[mid] < array[mid + 1])
            {
    	        sorted = true;
            }
            else
            {
                //Merge the two sorted halves
                merge(array, aux, low, mid, high);
            }
    	}
    }
    
    /**
     * (Iteratively) Uses bottom-up merge sort to sort the specified array of characters.
     *
     * @param array the unsorted array of characters
     * @param aux the auxiliary array used to aid sorting
     */
    private static void sortChars(char[] array, char[] aux)
    {
    	//Pass through array and merge subarrays of size 1, 2, 4, ...
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
     * @param array the unsorted array of characters containing two sorted subarrays
     * @param aux the auxiliary array to aid sorting
     * @param low the start index of the first subarray
     * @param mid the end index of the first subarray (mid + 1 is the start index of the second subarray)
     * @param high the end index of the second subarray
     */
    private static void merge(char array[], char aux[], int low, int mid, int high)
    {
    	//Copy elements from original array into auxiliary array
    	for(int k = low; k <= high; k++)
    	{
    	    aux[k] = array[k];
    	}
    	
    	//Merge copied elements back into original array in sorted order
    	int i = low;
    	int j = mid + 1;
    	for(int k = low; k <= high; k++)
    	{
    	    if      (i > mid)           array[k] = aux[j++];
    	    else if (j > high)          array[k] = aux[i++];
    	    else if (aux[j] < aux[i])   array[k] = aux[j++];
    	    else                        array[k] = aux[i++];
    	}	
    }
}