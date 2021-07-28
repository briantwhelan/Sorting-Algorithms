/*************************************************************************
 *  {@code ShellSort} class.
 *
 *  @version 28/7/21
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
     * Sorts the specified array in ascending order using shell sort.
     * 
     * @param array the unsorted array
     */
    public static void sort(Comparable[] array)
    {
        if(array != null)
        {
            for(int gap = array.length/2; gap > 0; gap /= 2) 
            { 
                for(int i = gap; i < array.length; i++) 
                { 
                    //Shifts elements until the correct array[i] position is found
                    Comparable temp = array[i]; 
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