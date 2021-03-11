import java.util.Random;

/*************************************************************************
 *  Quicksort class.
 *
 *  @version 1.0 11/3/21
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
     * Sort an array of integers using quicksort in ascending order.
     * 
     * @param array: an unsorted array of integers.
     */
    public static void sortInts(int[] array)
    {
    	if(array != null)
    	{  		
    		//Shuffle array to avoid worst case performance
    		shuffleArray(array);
    		
    		//Make call to recursive quicksort method
    		sortInts(array, 0, array.length - 1);
    	}
    }
    
    /**
     * Shuffle an array to ensure it is not ordered for quicksort
     * 
     * @param array: an unsorted array of integers.
     */
    private static void shuffleArray(int[] array)
    {	
    	Random random = new Random();
    	for(int i = 0; i < array.length; i++)
    	{
    		//Swap every element with another random element
    		int indexToSwap = random.nextInt(array.length);
    		int temp = array[i];
    		array[i] = array[indexToSwap];
    		array[indexToSwap] = temp;
    	}
    }
    
    /**
     * Recursively use quicksort to sort array by partitioning array around pivot.
     * 
     * @param array: an unsorted array of integers.
     * @param low: start index of partition.
     * @param high: end index of partition.
     */
    private static void sortInts(int[] array, int low, int high)
    {
    	if(low < high)
    	{
    		int pivotPosition = partition(array, low, high);
    		
    		//Recursively sort elements before pivot
    		sortInts(array, low, pivotPosition - 1);
    		//Recursively sort elements after pivot
    		sortInts(array, pivotPosition + 1, high);
    	}
    }
    
    /**
     * Partitions array by placing items smaller than pivot to the left 
     * of the pivot and items larger than the pivot to the right.
     * 
     * @param array: an unsorted array of integers.
     * @param low: start index of partition.
     * @param high: end index of partition.
     * @return integer representing index of pivot that array has 
     * 		   been partitioned around.
     */
    private static int partition(int[] array, int low, int high)
    {
    	int i = low;
    	int j = high + 1;
    	int pivot = array[low];
    	while(i < j)
    	{
    		//Find rightmost element smaller than pivot
    		while((array[++i] < pivot) && (i < high)) {}
    		//Find leftmost element larger than pivot
    		while((pivot < array[--j]) && (j > low)) {}
    		
    		//Swap array[i] and array[j] if i < j
    		if(i < j) 
    		{    		
	    		int temp = array[i];
	    		array[i] = array[j];
	    		array[j] = temp;
    		}
    	}
    	//Swap pivot (array[low]) with array[j] to finish partitioning
    	array[low] = array[j];
    	array[j] = pivot;
    	
    	//Return index of pivot
    	return j;
    }
    
	/**
     * Sort an array of doubles using quicksort in ascending order.
     * 
     * @param array: an unsorted array of doubles.
     */
    public static void sortDoubles(double[] array)
    {
    	if(array != null)
    	{  		
    		//Shuffle array to avoid worst case performance
    		shuffleArray(array);
    		
    		//Make call to recursive quicksort method
    		sortDoubles(array, 0, array.length - 1);
    	}
    }
    
    /**
     * Shuffle an array to ensure it is not ordered for quicksort
     * 
     * @param array: an unsorted array of doubles.
     */
    private static void shuffleArray(double[] array)
    {	
    	Random random = new Random();
    	for(int i = 0; i < array.length; i++)
    	{
    		//Swap every element with another random element
    		int indexToSwap = random.nextInt(array.length);
    		double temp = array[i];
    		array[i] = array[indexToSwap];
    		array[indexToSwap] = temp;
    	}
    }
    
    /**
     * Recursively use quicksort to sort array by partitioning array around pivot.
     * 
     * @param array: an unsorted array of doubles.
     * @param low: start index of partition.
     * @param high: end index of partition.
     */
    private static void sortDoubles(double[] array, int low, int high)
    {
    	if(low < high)
    	{
    		int pivotPosition = partition(array, low, high);
    		
    		//Recursively sort elements before pivot
    		sortDoubles(array, low, pivotPosition - 1);
    		//Recursively sort elements after pivot
    		sortDoubles(array, pivotPosition + 1, high);
    	}
    }
    
    /**
     * Partitions array by placing items smaller than pivot to the left 
     * of the pivot and items larger than the pivot to the right.
     * 
     * @param array: an unsorted array of doubles.
     * @param low: start index of partition.
     * @param high: end index of partition.
     * @return integer representing index of pivot that array has 
     * 		   been partitioned around.
     */
    private static int partition(double[] array, int low, int high)
    {
    	int i = low;
    	int j = high + 1;
    	double pivot = array[low];
    	while(i < j)
    	{
    		//Find rightmost element smaller than pivot
    		while((array[++i] < pivot) && (i < high)) {}
    		//Find leftmost element larger than pivot
    		while((pivot < array[--j]) && (j > low)) {}
    		
    		//Swap array[i] and array[j] if i < j
    		if(i < j) 
    		{    		
	    		double temp = array[i];
	    		array[i] = array[j];
	    		array[j] = temp;
    		}
    	}
    	//Swap pivot (array[low]) with array[j] to finish partitioning
    	array[low] = array[j];
    	array[j] = pivot;
    	
    	//Return index of pivot
    	return j;
    }
    
	/**
     * Sort an array of characters using quicksort in alphabetical order.
     * 
     * @param array: an unsorted array of characters.
     */
    public static void sortChars(char[] array)
    {
    	if(array != null)
    	{  		
    		//Shuffle array to avoid worst case performance
    		shuffleArray(array);
    		
    		//Make call to recursive quicksort method
    		sortChars(array, 0, array.length - 1);
    	}
    }
    
    /**
     * Shuffle an array to ensure it is not ordered for quicksort
     * 
     * @param array: an unsorted array of characters.
     */
    private static void shuffleArray(char[] array)
    {	
    	Random random = new Random();
    	for(int i = 0; i < array.length; i++)
    	{
    		//Swap every element with another random element
    		int indexToSwap = random.nextInt(array.length);
    		char temp = array[i];
    		array[i] = array[indexToSwap];
    		array[indexToSwap] = temp;
    	}
    }
    
    /**
     * Recursively use quicksort to sort array by partitioning array around pivot.
     * 
     * @param array: an unsorted array of characters.
     * @param low: start index of partition.
     * @param high: end index of partition.
     */
    private static void sortChars(char[] array, int low, int high)
    {
    	if(low < high)
    	{
    		int pivotPosition = partition(array, low, high);
    		
    		//Recursively sort elements before pivot
    		sortChars(array, low, pivotPosition - 1);
    		//Recursively sort elements after pivot
    		sortChars(array, pivotPosition + 1, high);
    	}
    }
    
    /**
     * Partitions array by placing items smaller than pivot to the left 
     * of the pivot and items larger than the pivot to the right.
     * 
     * @param array: an unsorted array of characters.
     * @param low: start index of partition.
     * @param high: end index of partition.
     * @return integer representing index of pivot that array has 
     * 		   been partitioned around.
     */
    private static int partition(char[] array, int low, int high)
    {
    	int i = low;
    	int j = high + 1;
    	char pivot = array[low];
    	while(i < j)
    	{
    		//Find rightmost element smaller than pivot
    		while((array[++i] < pivot) && (i < high)) {}
    		//Find leftmost element larger than pivot
    		while((pivot < array[--j]) && (j > low)) {}
    		
    		//Swap array[i] and array[j] if i < j
    		if(i < j) 
    		{    		
	    		char temp = array[i];
	    		array[i] = array[j];
	    		array[j] = temp;
    		}
    	}
    	//Swap pivot (array[low]) with array[j] to finish partitioning
    	array[low] = array[j];
    	array[j] = pivot;
    	
    	//Return index of pivot
    	return j;
    }
}