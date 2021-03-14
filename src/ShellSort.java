/*************************************************************************
 *  Shell Sort class.
 *
 *  @version 1.0 14/3/21
 *
 *  @author Brian Whelan
 *
 *************************************************************************/
public class ShellSort 
{
	/**
     * Don't let anyone instantiate this class.
     */
	private ShellSort() {}
	
	/**
     * Sort an array of integers using shell sort in ascending order.
     * 
     * @param array: an unsorted array of integers.
     */
    public static void sortInts(int[] array)
    {
    	if(array != null)
    	{
    		for(int gap = array.length/2; gap > 0; gap /= 2) 
    		{ 
    			for(int i = gap; i < array.length; i++) 
    			{ 
    				//Shift elements until correct array[i] position is found
    				int temp = array[i]; 
    				int j; 
    				for(j = i; (j >= gap) && (array[j - gap] > temp); j -= gap) 
    				{
    					array[j] = array[j - gap]; 
    				}
    				array[j] = temp; 
    			}
    		}
    	}
    }
    
	/**
     * Sort an array of doubles using shell sort in ascending order.
     * 
     * @param array: an unsorted array of doubles.
     */
    public static void sortDoubles(double[] array)
    {
    	if(array != null)
    	{
    		for(int gap = array.length/2; gap > 0; gap /= 2) 
    		{ 
    			for(int i = gap; i < array.length; i++) 
    			{ 
    				//Shift elements until correct array[i] position is found
    				double temp = array[i]; 
    				int j; 
    				for(j = i; (j >= gap) && (array[j - gap] > temp); j -= gap) 
    				{
    					array[j] = array[j - gap]; 
    				}
    				array[j] = temp; 
    			}
    		}
    	}
    }
    
	/**
     * Sort an array of characters using shell sort in alphabetical order.
     * 
     * @param array: an unsorted array of characters.
     */
    public static void sortChars(char[] array)
    {
    	if(array != null)
    	{
    		for(int gap = array.length/2; gap > 0; gap /= 2) 
    		{ 
    			for(int i = gap; i < array.length; i++) 
    			{ 
    				//Shift elements until correct array[i] position is found
    				char temp = array[i]; 
    				int j; 
    				for(j = i; (j >= gap) && (array[j - gap] > temp); j -= gap) 
    				{
    					array[j] = array[j - gap]; 
    				}
    				array[j] = temp; 
    			}
    		}
    	}
    }
}