/*************************************************************************
 *  Insertion Sort class.
 *
 *  @version 1.0 11/3/21
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
     * Sort an array of integers using insertion sort in ascending order.
     * 
     * @param array: an unsorted array of integers.
     */
    public static void sortInts(int[] array)
    {
    	if(array != null)
    	{ 		
    		//Insert each element into correct part of sorted array
	    	for(int i = 1; i < array.length; i++)
	    	{   	
	    		//Swap until j reaches start of array or previous element is smaller
	    		int j = i;
	    		int index = array[i];
	    		while((j > 0) && (array[j - 1] > index))
	    		{
	    			array[j] = array[j - 1];
	    			j--;
	    		}
	    		array[j] = index;
	    	}
    	}
    }
    
	/**
     * Sort an array of doubles using insertion sort in ascending order.
     * 
     * @param array: an unsorted array of doubles.
     */
    public static void sortDoubles(double[] array)
    {
    	if(array != null)
    	{ 		
    		//Insert each element into correct part of sorted array
	    	for(int i = 1; i < array.length; i++)
	    	{   	
	    		//Swap until j reaches start of array or previous element is smaller
	    		int j = i;
	    		double index = array[i];
	    		while((j > 0) && (array[j - 1] > index))
	    		{
	    			array[j] = array[j - 1];
	    			j--;
	    		}
	    		array[j] = index;
	    	}
    	}
    }
    
	/**
     * Sort an array of characters using insertion sort in alphabetical order.
     * 
     * @param array: an unsorted array of characters.
     */
    public static void sortChars(char[] array)
    {
    	if(array != null)
    	{ 		
    		//Insert each element into correct part of sorted array
	    	for(int i = 1; i < array.length; i++)
	    	{   	
	    		//Swap until j reaches start of array or previous element is smaller
	    		int j = i;
	    		char index = array[i];
	    		while((j > 0) && (array[j - 1] > index))
	    		{
	    			array[j] = array[j - 1];
	    			j--;
	    		}
	    		array[j] = index;
	    	}
    	}
    }
}