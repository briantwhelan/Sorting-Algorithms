/*************************************************************************
 *  {@code BubbleSort} class.
 *
 *  @version 24/7/21
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
     * Sorts the specified array of integers in ascending order using bubble sort.
     * 
     * @param array the unsorted array of integers
     */
    public static void sortInts(int[] array)
    {
        if(array != null)
        {
    	    boolean sorted = false;
    	    for(int i = 0; (i < array.length - 1) && (!sorted); i++) 
    	    {
    	    	sorted = true;
    	    	for(int j = 0; j < array.length - i - 1; j++)
    	    	{
    	    	    if(array[j] > array[j + 1]) 
    	    	    {
    	    	        //Array is not sorted as swap was needed
    	    		    sorted = false;

    	    		    //Swaps array[j + 1] and array[j] 
    	    		    int temp = array[j]; 
    	    		    array[j] = array[j + 1]; 
    	    		    array[j + 1] = temp; 
    	    	    }
    	    	}
    	    }
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
    	    boolean sorted = false;
    	    for(int i = 0; (i < array.length - 1) && (!sorted); i++) 
    	    {
    	    	sorted = true;
    	    	for(int j = 0; j < array.length - i - 1; j++)
    	    	{
    	    	    if(array[j] > array[j + 1]) 
    	    	    { 
    	    		    //Array is not sorted as swap was needed
    	    		    sorted = false;

    	    		    //Swaps array[j + 1] and array[j] 
    	    		    double temp = array[j]; 
    	    		    array[j] = array[j + 1]; 
    	    		    array[j + 1] = temp; 
    	    	    }
    	    	}
    	    }
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
    	    boolean sorted = false;
    	    for(int i = 0; (i < array.length - 1) && (!sorted); i++) 
    	    {
    	    	sorted = true;
    	    	for(int j = 0; j < array.length - i - 1; j++)
    	    	{
    	    	    if(array[j] > array[j + 1]) 
    	    	    { 
    	    		    //Array is not sorted as swap was needed
    	    		    sorted = false;

    	    		    //Swaps array[j + 1] and array[j] 
    	    		    char temp = array[j]; 
    	    		    array[j] = array[j + 1]; 
    	    		    array[j + 1] = temp; 
    	    	    }
    	    	}
    	    }
    	}
    }
}