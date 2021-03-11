/*************************************************************************
 *  Selection Sort class.
 *
 *  @version 1.0 11/3/21
 *
 *  @author Brian Whelan
 *
 *************************************************************************/
public class SelectionSort 
{
	/**
     * Don't let anyone instantiate this class.
     */
	private SelectionSort() {}
	
	/**
     * Sort an array of integers using selection sort in ascending order.
     * 
     * @param array: an unsorted array of integers.
     */
    public static void sortInts(int[] array)
    {
    	if(array != null)
    	{   		
	    	//One by one move boundary of unsorted array
	    	for(int i = 0; i < array.length - 1; i++)
	    	{
	    		//Find the minimum element in unsorted array
	    		int min_idx = i;
	    		for(int j = i + 1; j < array.length; j++)
	    		{
	    			if(array[j] < array[min_idx])
	    			{
	    				min_idx = j;
	    			}
	    		}
	
	    		//Swap the found minimum element with the first element in unsorted array
	    		int temp = array[min_idx];
	    		array[min_idx] = array[i];
	    		array[i] = temp;
	    	}
    	}
    }
    
	/**
     * Sort an array of doubles using selection sort in ascending order.
     * 
     * @param array: an unsorted array of doubles.
     */
    public static void sortDoubles(double[] array)
    {
    	if(array != null)
    	{   		
	    	//One by one move boundary of unsorted array
	    	for(int i = 0; i < array.length - 1; i++)
	    	{
	    		//Find the minimum element in unsorted array
	    		int min_idx = i;
	    		for(int j = i + 1; j < array.length; j++)
	    		{
	    			if(array[j] < array[min_idx])
	    			{
	    				min_idx = j;
	    			}
	    		}
	
	    		//Swap the found minimum element with the first element in unsorted array
	    		double temp = array[min_idx];
	    		array[min_idx] = array[i];
	    		array[i] = temp;
	    	}
    	}
    }
    
	/**
     * Sort an array of characters using selection sort in alphabetical order.
     * 
     * @param array: an unsorted array of characters.
     */
    public static void sortChars(char[] array)
    {
    	if(array != null)
    	{   		
	    	//One by one move boundary of unsorted array
	    	for(int i = 0; i < array.length - 1; i++)
	    	{
	    		//Find the minimum element in unsorted array
	    		int min_idx = i;
	    		for(int j = i + 1; j < array.length; j++)
	    		{
	    			if(array[j] < array[min_idx])
	    			{
	    				min_idx = j;
	    			}
	    		}
	
	    		//Swap the found minimum element with the first element in unsorted array
	    		char temp = array[min_idx];
	    		array[min_idx] = array[i];
	    		array[i] = temp;
	    	}
    	}
    }
}