/*************************************************************************
 *  {@code SelectionSort} class.
 *
 *  @version 25/7/21
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
     * Sorts the specified array of integers in ascending order using selection sort.
     * 
     * @param array the unsorted array of integers
     */
    public static void sortInts(int[] array)
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
                    if(array[j] < array[minIndex])
                    {
                        minIndex = j;
                    }
                }
	
                //Swaps the found minimum element with the first element in the unsorted part of the array
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
    	}
    }
    
    /**
     * Sorts the specified array of doubles in ascending order using selection sort.
     * 
     * @param array the unsorted array of doubles
     */
    public static void sortDoubles(double[] array)
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
                    if(array[j] < array[minIndex])
                    {
                        minIndex = j;
                    }
                }
	
                //Swaps the found minimum element with the first element in the unsorted part of the array
                double temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
    	}
    }
    
    /**
     * Sorts the specified array of characters in alphabetical order using selection sort.
     * 
     * @param array the unsorted array of characters
     */
    public static void sortChars(char[] array)
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
                    if(array[j] < array[minIndex])
                    {
                        minIndex = j;
                    }
                }
	
                //Swaps the found minimum element with the first element in the unsorted part of the array
                char temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
    	}
    }
}