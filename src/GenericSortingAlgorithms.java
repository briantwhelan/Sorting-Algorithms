import java.util.Random;
/*************************************************************************
 *  {@code GenericSortingAlgorithms} class.
 *  
 *  @version 25/7/21
 *
 *  @author Brian Whelan
 *
 *************************************************************************/
public class GenericSortingAlgorithms<T extends Comparable<T>>
{	
	/**
     * Creates a {@code GenericSortingAlgorithms} object to sort arrays using various algorithms.
     */
    public GenericSortingAlgorithms() {}
    
    /**
     * Sorts the specified array in ascending order using bubble sort.
     * 
     * @param array the unsorted array
     */
    public void bubbleSort(T[] array)
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
    	    	        T temp = array[j]; 
    	    	        array[j] = array[j + 1]; 
    	    	        array[j + 1] = temp; 
    	    	    }
    	    	}
    	    }
    	}
    }
    
    /**
     * Sorts the specified array in ascending order using insertion sort.
     * 
     * @param array the unsorted array
     */
    public void insertionSort(T[] array)
    {
    	if(array != null)
    	{ 		
    	    //Inserts each element into correct position of sorted part of array
    	    for(int i = 1; i < array.length; i++)
    	    {   	
    	        //Swaps until j reaches start of array or previous element is smaller
    	        int j = i;
    	        T index = array[i];
    	        while((j > 0) && (array[j - 1].compareTo(index) > 0))
    	        {
    	            array[j] = array[j - 1];
    	            j--;
    	        }
    	        array[j] = index;
            }
    	}
    }
    
    /**
     * Sorts the specified array in ascending order using merge sort.
     * 
     * @param array the unsorted array
     */
    public void mergeSort(T[] array)
    {
       	if(array != null)
    	{   		
    	    //Creates auxiliary array to aid sorting
            T[] aux = (T[]) new Comparable[array.length];
	    	
            //Top-Down Merge Sort (recursive)
            //mergeSort(array, aux, 0, array.length - 1);
	    	
            //Bottom-Up Merge Sort (iterative)
            mergeSort(array, aux);
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
    private void mergeSort(T[] array, T[] aux, int low, int high)
    {
    	boolean sorted = false;
    	if((low < high) && !sorted) 
    	{
    	    //Finds middle point
    	    int mid = low + (high - low) / 2;
	    	
    	    //Sorts first half
    	    mergeSort(array, aux, low, mid);
	    	
    	    //Sorts second half
    	    mergeSort(array, aux, mid + 1, high);
	    	
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
    private void mergeSort(T[] array, T[] aux)
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
    private void merge(T[] array, T[] aux, int low, int mid, int high)
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
    
    /**
     * Sorts the specified array in ascending order using quicksort.
     * 
     * @param array the unsorted array
     */
    public void quicksort(T[] array)
    {
        if(array != null)
        {  		
            //Shuffles array to avoid worst case performance
            shuffleArray(array);
    		
            //Makes call to recursive quicksort method
            quicksort(array, 0, array.length - 1);
        }
     }
    
    /**
     * Shuffles the specified array to ensure it is not ordered for quicksort.
     * 
     * @param array the array
     */
    private void shuffleArray(T[] array)
    {	
    	Random random = new Random();
        for(int i = 0; i < array.length; i++)
        {
            //Swaps every element with another random element
            int indexToSwap = random.nextInt(array.length);
            T temp = array[i];
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
    private void quicksort(T[] array, int low, int high)
    {
        if(low < high)
        {
    	    int pivotPosition = partition(array, low, high);
    		
            //Recursively sorts elements before pivot
            quicksort(array, low, pivotPosition - 1);
            //Recursively sorts elements after pivot
            quicksort(array, pivotPosition + 1, high);
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
    private int partition(T[] array, int low, int high)
    {
        int i = low;
        int j = high + 1;
        T pivot = array[low];
        while(i < j)
        {
    	    //Finds rightmost element smaller than pivot
    	    while((array[++i].compareTo(pivot) < 0) && (i < high)) {}
    	    //Finds leftmost element larger than pivot
    	    while((pivot.compareTo(array[--j]) < 0) && (j > low)) {}
    		
    	    //Swaps array[i] and array[j] if i < j
    	    if(i < j) 
    	    {    		
	    	    T temp = array[i];
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
    
    /**
     * Sorts the specified array in ascending order using selection sort.
     * 
     * @param array the unsorted array
     */
    public void selectionSort(T[] array)
    {
    	if(array != null)
    	{   		
            //Moves the boundary of unsorted part of array one by one
            for(int i = 0; i < array.length - 1; i++)
            {
                //Finds the minimum element in the unsorted part of the array
                int minIndex = i;
                for(int j = i + 1; j < array.length; j++)
                {
                    if(array[j].compareTo(array[minIndex]) < 0)
                    {
                        minIndex = j;
                    }
                }
	
                //Swaps the found minimum element with the first element in the unsorted part of the array
                T temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
    	}
    }
    
    /**
     * Sorts the specified array in ascending order using shell sort.
     * 
     * @param array the unsorted array
     */
    public void shellSort(T[] array)
    {
        if(array != null)
        {
            for(int gap = array.length/2; gap > 0; gap /= 2) 
            { 
                for(int i = gap; i < array.length; i++) 
                { 
                    //Shifts elements until the correct array[i] position is found
                    T temp = array[i]; 
                    int j; 
                    for(j = i; (j >= gap) && (array[j - gap].compareTo(temp) > 0); j -= gap) 
                    {
                        array[j] = array[j - gap]; 
                    }
                    array[j] = temp; 
                }
            }
        }
    }
}