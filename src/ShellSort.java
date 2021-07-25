/*************************************************************************
 *  {@code ShellSort} class.
 *
 *  @version 25/7/21
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
     * Sorts the specified array of integers in ascending order using shell sort.
     * 
     * @param array the unsorted array of integers
     */
    public static void sortInts(int[] array)
    {
        if(array != null)
        {
            for(int gap = array.length/2; gap > 0; gap /= 2) 
            { 
                for(int i = gap; i < array.length; i++) 
                { 
                    //Shifts elements until the correct array[i] position is found
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
     * Sorts the specified array of doubles in ascending order using shell sort.
     * 
     * @param array the unsorted array of doubles
     */
    public static void sortDoubles(double[] array)
    {
        if(array != null)
        {
            for(int gap = array.length/2; gap > 0; gap /= 2) 
            { 
                for(int i = gap; i < array.length; i++) 
                { 
                    //Shifts elements until the correct array[i] position is found
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
     * Sorts the specified array of characters in alphabetical order using shell sort.
     * 
     * @param array the unsorted array of characters
     */
    public static void sortChars(char[] array)
    {
        if(array != null)
        {
            for(int gap = array.length/2; gap > 0; gap /= 2) 
            { 
                for(int i = gap; i < array.length; i++) 
                { 
                    //Shifts elements until the correct array[i] position is found
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