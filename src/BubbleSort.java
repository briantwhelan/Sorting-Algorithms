/*************************************************************************
 *  Bubble Sort class.
 *
 *  @version 1.0 13/3/21
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
     * Sort an array of integers using bubble sort in ascending order.
     * 
     * @param array: an unsorted array of integers.
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
	                	
	                	//Swap array[j + 1] and array[j] 
	                    int temp = array[j]; 
	                    array[j] = array[j + 1]; 
	                    array[j + 1] = temp; 
	                }
	            }
	        }
    	}
    }
    
	/**
     * Sort an array of doubles using bubble sort in ascending order.
     * 
     * @param array: an unsorted array of doubles.
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
	                	
	                	//Swap array[j + 1] and array[j] 
	                    double temp = array[j]; 
	                    array[j] = array[j + 1]; 
	                    array[j + 1] = temp; 
	                }
	            }
	        }
    	}
    }
    
	/**
     * Sort an array of characters using bubble sort in alphabetical order.
     * 
     * @param array: an unsorted array of characters.
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
	                	
	                	//Swap array[j + 1] and array[j] 
	                    char temp = array[j]; 
	                    array[j] = array[j + 1]; 
	                    array[j + 1] = temp; 
	                }
	            }
	        }
    	}
    }
}