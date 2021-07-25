/*************************************************************************
 *  {@code InsertionSort} class.
 *
 *  @version 25/7/21
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
     * Sorts the specified array of integers in ascending order using insertion sort.
     * 
     * @param array the unsorted array of integers
     */
    public static void sortInts(int[] array)
    {
        if(array != null)
        { 		
    	    //Inserts each element into correct position of sorted part of array
	        for(int i = 1; i < array.length; i++)
	        {   	
	    	    //Swaps until j reaches start of array or previous element is smaller
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
     * Sorts the specified array of doubles in ascending order using bubble sort.
     * 
     * @param array the unsorted array of doubles
     */
    public static void sortDoubles(double[] array)
    {
    	if(array != null)
    	{ 		
    	    //Inserts each element into correct position of sorted part of array
    	    for(int i = 1; i < array.length; i++)
    	    {   	
    	        //Swaps until j reaches start of array or previous element is smaller
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
     * Sorts the specified array of characters in ascending order using bubble sort.
     * 
     * @param array the unsorted array of characters
     */
    public static void sortChars(char[] array)
    {
    	if(array != null)
    	{ 		
    	    //Inserts each element into correct position of sorted part of array
    	    for(int i = 1; i < array.length; i++)
	    	{   	
    	        //Swaps until j reaches start of array or previous element is smaller
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